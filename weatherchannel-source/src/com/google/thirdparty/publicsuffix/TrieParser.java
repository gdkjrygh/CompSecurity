// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.thirdparty.publicsuffix;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;

// Referenced classes of package com.google.thirdparty.publicsuffix:
//            PublicSuffixType

class TrieParser
{

    private static final Joiner PREFIX_JOINER = Joiner.on("");

    TrieParser()
    {
    }

    private static int doParseTrieToBuilder(List list, CharSequence charsequence, com.google.common.collect.ImmutableMap.Builder builder)
    {
        int k = charsequence.length();
        int i = 0;
        char c = '\0';
        do
        {
label0:
            {
                int j;
label1:
                {
                    char c1 = c;
                    if (i < k)
                    {
                        c = charsequence.charAt(i);
                        c1 = c;
                        if (c != '&')
                        {
                            c1 = c;
                            if (c != '?')
                            {
                                c1 = c;
                                if (c != '!')
                                {
                                    c1 = c;
                                    if (c != ':')
                                    {
                                        if (c != ',')
                                        {
                                            break label0;
                                        }
                                        c1 = c;
                                    }
                                }
                            }
                        }
                    }
                    list.add(0, reverse(charsequence.subSequence(0, i)));
                    if (c1 == '!' || c1 == '?' || c1 == ':' || c1 == ',')
                    {
                        String s = PREFIX_JOINER.join(list);
                        if (s.length() > 0)
                        {
                            builder.put(s, PublicSuffixType.fromCode(c1));
                        }
                    }
                    i++;
                    j = i;
                    if (c1 == '?')
                    {
                        break label1;
                    }
                    j = i;
                    if (c1 == ',')
                    {
                        break label1;
                    }
                    do
                    {
                        j = i;
                        if (i >= k)
                        {
                            break label1;
                        }
                        j = i + doParseTrieToBuilder(list, charsequence.subSequence(i, k), builder);
                        if (charsequence.charAt(j) == '?')
                        {
                            break;
                        }
                        i = j;
                    } while (charsequence.charAt(j) != ',');
                    j++;
                }
                list.remove(0);
                return j;
            }
            i++;
        } while (true);
    }

    static ImmutableMap parseTrie(CharSequence charsequence)
    {
        com.google.common.collect.ImmutableMap.Builder builder = ImmutableMap.builder();
        int j = charsequence.length();
        for (int i = 0; i < j; i += doParseTrieToBuilder(Lists.newLinkedList(), charsequence.subSequence(i, j), builder)) { }
        return builder.build();
    }

    private static CharSequence reverse(CharSequence charsequence)
    {
        int j = charsequence.length();
        if (j <= 1)
        {
            return charsequence;
        }
        char ac[] = new char[j];
        ac[0] = charsequence.charAt(j - 1);
        for (int i = 1; i < j; i++)
        {
            ac[i] = charsequence.charAt(j - 1 - i);
            if (Character.isSurrogatePair(ac[i], ac[i - 1]))
            {
                swap(ac, i - 1, i);
            }
        }

        return new String(ac);
    }

    private static void swap(char ac[], int i, int j)
    {
        char c = ac[i];
        ac[i] = ac[j];
        ac[j] = c;
    }

}
