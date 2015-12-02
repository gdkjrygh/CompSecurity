// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.View;

// Referenced classes of package android.support.v4.app:
//            FragmentContainer, Fragment

class this._cls0
    implements FragmentContainer
{

    private static final String z;
    final Fragment this$0;

    public View findViewById(int i)
    {
        try
        {
            if (mView == null)
            {
                throw new IllegalStateException(z);
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        return mView.findViewById(i);
    }

    public boolean hasView()
    {
        View view;
        try
        {
            view = mView;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        return view != null;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "c/z7\037@3op\026J8hp\034J);8\023S8;1RS4~'".toCharArray();
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
        byte byte0 = 114;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 37;
          goto _L8
_L3:
        byte0 = 93;
          goto _L8
_L4:
        byte0 = 27;
          goto _L8
        byte0 = 80;
          goto _L8
    }

    tainer()
    {
        this$0 = Fragment.this;
        super();
    }
}
