// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.TunesProvider;
import czj;
import dbf;
import dfe;
import dfp;
import egz;
import eha;
import eir;
import ejb;
import gjz;
import gkk;
import gmg;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.music:
//            MusicProviderChooserFragment

public class MusicProviderChooserActivity extends RiderActivity
{

    public chp h;
    public gmg i;

    public MusicProviderChooserActivity()
    {
    }

    public static Intent a(Context context, List list)
    {
        gjz.a(context);
        gjz.a(list);
        boolean flag;
        if (!list.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gjz.a(flag);
        return (new Intent(context, com/ubercab/client/feature/music/MusicProviderChooserActivity)).putParcelableArrayListExtra("com.ubercab.MUSIC_PROVIDERS", gkk.a(list));
    }

    private List a(List list)
    {
        ArrayList arraylist = new ArrayList();
        if (list == null || list.isEmpty())
        {
            return arraylist;
        }
        Set set = g();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            TunesProvider tunesprovider = (TunesProvider)list.next();
            if (set.contains(tunesprovider.getId()))
            {
                arraylist.add(tunesprovider);
            }
        } while (true);
        return arraylist;
    }

    private void a(eir eir1)
    {
        eir1.a(this);
    }

    private eir b(dfp dfp)
    {
        return egz.a().a(new dfe(this)).a(dfp).a();
    }

    private void f()
    {
        List list;
label0:
        {
            if (a(com/ubercab/client/feature/music/MusicProviderChooserFragment) == null)
            {
                list = a(getIntent().getParcelableArrayListExtra("com.ubercab.MUSIC_PROVIDERS"));
                if (!list.isEmpty())
                {
                    break label0;
                }
                setResult(0, (new Intent()).putExtra("com.ubercab.NO_TUNES_PROVIDERS", true));
                finish();
            }
            return;
        }
        a(0x7f0e01f3, MusicProviderChooserFragment.a(list), true);
    }

    private Set g()
    {
        HashSet hashset = new HashSet();
        if (i.a(dbf.bq))
        {
            hashset.add("spotify");
        }
        if (i.a(dbf.bp))
        {
            hashset.add("rdio");
        }
        return hashset;
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((eir)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f0300b9);
        b().a(0x7f0702c6);
        f();
    }

    public void onBackPressed()
    {
        h.a(n.bD);
        super.onBackPressed();
    }

    public void onMusicProviderSelectedEvent(ejb ejb1)
    {
        ejb1 = ejb1.a();
        setResult(-1, (new Intent()).putExtra("com.ubercab.TUNES_PROVIDER_SELECTED", ejb1));
        if (!"spotify".equals(ejb1.getId())) goto _L2; else goto _L1
_L1:
        h.a(n.bF);
_L4:
        finish();
        return;
_L2:
        if ("rdio".equals(ejb1.getId()))
        {
            h.a(n.bE);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final cic s()
    {
        return l.dl;
    }
}
