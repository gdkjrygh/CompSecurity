// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems;

import java.text.ParseException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package org.whispersystems:
//            at, aa, R

public class b7
{

    private static final String z[];
    private final SecretKeySpec a;
    private final IvParameterSpec b;
    private final SecretKeySpec c;

    public b7(byte abyte0[])
    {
        boolean flag = false;
        boolean flag1 = at.a;
        super();
        try
        {
            abyte0 = aa.a(abyte0, 32, 32, 16);
            a = new SecretKeySpec(abyte0[0], z[0]);
            c = new SecretKeySpec(abyte0[1], z[1]);
            b = new IvParameterSpec(abyte0[2]);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new AssertionError(abyte0);
        }
        if (flag1)
        {
            boolean flag2;
            try
            {
                flag2 = R.A;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            if (!flag2)
            {
                flag = true;
            }
            R.A = flag;
        }
    }

    public IvParameterSpec a()
    {
        return b;
    }

    public SecretKeySpec b()
    {
        return c;
    }

    public SecretKeySpec c()
    {
        return a;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "t\004n";
        byte1 = -1;
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
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                obj = "},\\\016y}\000\017X\034";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 42;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 53;
          goto _L9
_L5:
        byte0 = 65;
          goto _L9
_L6:
        byte0 = 61;
          goto _L9
        byte0 = 109;
          goto _L9
    }
}
