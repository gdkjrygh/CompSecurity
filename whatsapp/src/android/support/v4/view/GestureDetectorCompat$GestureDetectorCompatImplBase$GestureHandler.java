// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package android.support.v4.view:
//            ViewPager

class this._cls0 extends Handler
{

    private static final String z;
    final z this$0;

    public void handleMessage(Message message)
    {
        boolean flag = ViewPager.a;
        int i = message.what;
        i;
        JVM INSTR tableswitch 1 3: default 36
    //                   1 67
    //                   2 91
    //                   3 103;
           goto _L1 _L2 _L3 _L4
_L1:
        try
        {
            throw new RuntimeException((new StringBuilder()).append(z).append(message).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            throw message;
        }
_L2:
        z(this._cls0.this)._mth0(this._mth0(this._cls0.this));
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        this._mth0(this._cls0.this);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        android.view.ureHandler urehandler = this._mth0(this._cls0.this);
        if (urehandler == null)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag1 = this._mth0(this._cls0.this);
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        this._mth0(this._cls0.this)._mth0(this._mth0(this._cls0.this));
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        this._mth0(this._cls0.this, true);
        if (flag) goto _L1; else goto _L5
_L5:
        return;
        message;
        try
        {
            throw message;
        }
        // Misplaced declaration of an exception variable
        catch (Message message) { }
        try
        {
            throw message;
        }
        // Misplaced declaration of an exception variable
        catch (Message message) { }
        try
        {
            throw message;
        }
        // Misplaced declaration of an exception variable
        catch (Message message) { }
        try
        {
            throw message;
        }
        // Misplaced declaration of an exception variable
        catch (Message message) { }
        try
        {
            throw message;
        }
        // Misplaced declaration of an exception variable
        catch (Message message) { }
        throw message;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = ">KV}^\034K\035~T\030V\\tTK".toCharArray();
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
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 49;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 107;
          goto _L8
_L3:
        byte0 = 37;
          goto _L8
_L4:
        byte0 = 61;
          goto _L8
        byte0 = 19;
          goto _L8
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }

    this._cls0(Handler handler)
    {
        this$0 = this._cls0.this;
        super(handler.getLooper());
    }
}
