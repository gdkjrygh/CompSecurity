// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;


// Referenced classes of package de.greenrobot.event:
//            b

final class f
{

    private static final String z[];
    private b a;
    private b b;

    f()
    {
    }

    b a()
    {
        this;
        JVM INSTR monitorenter ;
        b b1 = a;
        b b2 = a;
        if (b2 == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        a = a.a;
        if (a == null)
        {
            b = null;
        }
        this;
        JVM INSTR monitorexit ;
        return b1;
        Object obj;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    b a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            wait(i);
        }
        b b1 = a();
        this;
        JVM INSTR monitorexit ;
        return b1;
        Object obj;
        obj;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    void a(b b1)
    {
        this;
        JVM INSTR monitorenter ;
        if (b1 != null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        try
        {
            throw new NullPointerException(z[1]);
        }
        // Misplaced declaration of an exception variable
        catch (b b1) { }
        finally
        {
            this;
        }
        throw b1;
        throw b1;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        b.a = b1;
        b = b1;
_L1:
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        b1;
        throw b1;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        b = b1;
        a = b1;
          goto _L1
        b1;
        throw b1;
        throw new IllegalStateException(z[0]);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "21;\f&\n&?\033c\024 vHd\017 z\006iZ ;\001j";
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
                obj = "\024!6\004&\03154\006i\016t8\r&\037:+\035c\0171>";
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
        char c = obj[j];
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
        byte byte0 = 6;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 122;
          goto _L9
_L5:
        byte0 = 84;
          goto _L9
_L6:
        byte0 = 90;
          goto _L9
        byte0 = 104;
          goto _L9
    }
}
