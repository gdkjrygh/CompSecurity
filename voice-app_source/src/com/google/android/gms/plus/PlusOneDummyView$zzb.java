// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.google.android.gms.plus:
//            PlusOneDummyView

private static class <init>
    implements <init>
{

    private Context mContext;

    public Drawable getDrawable(int i)
    {
        Object obj;
        Resources resources;
        try
        {
            resources = mContext.createPackageContext("com.google.android.gms", 4).getResources();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        switch (i)
        {
        case 2: // '\002'
            obj = "ic_plusone_tall";
            break;

        default:
            obj = "ic_plusone_standard";
            break;

        case 0: // '\0'
            obj = "ic_plusone_small";
            break;

        case 1: // '\001'
            obj = "ic_plusone_medium";
            break;
        }
          goto _L1
_L3:
        return resources.getDrawable(resources.getIdentifier(((String) (obj)), "drawable", "com.google.android.gms"));
_L1:
        if (true) goto _L3; else goto _L2
_L2:
    }

    public boolean isValid()
    {
        try
        {
            mContext.createPackageContext("com.google.android.gms", 4).getResources();
        }
        catch (android.content.pm.tFoundException tfoundexception)
        {
            return false;
        }
        return true;
    }

    private eption(Context context)
    {
        mContext = context;
    }

    mContext(Context context, mContext mcontext)
    {
        this(context);
    }
}
