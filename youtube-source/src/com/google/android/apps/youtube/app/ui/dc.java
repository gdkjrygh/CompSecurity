// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Dialog;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.d.a;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.o;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.StreamCorruptedException;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            YouTubeDialogFragment, dd

final class dc extends YouTubeDialogFragment
{

    private bj Y;
    private View Z;
    private ImageView aa;
    private TextView ab;
    private TextView ac;
    private TextView ad;
    private TextView ae;
    private Playlist af;

    private dc()
    {
    }

    dc(byte byte0)
    {
        this();
    }

    private Uri E()
    {
        if (af.sdThumbnailUri != null)
        {
            return af.sdThumbnailUri;
        }
        if (af.hqThumbnailUri != null)
        {
            return af.hqThumbnailUri;
        } else
        {
            return af.thumbnailUri;
        }
    }

    static View a(dc dc1)
    {
        return dc1.Z;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(l.aK, viewgroup, false);
        Z = layoutinflater.findViewById(j.fA);
        aa = (ImageView)layoutinflater.findViewById(j.fy);
        ab = (TextView)layoutinflater.findViewById(j.fF);
        ac = (TextView)layoutinflater.findViewById(j.ag);
        ad = (TextView)layoutinflater.findViewById(j.eK);
        ae = (TextView)layoutinflater.findViewById(j.aH);
        return layoutinflater;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        Y = ((YouTubeApplication)i().getApplicationContext()).d().aw();
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = super.c(bundle);
        bundle.getWindow().requestFeature(1);
        return bundle;
    }

    public final void d()
    {
        super.d();
        Bundle bundle = h();
        if (bundle == null || !bundle.containsKey("playlist"))
        {
            a();
        } else
        {
            byte abyte0[] = bundle.getByteArray("playlist");
            try
            {
                af = (Playlist)(new ObjectInputStream(new ByteArrayInputStream(abyte0))).readObject();
            }
            catch (StreamCorruptedException streamcorruptedexception)
            {
                a();
                return;
            }
            catch (IOException ioexception)
            {
                a();
                return;
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                a();
                return;
            }
            ab.setText(af.title);
            ac.setText(af.author);
            ad.setText(j().getQuantityString(o.j, af.size, new Object[] {
                Integer.valueOf(af.size)
            }));
            if (TextUtils.isEmpty(af.summary))
            {
                ae.setVisibility(8);
            } else
            {
                ae.setVisibility(0);
                ae.setText(af.summary);
            }
            if (E() != null)
            {
                com.google.android.apps.youtube.app.d.a.a(i(), Y, E(), aa, new dd(this));
                return;
            }
        }
    }
}
