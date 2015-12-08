// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

// Referenced classes of package org.apache.commons.io:
//            IOCase

public class FilenameUtils
{

    public static final char EXTENSION_SEPARATOR = 46;
    public static final String EXTENSION_SEPARATOR_STR = Character.toString('.');
    private static final char OTHER_SEPARATOR;
    private static final char SYSTEM_SEPARATOR;
    private static final char UNIX_SEPARATOR = 47;
    private static final char WINDOWS_SEPARATOR = 92;

    public FilenameUtils()
    {
    }

    public static String concat(String s, String s1)
    {
        int i = getPrefixLength(s1);
        if (i >= 0)
        {
            if (i > 0)
            {
                return normalize(s1);
            }
            if (s != null)
            {
                int j = s.length();
                if (j == 0)
                {
                    return normalize(s1);
                }
                if (isSeparator(s.charAt(j - 1)))
                {
                    return normalize((new StringBuilder()).append(s).append(s1).toString());
                } else
                {
                    return normalize((new StringBuilder()).append(s).append('/').append(s1).toString());
                }
            }
        }
        return null;
    }

    public static boolean directoryContains(String s, String s1)
        throws IOException
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Directory must not be null");
        }
        while (s1 == null || IOCase.SYSTEM.checkEquals(s, s1)) 
        {
            return false;
        }
        return IOCase.SYSTEM.checkStartsWith(s1, s);
    }

    private static String doGetFullPath(String s, boolean flag)
    {
        String s1;
        if (s == null)
        {
            s1 = null;
        } else
        {
            int i = getPrefixLength(s);
            if (i < 0)
            {
                return null;
            }
            if (i >= s.length())
            {
                s1 = s;
                if (flag)
                {
                    return getPrefix(s);
                }
            } else
            {
                int j = indexOfLastSeparator(s);
                if (j < 0)
                {
                    return s.substring(0, i);
                }
                if (flag)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                j += i;
                i = j;
                if (j == 0)
                {
                    i = j + 1;
                }
                return s.substring(0, i);
            }
        }
        return s1;
    }

    private static String doGetPath(String s, int i)
    {
        int j;
        if (s != null)
        {
            if ((j = getPrefixLength(s)) >= 0)
            {
                int k = indexOfLastSeparator(s);
                i = k + i;
                if (j >= s.length() || k < 0 || j >= i)
                {
                    return "";
                } else
                {
                    return s.substring(j, i);
                }
            }
        }
        return null;
    }

    private static String doNormalize(String s, char c, boolean flag)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        String s1 = null;
_L4:
        return s1;
_L2:
        int j;
        j = s.length();
        s1 = s;
        if (j == 0) goto _L4; else goto _L3
_L3:
        char ac[];
        char c1;
        int i;
        int k1;
        int i2;
        i2 = getPrefixLength(s);
        if (i2 < 0)
        {
            return null;
        }
        ac = new char[j + 2];
        s.getChars(0, s.length(), ac, 0);
        if (c == SYSTEM_SEPARATOR)
        {
            c1 = OTHER_SEPARATOR;
        } else
        {
            c1 = SYSTEM_SEPARATOR;
        }
        for (i = 0; i < ac.length; i++)
        {
            if (ac[i] == c1)
            {
                ac[i] = c;
            }
        }

        c1 = '\001';
        i = j;
        if (ac[j - 1] != c)
        {
            ac[j] = c;
            c1 = '\0';
            i = j + 1;
        }
        int k;
        for (j = i2 + 1; j < i; i = k)
        {
            int j1 = j;
            k = i;
            if (ac[j] == c)
            {
                j1 = j;
                k = i;
                if (ac[j - 1] == c)
                {
                    System.arraycopy(ac, j, ac, j - 1, i - j);
                    k = i - 1;
                    j1 = j - 1;
                }
            }
            j = j1 + 1;
        }

        int l;
        for (j = i2 + 1; j < i; i = l)
        {
            boolean flag1;
            int l1;
label0:
            {
                l1 = j;
                flag1 = c1;
                l = i;
                if (ac[j] != c)
                {
                    break label0;
                }
                l1 = j;
                flag1 = c1;
                l = i;
                if (ac[j - 1] != '.')
                {
                    break label0;
                }
                if (j != i2 + 1)
                {
                    l1 = j;
                    flag1 = c1;
                    l = i;
                    if (ac[j - 2] != c)
                    {
                        break label0;
                    }
                }
                if (j == i - 1)
                {
                    c1 = '\001';
                }
                System.arraycopy(ac, j + 1, ac, j - 1, i - j);
                l = i - 2;
                l1 = j - 1;
                flag1 = c1;
            }
            j = l1 + 1;
            c1 = flag1;
        }

        j = i2 + 2;
        k1 = i;
        i = j;
_L15:
        int i1;
        boolean flag2;
        if (i >= k1)
        {
            break MISSING_BLOCK_LABEL_645;
        }
        i1 = i;
        flag2 = c1;
        j = k1;
        if (ac[i] != c) goto _L6; else goto _L5
_L5:
        i1 = i;
        flag2 = c1;
        j = k1;
        if (ac[i - 1] != '.') goto _L6; else goto _L7
_L7:
        i1 = i;
        flag2 = c1;
        j = k1;
        if (ac[i - 2] != '.') goto _L6; else goto _L8
_L8:
        if (i == i2 + 2) goto _L10; else goto _L9
_L9:
        i1 = i;
        flag2 = c1;
        j = k1;
        if (ac[i - 3] != c) goto _L6; else goto _L10
_L10:
        if (i == i2 + 2)
        {
            return null;
        }
        if (i == k1 - 1)
        {
            c1 = '\001';
        }
        j = i - 4;
_L13:
        if (j < i2)
        {
            break MISSING_BLOCK_LABEL_604;
        }
        if (ac[j] != c) goto _L12; else goto _L11
_L11:
        System.arraycopy(ac, i + 1, ac, j + 1, k1 - i);
        i = k1 - (i - j);
        i1 = j + 1;
        j = i;
        flag2 = c1;
_L6:
        i = i1 + 1;
        c1 = flag2;
        k1 = j;
        continue; /* Loop/switch isn't completed */
_L12:
        j--;
          goto _L13
        System.arraycopy(ac, i + 1, ac, i2, k1 - i);
        j = k1 - ((i + 1) - i2);
        i1 = i2 + 1;
        flag2 = c1;
          goto _L6
        if (k1 <= 0)
        {
            return "";
        }
        if (k1 <= i2)
        {
            return new String(ac, 0, k1);
        }
        if (c1 && flag)
        {
            return new String(ac, 0, k1);
        }
        return new String(ac, 0, k1 - 1);
        if (true) goto _L15; else goto _L14
_L14:
    }

    public static boolean equals(String s, String s1)
    {
        return equals(s, s1, false, IOCase.SENSITIVE);
    }

    public static boolean equals(String s, String s1, boolean flag, IOCase iocase)
    {
        String s2;
        String s3;
label0:
        {
            if (s == null || s1 == null)
            {
                return s == null && s1 == null;
            }
            s2 = s;
            s3 = s1;
            if (!flag)
            {
                break label0;
            }
            s2 = normalize(s);
            s = normalize(s1);
            if (s2 != null)
            {
                s3 = s;
                if (s != null)
                {
                    break label0;
                }
            }
            throw new NullPointerException("Error normalizing one or both of the file names");
        }
        s = iocase;
        if (iocase == null)
        {
            s = IOCase.SENSITIVE;
        }
        return s.checkEquals(s2, s3);
    }

    public static boolean equalsNormalized(String s, String s1)
    {
        return equals(s, s1, true, IOCase.SENSITIVE);
    }

    public static boolean equalsNormalizedOnSystem(String s, String s1)
    {
        return equals(s, s1, true, IOCase.SYSTEM);
    }

    public static boolean equalsOnSystem(String s, String s1)
    {
        return equals(s, s1, false, IOCase.SYSTEM);
    }

    public static String getBaseName(String s)
    {
        return removeExtension(getName(s));
    }

    public static String getExtension(String s)
    {
        if (s == null)
        {
            return null;
        }
        int i = indexOfExtension(s);
        if (i == -1)
        {
            return "";
        } else
        {
            return s.substring(i + 1);
        }
    }

    public static String getFullPath(String s)
    {
        return doGetFullPath(s, true);
    }

    public static String getFullPathNoEndSeparator(String s)
    {
        return doGetFullPath(s, false);
    }

    public static String getName(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return s.substring(indexOfLastSeparator(s) + 1);
        }
    }

    public static String getPath(String s)
    {
        return doGetPath(s, 1);
    }

    public static String getPathNoEndSeparator(String s)
    {
        return doGetPath(s, 0);
    }

    public static String getPrefix(String s)
    {
        int i;
        if (s != null)
        {
            if ((i = getPrefixLength(s)) >= 0)
            {
                if (i > s.length())
                {
                    return (new StringBuilder()).append(s).append('/').toString();
                } else
                {
                    return s.substring(0, i);
                }
            }
        }
        return null;
    }

    public static int getPrefixLength(String s)
    {
        byte byte0 = 1;
        if (s != null) goto _L2; else goto _L1
_L1:
        byte0 = -1;
_L4:
        return byte0;
_L2:
        char c;
        int k1;
        k1 = s.length();
        if (k1 == 0)
        {
            return 0;
        }
        c = s.charAt(0);
        if (c == ':')
        {
            return -1;
        }
        if (k1 != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (c == '~')
        {
            return 2;
        }
        if (!isSeparator(c))
        {
            return 0;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (c == '~')
        {
            int i1 = s.indexOf('/', 1);
            int k = s.indexOf('\\', 1);
            if (i1 == -1 && k == -1)
            {
                return k1 + 1;
            }
            int i = i1;
            if (i1 == -1)
            {
                i = k;
            }
            i1 = k;
            if (k == -1)
            {
                i1 = i;
            }
            return Math.min(i, i1) + 1;
        }
        char c1 = s.charAt(1);
        if (c1 == ':')
        {
            char c2 = Character.toUpperCase(c);
            if (c2 >= 'A' && c2 <= 'Z')
            {
                return k1 != 2 && isSeparator(s.charAt(2)) ? 3 : 2;
            } else
            {
                return -1;
            }
        }
        if (isSeparator(c) && isSeparator(c1))
        {
            int j1 = s.indexOf('/', 2);
            int l = s.indexOf('\\', 2);
            if (j1 == -1 && l == -1 || j1 == 2 || l == 2)
            {
                return -1;
            }
            int j = j1;
            if (j1 == -1)
            {
                j = l;
            }
            j1 = l;
            if (l == -1)
            {
                j1 = j;
            }
            return Math.min(j, j1) + 1;
        }
        if (!isSeparator(c))
        {
            return 0;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public static int indexOfExtension(String s)
    {
        if (s == null)
        {
            return -1;
        }
        int j = s.lastIndexOf('.');
        int i = j;
        if (indexOfLastSeparator(s) > j)
        {
            i = -1;
        }
        return i;
    }

    public static int indexOfLastSeparator(String s)
    {
        if (s == null)
        {
            return -1;
        } else
        {
            return Math.max(s.lastIndexOf('/'), s.lastIndexOf('\\'));
        }
    }

    public static boolean isExtension(String s, String s1)
    {
        if (s != null)
        {
            if (s1 == null || s1.length() == 0)
            {
                if (indexOfExtension(s) == -1)
                {
                    return true;
                }
            } else
            {
                return getExtension(s).equals(s1);
            }
        }
        return false;
    }

    public static boolean isExtension(String s, Collection collection)
    {
        boolean flag = true;
        if (s != null)
        {
            if (collection == null || collection.isEmpty())
            {
                if (indexOfExtension(s) != -1)
                {
                    flag = false;
                }
                return flag;
            }
            s = getExtension(s);
            collection = collection.iterator();
            while (collection.hasNext()) 
            {
                if (s.equals((String)collection.next()))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isExtension(String s, String as[])
    {
        boolean flag = true;
        if (s != null)
        {
            if (as == null || as.length == 0)
            {
                if (indexOfExtension(s) != -1)
                {
                    flag = false;
                }
                return flag;
            }
            s = getExtension(s);
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                if (s.equals(as[i]))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    private static boolean isSeparator(char c)
    {
        return c == '/' || c == '\\';
    }

    static boolean isSystemWindows()
    {
        return SYSTEM_SEPARATOR == '\\';
    }

    public static String normalize(String s)
    {
        return doNormalize(s, SYSTEM_SEPARATOR, true);
    }

    public static String normalize(String s, boolean flag)
    {
        char c;
        if (flag)
        {
            c = '/';
        } else
        {
            c = '\\';
        }
        return doNormalize(s, c, true);
    }

    public static String normalizeNoEndSeparator(String s)
    {
        return doNormalize(s, SYSTEM_SEPARATOR, false);
    }

    public static String normalizeNoEndSeparator(String s, boolean flag)
    {
        char c;
        if (flag)
        {
            c = '/';
        } else
        {
            c = '\\';
        }
        return doNormalize(s, c, false);
    }

    public static String removeExtension(String s)
    {
        String s1;
        if (s == null)
        {
            s1 = null;
        } else
        {
            int i = indexOfExtension(s);
            s1 = s;
            if (i != -1)
            {
                return s.substring(0, i);
            }
        }
        return s1;
    }

    public static String separatorsToSystem(String s)
    {
        if (s == null)
        {
            return null;
        }
        if (isSystemWindows())
        {
            return separatorsToWindows(s);
        } else
        {
            return separatorsToUnix(s);
        }
    }

    public static String separatorsToUnix(String s)
    {
        if (s == null || s.indexOf('\\') == -1)
        {
            return s;
        } else
        {
            return s.replace('\\', '/');
        }
    }

    public static String separatorsToWindows(String s)
    {
        if (s == null || s.indexOf('/') == -1)
        {
            return s;
        } else
        {
            return s.replace('/', '\\');
        }
    }

    static String[] splitOnTokens(String s)
    {
        if (s.indexOf('?') == -1 && s.indexOf('*') == -1)
        {
            return (new String[] {
                s
            });
        }
        s = s.toCharArray();
        ArrayList arraylist = new ArrayList();
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
        while (i < s.length) 
        {
            if (s[i] == '?' || s[i] == '*')
            {
                if (stringbuilder.length() != 0)
                {
                    arraylist.add(stringbuilder.toString());
                    stringbuilder.setLength(0);
                }
                if (s[i] == '?')
                {
                    arraylist.add("?");
                } else
                if (arraylist.isEmpty() || i > 0 && !((String)arraylist.get(arraylist.size() - 1)).equals("*"))
                {
                    arraylist.add("*");
                }
            } else
            {
                stringbuilder.append(s[i]);
            }
            i++;
        }
        if (stringbuilder.length() != 0)
        {
            arraylist.add(stringbuilder.toString());
        }
        return (String[])arraylist.toArray(new String[arraylist.size()]);
    }

    public static boolean wildcardMatch(String s, String s1)
    {
        return wildcardMatch(s, s1, IOCase.SENSITIVE);
    }

    public static boolean wildcardMatch(String s, String s1, IOCase iocase)
    {
        if (s != null || s1 != null) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        IOCase iocase1;
        int i;
        int k;
        boolean flag;
        if (s == null || s1 == null)
        {
            return false;
        }
        iocase1 = iocase;
        if (iocase == null)
        {
            iocase1 = IOCase.SENSITIVE;
        }
        s1 = splitOnTokens(s1);
        flag = false;
        i = 0;
        k = 0;
        iocase = new Stack();
_L10:
        if (iocase.size() > 0)
        {
            int ai[] = (int[])iocase.pop();
            k = ai[0];
            i = ai[1];
            flag = true;
        }
_L11:
        int j = i;
        if (k >= s1.length) goto _L4; else goto _L3
_L3:
        if (!s1[k].equals("?")) goto _L6; else goto _L5
_L5:
        i++;
        if (i <= s.length()) goto _L8; else goto _L7
_L7:
        j = i;
_L4:
        if (k == s1.length && j == s.length()) goto _L1; else goto _L9
_L9:
        i = j;
        if (iocase.size() <= 0)
        {
            return false;
        }
          goto _L10
_L8:
        j = 0;
_L12:
        k++;
        flag = j;
          goto _L11
_L6:
label0:
        {
            if (!s1[k].equals("*"))
            {
                break label0;
            }
            flag = true;
            j = ((flag) ? 1 : 0);
            if (k == s1.length - 1)
            {
                i = s.length();
                j = ((flag) ? 1 : 0);
            }
        }
          goto _L12
        if (!flag) goto _L14; else goto _L13
_L13:
        i = iocase1.checkIndexOf(s, i, s1[k]);
        j = i;
        if (i == -1) goto _L4; else goto _L15
_L15:
        int l = iocase1.checkIndexOf(s, i + 1, s1[k]);
        j = i;
        if (l >= 0)
        {
            iocase.push(new int[] {
                k, l
            });
            j = i;
        }
_L17:
        i = j + s1[k].length();
        j = 0;
          goto _L12
_L14:
        j = i;
        if (iocase1.checkRegionMatches(s, i, s1[k])) goto _L17; else goto _L16
_L16:
        j = i;
          goto _L4
    }

    public static boolean wildcardMatchOnSystem(String s, String s1)
    {
        return wildcardMatch(s, s1, IOCase.SYSTEM);
    }

    static 
    {
        SYSTEM_SEPARATOR = File.separatorChar;
        if (isSystemWindows())
        {
            OTHER_SEPARATOR = '/';
        } else
        {
            OTHER_SEPARATOR = '\\';
        }
    }
}
