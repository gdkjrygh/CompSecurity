// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleWindowSettings;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleWindowSnapshot;
import com.google.android.youtube.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.ui:
//            SubtitlesTextView

public class SubtitleWindowView extends ViewGroup
{

    private Resources a;
    private List b;
    private List c;
    private List d;
    private SubtitlesTextView e;
    private List f;
    private List g;
    private int h;
    private float i;
    private Typeface j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private SubtitleWindowSnapshot o;

    public SubtitleWindowView(Context context)
    {
        super(context);
        a();
    }

    public SubtitleWindowView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public SubtitleWindowView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a();
    }

    private void a()
    {
        a = getContext().getResources();
        b = new ArrayList();
        c = new ArrayList();
        d = new ArrayList();
        f = new ArrayList();
        g = new ArrayList();
        e = new SubtitlesTextView(getContext());
        int i1 = (int)a.getDimension(g.ac);
        e.setPadding(i1, i1, i1, i1);
    }

    private static void a(List list, String s)
    {
        Object obj = Html.fromHtml(s);
        s = obj.toString();
        obj = new SpannableStringBuilder(((CharSequence) (obj)));
        int i1 = 0;
        while (i1 < ((SpannableStringBuilder) (obj)).length()) 
        {
            int j1 = s.substring(i1).indexOf("\n");
            if (j1 == -1)
            {
                j1 = ((SpannableStringBuilder) (obj)).length();
            } else
            {
                j1 += i1;
            }
            list.add(((SpannableStringBuilder) (obj)).subSequence(i1, j1));
            i1 = j1 + 1;
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int i2 = k1 - i1;
        j1 = getPaddingLeft();
        int j2 = getPaddingRight();
        k1 = getPaddingTop();
        int k2 = o.settings.anchorPoint;
        l1 = 0;
        while (l1 < b.size()) 
        {
            SubtitlesTextView subtitlestextview = (SubtitlesTextView)d.get(l1);
            i1 = ((Integer)f.get(l1)).intValue();
            int l2 = ((Integer)g.get(l1)).intValue();
            if ((k2 & 4) != 0)
            {
                i1 = i2 - j2 - i1;
            } else
            if ((k2 & 2) != 0)
            {
                i1 = (int)((double)(i2 - i1) / 2D);
            } else
            {
                i1 = j1;
            }
            if (o.settings.rollUp)
            {
                i1 = j1;
            }
            subtitlestextview.layout(i1, k1, subtitlestextview.getMeasuredWidth() + i1, subtitlestextview.getMeasuredHeight() + k1);
            l1++;
            k1 += l2;
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        int j2 = 0;
        int l2 = android.view.View.MeasureSpec.getSize(i1);
        int k2 = android.view.View.MeasureSpec.getSize(j1);
        int l1 = getPaddingLeft() + getPaddingRight();
        int k1 = getPaddingTop();
        k1 = getPaddingBottom() + k1;
        int i2;
        if (n)
        {
            l1 = android.view.View.MeasureSpec.makeMeasureSpec(l2 - l1, 0x80000000);
            k1 = android.view.View.MeasureSpec.makeMeasureSpec(k2 - k1, 0x80000000);
        } else
        {
            l1 = android.view.View.MeasureSpec.makeMeasureSpec(l2 - l1, 0);
            k1 = android.view.View.MeasureSpec.makeMeasureSpec(k2 - k1, 0);
        }
        i2 = 0;
        while (i2 < b.size()) 
        {
            SubtitlesTextView subtitlestextview;
            if (i2 < d.size())
            {
                subtitlestextview = (SubtitlesTextView)d.get(i2);
            } else
            {
                subtitlestextview = new SubtitlesTextView(getContext());
                subtitlestextview.setTextColor(h);
                subtitlestextview.setTextSize(i);
                subtitlestextview.setTypeface(j);
                subtitlestextview.setEdgeColor(k);
                subtitlestextview.setEdgeType(l);
                subtitlestextview.setBackgroundColor(m);
                subtitlestextview.setWrapText(n);
                int i3 = (int)a.getDimension(g.ac);
                subtitlestextview.setPadding(i3, i3, i3, i3);
                addView(subtitlestextview);
                d.add(subtitlestextview);
            }
            if (i2 < c.size())
            {
                subtitlestextview.setVisibility(0);
                subtitlestextview.setText((CharSequence)c.get(i2));
                subtitlestextview.measure(l1, k1);
            } else
            {
                subtitlestextview.setVisibility(8);
            }
            i2++;
        }
        f.clear();
        g.clear();
        Iterator iterator = b.iterator();
        int j3;
        for (i2 = 0; iterator.hasNext(); i2 = j3 + i2)
        {
            CharSequence charsequence = (CharSequence)iterator.next();
            e.setText(charsequence);
            e.measure(l1, k1);
            int k3 = e.getMeasuredWidth();
            j3 = e.getMeasuredHeight();
            f.add(Integer.valueOf(k3));
            g.add(Integer.valueOf(j3));
            j2 = Math.max(k3, j2);
        }

        l1 = getPaddingLeft() + getPaddingRight() + j2;
        k1 = getPaddingTop() + getPaddingBottom() + i2;
        i2 = android.view.View.MeasureSpec.getMode(i1);
        if (i2 == 0x80000000)
        {
            i1 = Math.min(l2, l1);
        } else
        {
            i1 = l1;
            if (i2 == 0x40000000)
            {
                i1 = l2;
            }
        }
        if (android.view.View.MeasureSpec.getMode(j1) == 0x80000000)
        {
            j1 = Math.min(k2, k1);
        } else
        {
            j1 = k1;
            if (i2 == 0x40000000)
            {
                j1 = k2;
            }
        }
        setMeasuredDimension(i1, j1);
    }

    public void setEdgeColor(int i1)
    {
        k = i1;
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((SubtitlesTextView)iterator.next()).setEdgeColor(i1)) { }
        requestLayout();
    }

    public void setEdgeType(int i1)
    {
        l = i1;
        e.setEdgeType(i1);
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((SubtitlesTextView)iterator.next()).setEdgeType(i1)) { }
        requestLayout();
    }

    public void setTextBackgroundColor(int i1)
    {
        m = i1;
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((SubtitlesTextView)iterator.next()).setBackgroundColor(i1)) { }
        requestLayout();
    }

    public void setTextColor(int i1)
    {
        h = i1;
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((SubtitlesTextView)iterator.next()).setTextColor(i1)) { }
        requestLayout();
    }

    public void setTextSize(float f1)
    {
        i = f1;
        e.setTextSize(f1);
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((SubtitlesTextView)iterator.next()).setTextSize(f1)) { }
        requestLayout();
    }

    public void setTypeface(Typeface typeface)
    {
        j = typeface;
        e.setTypeface(typeface);
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((SubtitlesTextView)iterator.next()).setTypeface(typeface)) { }
        requestLayout();
    }

    public void setWindowSnapshot(SubtitleWindowSnapshot subtitlewindowsnapshot)
    {
        o = subtitlewindowsnapshot;
        c.clear();
        b.clear();
        if (n)
        {
            c.add(Html.fromHtml(subtitlewindowsnapshot.text));
            b.add(Html.fromHtml(subtitlewindowsnapshot.fullText));
        } else
        {
            a(c, subtitlewindowsnapshot.text);
            a(b, subtitlewindowsnapshot.fullText);
        }
        requestLayout();
    }

    public void setWrapText(boolean flag)
    {
        n = flag;
        e.setWrapText(flag);
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((SubtitlesTextView)iterator.next()).setWrapText(flag)) { }
    }
}
