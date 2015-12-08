// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.core.ui.SubtitleWindowView;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleWindowSettings;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleWindowSnapshot;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitlesStyle;
import com.google.android.youtube.g;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            be, SubtitlesPreferences

public class DefaultSubtitlesOverlay extends ViewGroup
    implements be
{

    private final SparseArray a = new SparseArray();
    private final SparseArray b = new SparseArray();
    private float c;
    private float d;
    private SubtitlesStyle e;

    public DefaultSubtitlesOverlay(Context context)
    {
        super(context);
        d = context.getResources().getDimensionPixelSize(g.Q);
        e = new SubtitlesStyle(SubtitlesPreferences.SubtitlesColor.getDefaultBackgroundColorValue(), SubtitlesPreferences.SubtitlesColor.getDefaultWindowColorValue(), SubtitlesPreferences.SubtitlesColor.getDefaultEdgeColorValue(), SubtitlesPreferences.SubtitlesEdgeType.getDefaultEdgeTypeValue(), SubtitlesPreferences.SubtitlesColor.getDefaultTextColorValue(), SubtitlesPreferences.SubtitlesFont.getDefaultFontValue());
        setVisibility(4);
    }

    private void a(int i, int j)
    {
        d = SubtitlesPreferences.a(getContext(), c, i, j);
        for (i = 0; i < b.size(); i++)
        {
            a((SubtitleWindowView)b.valueAt(i));
        }

    }

    private void a(SubtitleWindowView subtitlewindowview)
    {
        subtitlewindowview.setTextSize(d);
        subtitlewindowview.setTextBackgroundColor(e.getBackgroundColor());
        subtitlewindowview.setBackgroundColor(e.getWindowColor());
        subtitlewindowview.setTextColor(e.getForegroundColor());
        subtitlewindowview.setTypeface(SubtitlesPreferences.SubtitlesFont.getTypefaceFromFontValue(e.getTypeface(), getContext().getAssets()));
        subtitlewindowview.setEdgeColor(e.getEdgeColor());
        subtitlewindowview.setPadding(10, 10, 10, 10);
        subtitlewindowview.setEdgeType(e.getEdgeType());
    }

    public final void a(List list)
    {
        HashSet hashset = new HashSet();
        for (int i = 0; i < a.size(); i++)
        {
            hashset.add(Integer.valueOf(a.keyAt(i)));
        }

        int j = 0;
        while (j < list.size()) 
        {
            SubtitleWindowSnapshot subtitlewindowsnapshot = (SubtitleWindowSnapshot)list.get(j);
            hashset.remove(Integer.valueOf(subtitlewindowsnapshot.windowId));
            Object obj = (SubtitleWindowView)b.get(subtitlewindowsnapshot.windowId);
            if (TextUtils.isEmpty(subtitlewindowsnapshot.text) || !subtitlewindowsnapshot.settings.visible)
            {
                if (obj != null)
                {
                    ((SubtitleWindowView) (obj)).setVisibility(8);
                }
            } else
            {
                a.put(subtitlewindowsnapshot.windowId, subtitlewindowsnapshot);
                if (obj == null)
                {
                    obj = subtitlewindowsnapshot.text;
                    SubtitleWindowView subtitlewindowview = new SubtitleWindowView(getContext());
                    a(subtitlewindowview);
                    subtitlewindowview.setTag(obj);
                    subtitlewindowview.setWindowSnapshot(subtitlewindowsnapshot);
                    addView(subtitlewindowview);
                    b.put(subtitlewindowsnapshot.windowId, subtitlewindowview);
                } else
                {
                    if (!subtitlewindowsnapshot.text.equals(((SubtitleWindowView) (obj)).getTag()))
                    {
                        ((SubtitleWindowView) (obj)).setTag(subtitlewindowsnapshot.text);
                        ((SubtitleWindowView) (obj)).setWindowSnapshot(subtitlewindowsnapshot);
                    }
                    ((SubtitleWindowView) (obj)).setVisibility(0);
                }
            }
            j++;
        }
        int k;
        for (list = hashset.iterator(); list.hasNext(); b.remove(k))
        {
            k = ((Integer)list.next()).intValue();
            removeView((View)b.get(k));
            a.remove(k);
        }

        setVisibility(0);
    }

    public final View b()
    {
        return this;
    }

    public final PlayerOverlaysLayout.LayoutParams c()
    {
        return new PlayerOverlaysLayout.LayoutParams(-1, -1);
    }

    public final void d()
    {
        removeAllViews();
        a.clear();
        b.clear();
    }

    public final void e()
    {
        setVisibility(4);
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        requestLayout();
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int i1;
        int j1;
        int k1;
        i = k - i;
        j = l - j;
        l = (i * 15) / 100 / 2;
        i1 = (j * 15) / 100 / 2;
        j1 = (i * 85) / 100;
        k1 = (j * 85) / 100;
        k = 0;
_L5:
        SubtitleWindowView subtitlewindowview;
        if (k >= a.size())
        {
            break MISSING_BLOCK_LABEL_293;
        }
        subtitlewindowview = (SubtitleWindowView)b.get(a.keyAt(k));
        if (subtitlewindowview.getVisibility() != 0) goto _L2; else goto _L1
_L1:
        int i2;
        int j2;
        Object obj = (SubtitleWindowSnapshot)a.valueAt(k);
        int l1 = subtitlewindowview.getMeasuredWidth();
        i2 = subtitlewindowview.getMeasuredHeight();
        obj = ((SubtitleWindowSnapshot) (obj)).settings;
        j2 = ((SubtitleWindowSettings) (obj)).anchorPoint;
        i = (((SubtitleWindowSettings) (obj)).anchorHorizontalPos * j1) / 100;
        j = (((SubtitleWindowSettings) (obj)).anchorVerticalPos * k1) / 100;
        if (((SubtitleWindowSettings) (obj)).rollUp)
        {
            break MISSING_BLOCK_LABEL_249;
        }
        if ((j2 & 1) == 0)
        {
            if ((j2 & 2) != 0)
            {
                i -= l1 / 2;
            } else
            {
                if ((j2 & 4) == 0)
                {
                    break MISSING_BLOCK_LABEL_249;
                }
                i -= l1;
            }
        }
_L3:
        if ((j2 & 8) == 0)
        {
            if ((j2 & 0x10) != 0)
            {
                j -= i2 / 2;
            } else
            if ((j2 & 0x20) != 0)
            {
                j -= i2;
            } else
            {
                j = 0;
            }
        }
        i += l;
        j += i1;
        subtitlewindowview.layout(i, j, l1 + i, i2 + j);
_L2:
        k++;
        continue; /* Loop/switch isn't completed */
        i = 0;
          goto _L3
        return;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void onMeasure(int i, int j)
    {
        int l = android.view.View.MeasureSpec.getSize(i);
        int i1 = android.view.View.MeasureSpec.getSize(j);
        setMeasuredDimension(l, i1);
        a(l, i1);
        int k = 0;
        do
        {
            if (k < a.size())
            {
                SubtitleWindowView subtitlewindowview = (SubtitleWindowView)b.get(a.keyAt(k));
                if (subtitlewindowview.getVisibility() == 0)
                {
                    SubtitleWindowSettings subtitlewindowsettings = ((SubtitleWindowSnapshot)a.valueAt(k)).settings;
                    int j1 = subtitlewindowsettings.anchorPoint;
                    i = (subtitlewindowsettings.anchorHorizontalPos * l) / 100;
                    j = (subtitlewindowsettings.anchorVerticalPos * i1) / 100;
                    if ((j1 & 1) != 0)
                    {
                        i = l - i;
                    } else
                    if ((j1 & 2) != 0)
                    {
                        i = Math.min(i, l - i) * 2;
                    } else
                    if ((j1 & 4) == 0)
                    {
                        i = 0;
                    }
                    if ((j1 & 8) != 0)
                    {
                        j = i1 - j;
                    } else
                    if ((j1 & 0x10) != 0)
                    {
                        j = Math.min(j, i1 - j) * 2;
                    } else
                    if ((j1 & 0x20) == 0)
                    {
                        j = 0;
                    }
                    subtitlewindowview.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0), android.view.View.MeasureSpec.makeMeasureSpec(j, 0));
                }
                k++;
                continue;
            }
            return;
        } while (true);
    }

    public void setFontScale(float f)
    {
        c = f;
        a(getWidth(), getHeight());
    }

    public void setSubtitlesStyle(SubtitlesStyle subtitlesstyle)
    {
        e = subtitlesstyle;
        a(getWidth(), getHeight());
    }
}
