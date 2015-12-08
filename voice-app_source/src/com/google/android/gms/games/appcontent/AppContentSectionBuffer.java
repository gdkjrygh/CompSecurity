// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentSectionRef, AppContentSection

public final class AppContentSectionBuffer extends zzf
{

    private final ArrayList zzaoD;

    public void release()
    {
        super.release();
        int j = zzaoD.size();
        for (int i = 1; i < j; i++)
        {
            DataHolder dataholder = (DataHolder)zzaoD.get(i);
            if (dataholder != null)
            {
                dataholder.close();
            }
        }

    }

    protected Object zzj(int i, int j)
    {
        return zzm(i, j);
    }

    protected AppContentSection zzm(int i, int j)
    {
        return new AppContentSectionRef(zzaoD, i, j);
    }

    protected String zzni()
    {
        return "section_id";
    }

    protected String zznk()
    {
        return "card_id";
    }
}
