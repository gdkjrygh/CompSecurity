// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy.ui.dob;


// Referenced classes of package com.walmartlabs.android.pharmacy.ui.dob:
//            Validator

public static class n
    implements Validator
{

    public n isValidInput(int ai[], int i, int j)
    {
label0:
        {
            boolean flag1 = true;
            switch (i)
            {
            default:
                return n.ACCEPT;

            case -1: 
                if (j == 1 || j == 2)
                {
                    return n.ACCEPT;
                } else
                {
                    return n.REJECT;
                }

            case 0: // '\0'
                break;
            }
            boolean flag;
            if (ai[i] == 1)
            {
                flag = flag1;
                if (j == 8)
                {
                    break label0;
                }
                flag = flag1;
                if (j == 9)
                {
                    break label0;
                }
            }
            if (ai[i] == 2 && j == 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        if (flag)
        {
            return n.ACCEPT;
        } else
        {
            return n.REJECT;
        }
    }

    public n()
    {
    }
}
