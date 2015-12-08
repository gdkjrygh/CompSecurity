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

    private List zzIZ;
    private String zzJa;
    private boolean zzJb;
    private Account zzJc;

    public  zzI(boolean flag)
    {
        zzJb = flag;
        return this;
    }

    public zzJb zza(Account account)
    {
        zzJc = account;
        return this;
    }

    public zzJc zza(DocumentSection documentsection)
    {
        if (zzIZ == null)
        {
            zzIZ = new ArrayList();
        }
        zzIZ.add(documentsection);
        return this;
    }

    public zzIZ zzbb(String s)
    {
        zzJa = s;
        return this;
    }

    public DocumentContents zzjC()
    {
        String s = zzJa;
        boolean flag = zzJb;
        Account account = zzJc;
        DocumentSection adocumentsection[];
        if (zzIZ != null)
        {
            adocumentsection = (DocumentSection[])zzIZ.toArray(new DocumentSection[zzIZ.size()]);
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
