// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v4.widget:
//            SlidingPaneLayout

class z extends e
{

    private static final String z[];
    private Method mGetDisplayList;
    private Field mRecreateDisplayList;

    public void invalidateChildRegion(SlidingPaneLayout slidingpanelayout, View view)
    {
        if (mGetDisplayList == null) goto _L2; else goto _L1
_L1:
        Field field = mRecreateDisplayList;
        if (field == null) goto _L2; else goto _L3
_L3:
        mRecreateDisplayList.setBoolean(view, true);
        mGetDisplayList.invoke(view, (Object[])null);
_L4:
        super.invalidateChildRegion(slidingpanelayout, view);
        return;
        slidingpanelayout;
        throw slidingpanelayout;
        Exception exception;
        exception;
        Log.e(z[0], z[1], exception);
        if (SlidingPaneLayout.a == 0) goto _L4; else goto _L2
_L2:
        view.invalidate();
        return;
        slidingpanelayout;
        throw slidingpanelayout;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[8];
        obj = "\177ZLY{BQu\\|IzDD}YB";
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
                obj = "iDWR`\fD@[`IEMT|K\026ATa\\ZDD2@_VI2_BDIw";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "oYPQvB\021Q\035tIBFU2KSQy{_FI\\k`_VI2ASQU}H\r\005Y{A[LSu\fAJS5X\026RR`G\026WTuDB\013";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\177ZLY{BQu\\|IzDD}YB";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "KSQy{_FI\\k`_VI";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\177ZLY{BQu\\|IzDD}YB";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "Ad@^`IWQXVEEUQsUzLNf";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "oYPQvB\021Q\035tIBFU2Ad@^`IWQXVEEUQsUzLNf\fPLX~H\r\005Y{A[LSu\fALQ~\fT@\035a@YR\023";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 256
    //                   0 279
    //                   1 286
    //                   2 293
    //                   3 300;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_300;
_L3:
        byte byte1 = 18;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 44;
          goto _L9
_L5:
        byte1 = 54;
          goto _L9
_L6:
        byte1 = 37;
          goto _L9
        byte1 = 61;
          goto _L9
    }

    e()
    {
        try
        {
            mGetDisplayList = android/view/View.getDeclaredMethod(z[4], (Class[])null);
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            Log.e(z[5], z[2], nosuchmethodexception);
        }
        try
        {
            mRecreateDisplayList = android/view/View.getDeclaredField(z[6]);
            mRecreateDisplayList.setAccessible(true);
            return;
        }
        catch (NoSuchFieldException nosuchfieldexception)
        {
            Log.e(z[3], z[7], nosuchfieldexception);
        }
    }
}
