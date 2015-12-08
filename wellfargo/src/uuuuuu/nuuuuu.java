// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package uuuuuu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// Referenced classes of package uuuuuu:
//            uunuuu, nunuuu, unnuuu, uuunuu, 
//            nuunuu, ununuu, nnunuu, uunnuu, 
//            nunnuu, unnnuu, nnnnuu, nnuuuu, 
//            unuuuu

public class nuuuuu
{

    private static ArrayList b0417041704170417041704170417_java_util_ArrayList_static_fld;
    private static boolean b0417041704170417041704170417_boolean_static_fld = true;
    private static ArrayList b0417041704170417041704170417_java_util_ArrayList_static_fld;
    private static int b0417041704170417041704170417_int_static_fld = 102;

    public nuuuuu()
    {
    }

    private static void b0417041704170417041704170417()
    {
        b0417041704170417041704170417_java_util_ArrayList_static_fld = new ArrayList(7);
        b0417041704170417041704170417_java_util_ArrayList_static_fld = new ArrayList(4);
        b0417041704170417041704170417_java_util_ArrayList_static_fld.add(new uunuuu());
        b0417041704170417041704170417_java_util_ArrayList_static_fld.add(new nunuuu());
        b0417041704170417041704170417_java_util_ArrayList_static_fld.add(new unnuuu());
        b0417041704170417041704170417_java_util_ArrayList_static_fld.add(new uuunuu());
        b0417041704170417041704170417_java_util_ArrayList_static_fld.add(new nuunuu());
        b0417041704170417041704170417_java_util_ArrayList_static_fld.add(new ununuu());
        b0417041704170417041704170417_java_util_ArrayList_static_fld.add(new nnunuu());
        b0417041704170417041704170417_java_util_ArrayList_static_fld.add(new uunnuu());
        b0417041704170417041704170417_java_util_ArrayList_static_fld.add(new nunnuu());
        b0417041704170417041704170417_java_util_ArrayList_static_fld.add(new unnnuu());
        b0417041704170417041704170417_java_util_ArrayList_static_fld.add(new nnnnuu());
        Collections.shuffle(b0417041704170417041704170417_java_util_ArrayList_static_fld, new Random(b0417041704170417041704170417_int_static_fld));
        Collections.shuffle(b0417041704170417041704170417_java_util_ArrayList_static_fld, new Random(b0417041704170417041704170417_int_static_fld));
    }

    public static String b0417041704170417041704170417(String s, char c, char c1, char c2)
    {
        if (b0417041704170417041704170417_boolean_static_fld)
        {
            b0417041704170417041704170417();
            b0417041704170417041704170417_boolean_static_fld = false;
        }
        try
        {
            s = ((nnuuuu)b0417041704170417041704170417_java_util_ArrayList_static_fld.get(c2)).b0417041704170417041704170417(s, (new Character(c)).charValue(), (new Character(c1)).charValue());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return new String("");
        }
        return s;
    }

    public static void b0417041704170417041704170417(int i)
    {
        int j;
label0:
        {
            if (i <= 128)
            {
                j = i;
                if (i >= 0)
                {
                    break label0;
                }
            }
            j = 0;
        }
        b0417041704170417041704170417_int_static_fld = j;
    }

    public static String b0417041704170417041704170417(String s, char c, char c1)
    {
        if (b0417041704170417041704170417_boolean_static_fld)
        {
            b0417041704170417041704170417();
            b0417041704170417041704170417_boolean_static_fld = false;
        }
        try
        {
            s = ((unuuuu)b0417041704170417041704170417_java_util_ArrayList_static_fld.get(c1)).b0417041704170417041704170417(s, (new Character(c)).charValue());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return new String("");
        }
        return s;
    }

}
