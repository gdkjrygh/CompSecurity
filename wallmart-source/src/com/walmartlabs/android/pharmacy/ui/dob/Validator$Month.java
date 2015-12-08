// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy.ui.dob;


// Referenced classes of package com.walmartlabs.android.pharmacy.ui.dob:
//            Validator

public static class 
    implements Validator
{

    public  isValidInput(int ai[], int i, int j)
    {
        switch (i)
        {
        default:
            throw new IllegalStateException();

        case -1: 
            if (j == 0 || j == 1)
            {
                return .ACCEPT;
            } else
            {
                return .PAD;
            }

        case 0: // '\0'
        case 1: // '\001'
            i = ai[0] * 10 + j;
            break;
        }
        if (i > 0 && i <= 12)
        {
            return .ACCEPT;
        } else
        {
            return .REJECT;
        }
    }

    public ()
    {
    }
}
