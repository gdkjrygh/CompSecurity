// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;


// Referenced classes of package android.support.v4.util:
//            LruCache

public class DebugUtils
{

    private static final String z;

    public static void buildShortClassTag(Object obj, StringBuilder stringbuilder)
    {
label0:
        {
            String s;
label1:
            {
                if (obj == null)
                {
                    stringbuilder.append(z);
                    if (!LruCache.a)
                    {
                        break label0;
                    }
                }
                String s1 = obj.getClass().getSimpleName();
                if (s1 != null)
                {
                    s = s1;
                    if (s1.length() > 0)
                    {
                        break label1;
                    }
                }
                s1 = obj.getClass().getName();
                int i = s1.lastIndexOf('.');
                s = s1;
                if (i > 0)
                {
                    s = s1.substring(i + 1);
                }
            }
            stringbuilder.append(s);
            stringbuilder.append('{');
            stringbuilder.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "PVmh".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 16;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 62;
          goto _L8
_L3:
        byte0 = 35;
          goto _L8
_L4:
        byte0 = 1;
          goto _L8
        byte0 = 4;
          goto _L8
    }
}
