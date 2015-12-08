// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            u, l, v, Fragment

public class FragmentTabHost extends TabHost
    implements android.widget.TabHost.OnTabChangeListener
{

    private final ArrayList a;
    private FrameLayout b;
    private Context c;
    private l d;
    private int e;
    private android.widget.TabHost.OnTabChangeListener f;
    private u g;
    private boolean h;

    public FragmentTabHost(Context context)
    {
        super(context, null);
        a = new ArrayList();
        a(context, ((AttributeSet) (null)));
    }

    public FragmentTabHost(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new ArrayList();
        a(context, attributeset);
    }

    private v a(String s, v v1)
    {
        u u1 = null;
        for (int i = 0; i < a.size(); i++)
        {
            u u2 = (u)a.get(i);
            if (u.b(u2).equals(s))
            {
                u1 = u2;
            }
        }

        if (u1 == null)
        {
            throw new IllegalStateException((new StringBuilder("No tab known for tag ")).append(s).toString());
        }
        s = v1;
        if (g != u1)
        {
            s = v1;
            if (v1 == null)
            {
                s = d.a();
            }
            if (g != null && u.a(g) != null)
            {
                s.b(u.a(g));
            }
            if (u1 != null)
            {
                if (u.a(u1) == null)
                {
                    u.a(u1, Fragment.a(c, u.c(u1).getName(), u.d(u1)));
                    s.a(e, u.a(u1), u.b(u1));
                } else
                {
                    s.c(u.a(u1));
                }
            }
            g = u1;
        }
        return s;
    }

    private void a()
    {
        if (b == null)
        {
            b = (FrameLayout)findViewById(e);
            if (b == null)
            {
                throw new IllegalStateException((new StringBuilder("No tab content FrameLayout found for id ")).append(e).toString());
            }
        }
    }

    private void a(Context context)
    {
        if (findViewById(0x1020013) == null)
        {
            LinearLayout linearlayout = new LinearLayout(context);
            linearlayout.setOrientation(1);
            addView(linearlayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
            Object obj = new TabWidget(context);
            ((TabWidget) (obj)).setId(0x1020013);
            ((TabWidget) (obj)).setOrientation(0);
            linearlayout.addView(((android.view.View) (obj)), new android.widget.LinearLayout.LayoutParams(-1, -2, 0.0F));
            obj = new FrameLayout(context);
            ((FrameLayout) (obj)).setId(0x1020011);
            linearlayout.addView(((android.view.View) (obj)), new android.widget.LinearLayout.LayoutParams(0, 0, 0.0F));
            context = new FrameLayout(context);
            b = context;
            b.setId(e);
            linearlayout.addView(context, new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0F));
        }
    }

    private void a(Context context, AttributeSet attributeset)
    {
        context = context.obtainStyledAttributes(attributeset, new int[] {
            0x10100f3
        }, 0, 0);
        e = context.getResourceId(0, 0);
        context.recycle();
        super.setOnTabChangedListener(this);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        String s = getCurrentTabTag();
        v v1 = null;
        int i = 0;
        while (i < a.size()) 
        {
            u u1 = (u)a.get(i);
            u.a(u1, d.a(u.b(u1)));
            v v2 = v1;
            if (u.a(u1) != null)
            {
                v2 = v1;
                if (!u.a(u1).l())
                {
                    if (u.b(u1).equals(s))
                    {
                        g = u1;
                        v2 = v1;
                    } else
                    {
                        v2 = v1;
                        if (v1 == null)
                        {
                            v2 = d.a();
                        }
                        v2.b(u.a(u1));
                    }
                }
            }
            i++;
            v1 = v2;
        }
        h = true;
        v1 = a(s, v1);
        if (v1 != null)
        {
            v1.a();
            d.b();
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        h = false;
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        setCurrentTabByTag(((SavedState) (parcelable)).curTab);
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.curTab = getCurrentTabTag();
        return savedstate;
    }

    public void onTabChanged(String s)
    {
        if (h)
        {
            v v1 = a(s, ((v) (null)));
            if (v1 != null)
            {
                v1.a();
            }
        }
        if (f != null)
        {
            f.onTabChanged(s);
        }
    }

    public void setOnTabChangedListener(android.widget.TabHost.OnTabChangeListener ontabchangelistener)
    {
        f = ontabchangelistener;
    }

    public void setup()
    {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    public void setup(Context context, l l1)
    {
        a(context);
        super.setup();
        c = context;
        d = l1;
        a();
    }

    public void setup(Context context, l l1, int i)
    {
        a(context);
        super.setup();
        c = context;
        d = l1;
        e = i;
        a();
        b.setId(i);
        if (getId() == -1)
        {
            setId(0x1020012);
        }
    }

    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new t();
        String curTab;

        public String toString()
        {
            return (new StringBuilder("FragmentTabHost.SavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" curTab=").append(curTab).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeString(curTab);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            curTab = parcel.readString();
        }

        SavedState(Parcel parcel, s s)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
