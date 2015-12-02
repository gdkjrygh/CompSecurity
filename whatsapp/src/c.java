// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.whatsapp.DialogToastActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class c
{

    public static int g;
    private static final String z[];
    public String a;
    public String b;
    public List c;
    public Set d;
    public Set e;
    public byte f[];

    public c()
    {
        b = "";
        a = "";
        c = new ArrayList();
        e = new HashSet();
        d = new HashSet();
    }

    public void a(String s)
    {
        e.add(s.toUpperCase());
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof c)
        {
            obj = (c)obj;
            if (b != null && b.equals(((c) (obj)).b) && e.equals(((c) (obj)).e) && d.equals(((c) (obj)).d))
            {
                if (f != null && Arrays.equals(f, ((c) (obj)).f))
                {
                    return true;
                }
                if (a.equals(((c) (obj)).a) && (c.equals(((c) (obj)).c) || c.size() == 1 || ((c) (obj)).c.size() == 1))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString()
    {
        int i = g;
        Object obj = new StringBuilder();
        ((StringBuilder) (obj)).append(z[4]);
        ((StringBuilder) (obj)).append(b);
        ((StringBuilder) (obj)).append(z[2]);
        ((StringBuilder) (obj)).append(z[5]);
        ((StringBuilder) (obj)).append(e.toString());
        ((StringBuilder) (obj)).append(z[6]);
        ((StringBuilder) (obj)).append(d.toString());
        if (c != null && c.size() > 1)
        {
            ((StringBuilder) (obj)).append(z[1]);
            ((StringBuilder) (obj)).append(c.size());
        }
        if (f != null)
        {
            ((StringBuilder) (obj)).append(z[0]);
            ((StringBuilder) (obj)).append(f.length);
        }
        ((StringBuilder) (obj)).append(z[3]);
        ((StringBuilder) (obj)).append(a);
        obj = ((StringBuilder) (obj)).toString();
        if (i != 0)
        {
            DialogToastActivity.g++;
        }
        return ((String) (obj));
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[7];
        obj = "aP9\020'=&(\016=(/+\033<(\003i\021!7\025sB";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "aP9\020'=&(\016=(/?\007+9\037;B;$\n,Xh";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "aP9\003:,\035\004\0038wP";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "aP9\020'=&(\016=(Ji";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "=\002&\022\006,\035,Xh";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "aP9\020'=\035\004\0038\022$\0202\rwP";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "aP9\020'=7;\r==#,\026rm";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 236
    //                   0 259
    //                   1 266
    //                   2 273
    //                   3 280;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_280;
_L3:
        byte byte1 = 72;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 77;
          goto _L9
_L5:
        byte1 = 112;
          goto _L9
_L6:
        byte1 = 73;
          goto _L9
        byte1 = 98;
          goto _L9
    }
}
