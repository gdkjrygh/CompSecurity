// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import cev;
import cgh;
import cgt;
import chc;
import chp;
import cic;
import com.ubercab.client.core.model.Group;
import com.ubercab.client.core.model.Image;
import com.ubercab.client.core.model.Playlist;
import com.ubercab.client.core.model.TunesProvider;
import com.ubercab.client.core.ui.RiderGridView;
import czb;
import czj;
import dbf;
import dfp;
import djb;
import ehl;
import ehm;
import ejh;
import ejl;
import ejr;
import ekf;
import eki;
import gmg;
import java.util.ArrayList;
import java.util.List;
import n;

// Referenced classes of package com.ubercab.client.feature.music:
//            PlayableItemGridAdapter, MusicProviderAuthorizationActivity

public class PlayableItemGridFragment extends ejl
{

    public chp c;
    public gmg d;
    private PlayableItemGridAdapter h;
    private chc i;
    private TunesProvider j;
    RiderGridView mGridView;
    ImageView mImageViewHeader;
    TextView mTextViewHeaderName;
    TextView mTextViewHeaderTrackCount;
    ViewGroup mViewGroupHeader;

    public PlayableItemGridFragment()
    {
    }

    public static PlayableItemGridFragment a(Group group, TunesProvider tunesprovider)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_group", group);
        bundle.putParcelable("extra_tunes_provider", tunesprovider);
        group = new PlayableItemGridFragment();
        group.setArguments(bundle);
        return group;
    }

    private void a(int k)
    {
        String s = null;
        Object obj = (Group)getArguments().getParcelable("extra_group");
        if (obj == null || ((Group) (obj)).getPlaylistsCount() == 0 && ((Group) (obj)).getGroupsCount() == 0)
        {
            return;
        }
        if (((Group) (obj)).getGroupsCount() != 0)
        {
            obj = (Group)((Group) (obj)).getGroups().get(0);
            mTextViewHeaderName.setText(((Group) (obj)).getName());
            b(((Group) (obj)).getPlaylistsCount());
            obj = ((Group) (obj)).getImages();
            if (obj != null && !((List) (obj)).isEmpty())
            {
                obj = (Image)((List) (obj)).get(0);
            } else
            {
                obj = null;
            }
            if (obj != null)
            {
                obj = ((Image) (obj)).getUrl();
            } else
            {
                obj = null;
            }
            a(((String) (obj)), k);
            return;
        }
        obj = (Playlist)((Group) (obj)).getPlaylists().get(0);
        mTextViewHeaderName.setText(((Playlist) (obj)).getName());
        b(((Playlist) (obj)).getTracksCount());
        obj = ((Playlist) (obj)).getImages();
        if (obj != null && !((List) (obj)).isEmpty())
        {
            obj = (Image)((List) (obj)).get(0);
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            s = ((Image) (obj)).getUrl();
        }
        a(s, k);
    }

    private void a(LayoutInflater layoutinflater, int k)
    {
        Object obj1 = (Group)getArguments().getParcelable("extra_group");
        if (obj1 == null)
        {
            return;
        }
        Object obj = ((Group) (obj1)).getPlaylists();
        if (((List) (obj)).size() <= 1)
        {
            obj = new ArrayList();
        } else
        {
            obj = ((List) (obj)).subList(1, ((List) (obj)).size());
        }
        obj1 = ((Group) (obj1)).getGroups();
        if (((List) (obj1)).size() <= 1)
        {
            obj1 = new ArrayList();
        } else
        {
            obj1 = ((List) (obj1)).subList(1, ((List) (obj1)).size());
        }
        h = new PlayableItemGridAdapter(k, layoutinflater, g, i, ((List) (obj)), ((List) (obj1)));
        mGridView.setAdapter(h);
    }

    static void a(PlayableItemGridFragment playableitemgridfragment)
    {
        playableitemgridfragment.b();
    }

    static void a(PlayableItemGridFragment playableitemgridfragment, int k)
    {
        playableitemgridfragment.a(k);
    }

    static void a(PlayableItemGridFragment playableitemgridfragment, LayoutInflater layoutinflater, int k)
    {
        playableitemgridfragment.a(layoutinflater, k);
    }

    private void a(ejh ejh1)
    {
        ejh1.a(this);
    }

    private void a(String s, int k)
    {
        g.a(s).b(mGridView.getWidth(), k).c().a(i).a(mImageViewHeader);
    }

    private ejh b(dfp dfp)
    {
        return ehl.a().a(new djb(this)).a(dfp).a();
    }

    private void b()
    {
        if (mViewGroupHeader != null)
        {
            mGridView.c(mViewGroupHeader);
            ((ViewManager)mViewGroupHeader.getParent()).removeView(mViewGroupHeader);
            mGridView.a(mViewGroupHeader);
        }
    }

    private void b(int k)
    {
        if (k > 0)
        {
            mTextViewHeaderTrackCount.setText(Integer.toString(k));
            mTextViewHeaderTrackCount.setVisibility(0);
            return;
        } else
        {
            mTextViewHeaderTrackCount.setVisibility(8);
            return;
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((ejh)czj);
    }

    public final cic f()
    {
        return czb.a;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        i = new ejr(getResources().getDimensionPixelSize(0x7f0800f8));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = (ViewGroup)layoutinflater.inflate(0x7f0300b7, viewgroup, false);
        ButterKnife.inject(this, viewgroup);
        e = layoutinflater.inflate(0x7f0300c1, mGridView, false);
        mGridView.b(e);
        mGridView.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener(layoutinflater) {

            final LayoutInflater a;
            final PlayableItemGridFragment b;

            private int a()
            {
                return b() / 2 - b.getResources().getDimensionPixelSize(0x7f08007c) / 2;
            }

            private int b()
            {
                return b.mGridView.getWidth();
            }

            public final void onLayoutChange(View view, int k, int l, int i1, int j1, int k1, int l1, 
                    int i2, int j2)
            {
                if (i1 - k <= 0)
                {
                    return;
                } else
                {
                    k = a();
                    PlayableItemGridFragment.a(b, a, k);
                    b.mImageViewHeader.getLayoutParams().height = k;
                    b.mImageViewHeader.requestLayout();
                    PlayableItemGridFragment.a(b);
                    PlayableItemGridFragment.a(b, k);
                    b.mGridView.removeOnLayoutChangeListener(this);
                    return;
                }
            }

            
            {
                b = PlayableItemGridFragment.this;
                a = layoutinflater;
                super();
            }
        });
        return viewgroup;
    }

    public volatile void onDestroy()
    {
        super.onDestroy();
    }

    public void onGridItemClick(int k)
    {
        c.a(n.bx);
        if (j.getLinked() == null || j.getLinked().booleanValue() || !"rdio".equals(j.getId())) goto _L2; else goto _L1
_L1:
        android.content.Intent intent = MusicProviderAuthorizationActivity.a(getContext(), j);
        getActivity().startActivityForResult(intent, 127);
_L7:
        return;
_L2:
        if (k != 0) goto _L4; else goto _L3
_L3:
        Group group = (Group)getArguments().getParcelable("extra_group");
        if (group == null) goto _L6; else goto _L5
_L5:
        Object obj;
        obj = group;
        if (d.a(dbf.bo))
        {
            obj = group;
            if (group.getGroupsCount() > 0)
            {
                obj = (Group)group.getGroups().get(0);
            }
        }
        obj = ((Group) (obj)).getPlaylists();
        if (((List) (obj)).size() <= 0)
        {
            break MISSING_BLOCK_LABEL_333;
        }
        obj = (Playlist)((List) (obj)).get(0);
_L8:
        if (obj != null)
        {
            if (d.a(dbf.bo) && "station".equals(((Playlist) (obj)).getType()))
            {
                f.c(new eki(((Playlist) (obj)).getName(), ((Playlist) (obj)).getPlaybackUri()));
                return;
            } else
            {
                f.c(new ekf(((Playlist) (obj)).getKey(), ((Playlist) (obj)).getName(), ((Playlist) (obj)).getPlaybackUri()));
                return;
            }
        }
_L6:
        if (true) goto _L7; else goto _L4
_L4:
        if (k < 2)
        {
            break MISSING_BLOCK_LABEL_333;
        }
        k -= 2;
        if (h.a(k) != com/ubercab/client/core/model/Playlist)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (Playlist)h.getItem(k);
          goto _L8
        if (!d.a(dbf.bo)) goto _L10; else goto _L9
_L9:
        break MISSING_BLOCK_LABEL_259;
_L10:
        break; /* Loop/switch isn't completed */
        obj = (Group)h.getItem(k);
        if (obj == null || ((Group) (obj)).getPlaylists() == null || ((Group) (obj)).getPlaylistsCount() <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (Playlist)((Group) (obj)).getPlaylists().get(0);
          goto _L8
        obj = null;
          goto _L8
    }

    public void onResume()
    {
        super.onResume();
        View view = e;
        byte byte0;
        if (a())
        {
            byte0 = 4;
        } else
        {
            byte0 = 8;
        }
        view.setVisibility(byte0);
        if (j == null)
        {
            j = (TunesProvider)getArguments().getParcelable("extra_tunes_provider");
        }
    }
}
