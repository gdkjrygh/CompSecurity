// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            DocumentContents, DocumentSection

public static class 
{

    private List zzMV;
    private String zzMW;
    private boolean zzMX;
    private Account zzMY;

    public  zzI(boolean flag)
    {
        zzMX = flag;
        return this;
    }

    public zzMX zza(Account account)
    {
        zzMY = account;
        return this;
    }

    public zzMY zza(DocumentSection documentsection)
    {
        if (zzMV == null)
        {
            zzMV = new ArrayList();
        }
        zzMV.add(documentsection);
        return this;
    }

    public zzMV zzbp(String s)
    {
        zzMW = s;
        return this;
    }

    public DocumentContents zzkJ()
    {
        String s = zzMW;
        boolean flag = zzMX;
        Account account = zzMY;
        DocumentSection adocumentsection[];
        if (zzMV != null)
        {
            adocumentsection = (DocumentSection[])zzMV.toArray(new DocumentSection[zzMV.size()]);
        } else
        {
            adocumentsection = null;
        }
        return new DocumentContents(s, flag, account, adocumentsection);
    }

    public ()
    {
    }
}
