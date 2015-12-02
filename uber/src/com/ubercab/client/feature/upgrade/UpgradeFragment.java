// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.upgrade;

import android.app.Dialog;
import android.app.DownloadManager;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.FragmentActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import butterknife.ButterKnife;
import cic;
import com.ubercab.client.core.model.ParcelableUpgrade;
import com.ubercab.rider.realtime.model.Upgrade;
import com.ubercab.ui.TextView;
import cyz;
import czf;
import czj;
import dfp;
import diw;
import ghx;
import ghy;
import ghz;
import gib;
import java.io.File;

// Referenced classes of package com.ubercab.client.feature.upgrade:
//            UpgradeDownloadReceiver

public class UpgradeFragment extends cyz
{

    public static final String a = com/ubercab/client/feature/upgrade/UpgradeFragment.getName();
    public czf b;
    private Upgrade c;
    private DownloadManager d;
    TextView mTextViewChangelog;
    TextView mTextViewTitle;

    public UpgradeFragment()
    {
    }

    public static UpgradeFragment a(ParcelableUpgrade parcelableupgrade)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("upgrade", parcelableupgrade);
        parcelableupgrade = new UpgradeFragment();
        parcelableupgrade.setArguments(bundle);
        return parcelableupgrade;
    }

    private void a(ghz ghz1)
    {
        ghz1.a(this);
    }

    private ghz b(dfp dfp)
    {
        return ghx.a().a(new diw(this)).a(dfp).a();
    }

    private void d()
    {
        Object obj = Uri.parse(c.getDownloadURL());
        Uri uri = Uri.fromFile(getActivity().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS));
        obj = new android.app.DownloadManager.Request(((Uri) (obj)));
        ((android.app.DownloadManager.Request) (obj)).setNotificationVisibility(0);
        ((android.app.DownloadManager.Request) (obj)).setDestinationUri(uri);
        long l = d.enqueue(((android.app.DownloadManager.Request) (obj)));
        getActivity().registerReceiver(new UpgradeDownloadReceiver(l), new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
        Toast.makeText(getActivity(), getString(0x7f070449), 1).show();
        getDialog().dismiss();
        b.g(c.getDownloadURL());
    }

    private void e()
    {
        Object obj = (new android.app.DownloadManager.Query()).setFilterByStatus(8);
        for (obj = d.query(((android.app.DownloadManager.Query) (obj))); ((Cursor) (obj)).moveToNext();)
        {
            if (((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("uri")).equals(b.y()))
            {
                obj = new File(((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("local_filename")));
                gib.a(getActivity(), Uri.fromFile(((File) (obj))));
                return;
            }
        }

        d();
    }

    public final cic a()
    {
        return cyz.e;
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((ghz)czj);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        c = (Upgrade)getArguments().getParcelable("upgrade");
        d = (DownloadManager)getActivity().getSystemService("download");
        setStyle(1, 0x7f09017d);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03020f, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        mTextViewTitle.setText((new StringBuilder()).append(getString(0x7f070060)).append(" - ").append(c.getVersion()).toString());
        mTextViewChangelog.setText(Html.fromHtml(c.getReleaseNotesHTML()), android.widget.TextView.BufferType.SPANNABLE);
        mTextViewChangelog.setLineSpacing(0.0F, 1.25F);
        mTextViewChangelog.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void skipTapped()
    {
        getDialog().dismiss();
    }

    public void updateTapped()
    {
        if (c.getDownloadURL().equals(b.y()))
        {
            e();
            return;
        } else
        {
            d();
            return;
        }
    }

}
