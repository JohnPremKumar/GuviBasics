using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution
{
    static void Main(String[] args)
    {
            Console.ReadLine();
            string[] patterns = Console.ReadLine().Split(' ');
            int[] values = Array.ConvertAll(Console.ReadLine().Split(' '), Int32.Parse);
            var trie = MakeTrie(patterns, values);
            int s = Convert.ToInt32(Console.ReadLine());
            ulong max = ulong.MinValue;
            ulong min = ulong.MaxValue;
            for (int a = 0; a < s; a++)
            {
                string str = Console.ReadLine();
                if (str == null)
                    continue;
                string[] tokens = str.Split(' ');
                int first = Convert.ToInt32(tokens[0]);
                int last = Convert.ToInt32(tokens[1]);
                string d = tokens[2];
                ulong val = GetValue(trie, d, first, last);
                if (val > max) max = val;
                if (val < min) min = val;
            }

            Console.WriteLine("{0} {1}", min, max); 
    }

    private static Trie MakeTrie(string[] patterns, int[] values)
    {
        var trie = new Trie();
        int index = 0;
        foreach (var item in patterns)
        {
            trie.AddWord(item, index, values[index++]);
        }

        return trie;
    }

    private static ulong GetValue(Trie t, string d, int first, int last)
    {
        Node runner;
        ulong total = 0;
        var index = new List<int>();
        var value = new List<int>();
        bool isEndOfWord = false;
        for (int i = 0; i < d.Length; ++i)
        {
            runner = t.GetHeadNode();
            isEndOfWord = false;
            for (int j = 0; j + i < d.Length; ++j)
            {
                runner = t.FindNextLetter(d[i + j], ref isEndOfWord, ref index, ref value, runner);
                if (runner == null) break;
                if (isEndOfWord)
                {
                    isEndOfWord = false;
                    for (int k = 0; k < index.Count; k++)
                    {
                        if (index[k] >= first && index[k] <= last)
                            total += (ulong)value[k]; 
                    }
                }

            }
        }

        return total;
    }

    
}

public class Trie
{
    Node head;
    public Trie()
    {
        this.head = new Node();
    }

    public Node GetHeadNode()
    {
        return head;
    }

    public void AddWord(string word, int index, int value)
    {
        Node runner = head;
        for(int i = 0; i < word.Length; ++i)
        {
            runner = runner.AddLetter(word[i]);
        }

        runner.SetIsEndOfWord();
        runner.SetIndex(index);
        runner.SetValue(value);
    }

    public Node FindNextLetter(char letter, ref bool IsEndOfWord, ref List<int> Index, ref List<int> Value, Node node)
    {
        if (node == null) return null;
        Node curr = node.GetLetter(letter);
        if (curr == null) return null;
        if (curr.IsEndOfWord)
        {
            Index = curr.Index;
            Value = curr.Value;
            IsEndOfWord = true;
        }

        return curr;
    }
}

public class Node
{
    Node[] letters;

    public Node(char c)
    {
        CurrentChar = c;
        if(letters == null)
            letters = new Node[26];
    }

    public Node()
    {
        CurrentChar = null;
        if (letters == null) 
            letters = new Node[26];
    }

    public List<int> Index { get; private set; }
    public bool IsEndOfWord { get; private set; }
    public char? CurrentChar { get; private set; }
    public List<int> Value { get; private set; }

    public Node AddLetter(char c)
    {
        if (letters[c - 'a'] == null)
        {
            letters[c - 'a'] = new Node(c);
        }

        return letters[c - 'a'];
    }

    public Node GetLetter(char c)
    {
        return letters[c - 'a'];
    }

    public void SetIndex(int i)
    {
        if (Index == null) Index = new List<int>();
        Index.Add(i);
    }

    public void SetValue(int i)
    {
        if (Value == null) Value = new List<int>();
        Value.Add(i);
    }

    public void SetIsEndOfWord()
    {
        IsEndOfWord = true;
    }
}
