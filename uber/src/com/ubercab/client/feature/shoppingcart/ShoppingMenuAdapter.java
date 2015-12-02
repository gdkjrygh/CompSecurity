// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import cev;
import cgh;
import cgt;
import chp;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.feature.shoppingcart.model.Item;
import com.ubercab.client.feature.shoppingcart.model.Page;
import com.ubercab.client.feature.shoppingcart.model.PageItem;
import com.ubercab.client.feature.shoppingcart.model.TimeWindow;
import com.ubercab.rider.realtime.response.Promotion;
import dbf;
import dtw;
import fir;
import gmg;
import hb;
import hw;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.TimeZone;
import l;

public final class ShoppingMenuAdapter extends hb
{

    static boolean a;
    private String A;
    View b;
    HeaderViewHolder c;
    boolean d;
    boolean e;
    LegacyHeaderViewHolder f;
    Promotion g;
    private final chp h;
    private final cev i;
    private final Context j;
    private final gmg k;
    private final cgh l;
    private final LayoutInflater m;
    private final int n;
    private final DateFormat o = DateFormat.getTimeInstance(3);
    private final String p;
    private final String q;
    private final List r = new ArrayList();
    private String s;
    private NumberFormat t;
    private TimeWindow u;
    private String v;
    private fir w;
    private String x;
    private boolean y;
    private int z;

    public ShoppingMenuAdapter(Context context, chp chp1, gmg gmg1, cev cev, cgh cgh1)
    {
        j = context;
        h = chp1;
        k = gmg1;
        i = cev;
        l = cgh1;
        m = LayoutInflater.from(context);
        context = context.getResources();
        p = Integer.toHexString(context.getColor(0x7f0d0073)).replaceFirst("#", "").toUpperCase();
        q = Integer.toHexString(context.getColor(0x7f0d008e)).replaceFirst("#", "").toUpperCase();
        n = context.getInteger(0x7f0b0014);
    }

    static int a(ShoppingMenuAdapter shoppingmenuadapter, int i1)
    {
        shoppingmenuadapter.z = i1;
        return i1;
    }

    static Context a(ShoppingMenuAdapter shoppingmenuadapter)
    {
        return shoppingmenuadapter.j;
    }

    private HeaderViewHolder a(ViewGroup viewgroup)
    {
        if (b == null)
        {
            b = m.inflate(0x7f03017f, viewgroup, false);
            c = new HeaderViewHolder(b);
            c.w();
            if (!TextUtils.isEmpty(A))
            {
                c.a(A);
            }
            c.b(x);
        }
        return c;
    }

    private void a(long l1, PageItem pageitem)
    {
        String s2 = "";
        String s1 = s2;
        if (pageitem != null)
        {
            s1 = s2;
            if (pageitem.getItem() != null)
            {
                s1 = pageitem.getItem().getItemId();
            }
        }
        h.a(AnalyticsEvent.create("impression").setName(l.gM).setValue(s1).setValuePosition(Long.valueOf(l1)));
    }

    static void a(ShoppingMenuAdapter shoppingmenuadapter, String s1, ImageView imageview)
    {
        shoppingmenuadapter.a(s1, imageview);
    }

    private void a(String s1, ImageView imageview)
    {
        l.a(s1).a(imageview);
    }

    private LegacyHeaderViewHolder b(ViewGroup viewgroup)
    {
        if (b == null)
        {
            b = m.inflate(0x7f030180, viewgroup, false);
            f = new LegacyHeaderViewHolder(b);
            f.w();
            if (!TextUtils.isEmpty(A))
            {
                f.a(A);
            }
            if (y)
            {
                f.x();
            } else
            {
                f.b(x);
            }
        }
        return f;
    }

    static fir b(ShoppingMenuAdapter shoppingmenuadapter)
    {
        return shoppingmenuadapter.w;
    }

    static int c(ShoppingMenuAdapter shoppingmenuadapter)
    {
        return shoppingmenuadapter.z;
    }

    private PageItem d(int i1)
    {
        if (i1 < r.size() && i1 >= 0)
        {
            return (PageItem)r.get(i1);
        } else
        {
            return null;
        }
    }

    static gmg d(ShoppingMenuAdapter shoppingmenuadapter)
    {
        return shoppingmenuadapter.k;
    }

    static NumberFormat e(ShoppingMenuAdapter shoppingmenuadapter)
    {
        return shoppingmenuadapter.t;
    }

    private static boolean e(int i1)
    {
        return i1 == 0;
    }

    static String f(ShoppingMenuAdapter shoppingmenuadapter)
    {
        return shoppingmenuadapter.v;
    }

    static cev g(ShoppingMenuAdapter shoppingmenuadapter)
    {
        return shoppingmenuadapter.i;
    }

    static chp h(ShoppingMenuAdapter shoppingmenuadapter)
    {
        return shoppingmenuadapter.h;
    }

    static int i(ShoppingMenuAdapter shoppingmenuadapter)
    {
        return shoppingmenuadapter.n;
    }

    public static LayoutInflater j(ShoppingMenuAdapter shoppingmenuadapter)
    {
        return shoppingmenuadapter.m;
    }

    static String k(ShoppingMenuAdapter shoppingmenuadapter)
    {
        return shoppingmenuadapter.s;
    }

    static TimeWindow l(ShoppingMenuAdapter shoppingmenuadapter)
    {
        return shoppingmenuadapter.u;
    }

    public static DateFormat m(ShoppingMenuAdapter shoppingmenuadapter)
    {
        return shoppingmenuadapter.o;
    }

    static String n(ShoppingMenuAdapter shoppingmenuadapter)
    {
        return shoppingmenuadapter.q;
    }

    static String o(ShoppingMenuAdapter shoppingmenuadapter)
    {
        return shoppingmenuadapter.p;
    }

    public final int a()
    {
        if (r.isEmpty())
        {
            return 0;
        } else
        {
            return r.size() + 1;
        }
    }

    public final int a(int i1)
    {
        return i1 != 0 ? 2 : 1;
    }

    public final hw a(ViewGroup viewgroup, int i1)
    {
        switch (i1)
        {
        default:
            return null;

        case 1: // '\001'
            if (k.a(dbf.bd))
            {
                return a(viewgroup);
            } else
            {
                return b(viewgroup);
            }

        case 2: // '\002'
            return new ShoppingViewHolder(m.inflate(0x7f03017c, viewgroup, false));
        }
    }

    public final void a(Page page, TimeWindow timewindow, TimeZone timezone, Currency currency)
    {
        if (page != null)
        {
            r.clear();
            r.addAll(page.getPageItemsForTime(timewindow));
            c();
        }
        t = dtw.a(currency);
        u = timewindow;
        o.setTimeZone(timezone);
    }

    public final void a(Promotion promotion)
    {
        g = promotion;
        if (c != null)
        {
            c.x();
        }
    }

    public final void a(fir fir)
    {
        w = fir;
    }

    public final void a(hw hw, int i1)
    {
        if (e(i1) || hw == null)
        {
            return;
        } else
        {
            i1--;
            PageItem pageitem = d(i1);
            ((ShoppingViewHolder)hw).a(pageitem, i1);
            a(i1, pageitem);
            return;
        }
    }

    public final void a(String s1)
    {
        v = s1;
    }

    public final void a(String s1, boolean flag)
    {
        x = s1;
        y = flag;
        if (c != null)
        {
            c.b(x);
        } else
        if (f != null)
        {
            if (y)
            {
                f.x();
                return;
            } else
            {
                f.b(x);
                return;
            }
        }
    }

    public final void a(boolean flag)
    {
        d = flag;
    }

    public final void b(String s1)
    {
        s = s1;
    }

    public final void b(boolean flag)
    {
        e = flag;
    }

    final void c(int i1)
    {
        if (c != null)
        {
            c.b(i1);
        }
    }

    public final void c(String s1)
    {
        A = s1;
        if (c != null)
        {
            c.a(A);
        } else
        if (f != null)
        {
            f.a(A);
            return;
        }
    }

    private class HeaderViewHolder extends hw
    {

        final ShoppingMenuAdapter l;
        ImageView mEatsLogo;
        TextView mPromoBanner;
        ViewGroup mShoppingHeader;
        LinearLayout mShoppingMealInfo;
        TextView mShoppingMenuHoursText;
        TextView mShoppingMenuTaglineText;
        FrameLayout mTransparentHeader;

        private void b(boolean flag)
        {
            Animation animation = AnimationUtils.loadAnimation(ShoppingMenuAdapter.a(l), 0x7f04000b);
            Animation animation1 = AnimationUtils.loadAnimation(ShoppingMenuAdapter.a(l), 0x7f040010);
            Animation animation2 = AnimationUtils.loadAnimation(ShoppingMenuAdapter.a(l), 0x7f040016);
            animation.setAnimationListener(new dru(animation1) {

                final Animation a;
                final HeaderViewHolder b;

                public final void onAnimationEnd(Animation animation3)
                {
                    b.mEatsLogo.setVisibility(8);
                    b.mShoppingMealInfo.startAnimation(a);
                    b.mShoppingMealInfo.setVisibility(0);
                }

                
                {
                    b = HeaderViewHolder.this;
                    a = animation;
                    super();
                }
            });
            mEatsLogo.startAnimation(animation);
            if (flag)
            {
                animation1.setAnimationListener(new dru() {

                    final HeaderViewHolder a;

                    public final void onAnimationEnd(Animation animation3)
                    {
                        a.x();
                    }

                
                {
                    a = HeaderViewHolder.this;
                    super();
                }
                });
                mPromoBanner.startAnimation(animation2);
            }
        }

        private void y()
        {
            z();
            boolean flag = ShoppingMenuAdapter.d(l).a(dbf.bb);
            if (ShoppingMenuAdapter.a)
            {
                mShoppingMealInfo.setVisibility(0);
                mEatsLogo.setVisibility(8);
                if (flag)
                {
                    x();
                }
                return;
            } else
            {
                b(flag);
                ShoppingMenuAdapter.a = true;
                return;
            }
        }

        private void z()
        {
            mTransparentHeader.setOnTouchListener(new android.view.View.OnTouchListener() {

                final HeaderViewHolder a;

                public final boolean onTouch(View view, MotionEvent motionevent)
                {
                    if (motionevent.getAction() == 0)
                    {
                        ShoppingMenuAdapter.b(a.l).d();
                    }
                    return false;
                }

                
                {
                    a = HeaderViewHolder.this;
                    super();
                }
            });
        }

        final void a(String s1)
        {
            mShoppingMenuTaglineText.setText(s1);
        }

        final void b(int i1)
        {
            if (i1 == 0 && !TextUtils.isEmpty(l.g.getDescription()))
            {
                mPromoBanner.setText(l.g.getDescription());
                mPromoBanner.setVisibility(0);
                return;
            } else
            {
                mPromoBanner.setVisibility(8);
                return;
            }
        }

        final void b(String s1)
        {
            if (TextUtils.isEmpty(s1))
            {
                mShoppingMenuHoursText.setVisibility(8);
                return;
            } else
            {
                mShoppingMenuHoursText.setVisibility(0);
                mShoppingMenuHoursText.setText(s1);
                return;
            }
        }

        public void onEatsHeaderClicked()
        {
            if (ShoppingMenuAdapter.b(l) != null)
            {
                ShoppingMenuAdapter.b(l).c();
            }
        }

        final void w()
        {
            Object obj = ((WindowManager)ShoppingMenuAdapter.a(l).getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            ((Display) (obj)).getSize(point);
            int i1 = point.y;
            obj = ShoppingMenuAdapter.a(l).getResources();
            ShoppingMenuAdapter.a(l, i1 - ((Resources) (obj)).getDimensionPixelSize(0x7f080220) - ((Resources) (obj)).getDimensionPixelSize(0x7f080056) - ((Resources) (obj)).getDimensionPixelSize(0x7f0802dc) - ((Resources) (obj)).getDimensionPixelSize(0x7f080222));
            mTransparentHeader.getLayoutParams().height = ShoppingMenuAdapter.c(l);
        }

        final void x()
        {
            if (l.g != null && !TextUtils.isEmpty(l.g.getDescription()) && !l.d && l.e)
            {
                mPromoBanner.setText(l.g.getDescription());
                mPromoBanner.setVisibility(0);
                return;
            } else
            {
                mPromoBanner.setVisibility(8);
                return;
            }
        }

        HeaderViewHolder(View view)
        {
            l = ShoppingMenuAdapter.this;
            super(view);
            if (view.isInEditMode())
            {
                return;
            } else
            {
                ButterKnife.inject(this, view);
                y();
                return;
            }
        }
    }


    private class LegacyHeaderViewHolder extends hw
    {

        String l;
        String m;
        View mClosedBanner;
        TextView mClosedBannerText;
        ViewGroup mShoppingHeader;
        DividerWithText mShoppingHeaderText;
        FrameLayout mTransparentHeader;
        String n;
        final ShoppingMenuAdapter o;

        private void y()
        {
            mTransparentHeader.setOnTouchListener(new android.view.View.OnTouchListener() {

                final LegacyHeaderViewHolder a;

                public final boolean onTouch(View view, MotionEvent motionevent)
                {
                    if (motionevent.getAction() == 0)
                    {
                        ShoppingMenuAdapter.b(a.o).d();
                    }
                    return false;
                }

                
                {
                    a = LegacyHeaderViewHolder.this;
                    super();
                }
            });
        }

        final void a(String s1)
        {
            if (ShoppingMenuAdapter.d(o).a(dbf.aZ))
            {
                n = s1;
            }
        }

        final void b(String s1)
        {
            mClosedBannerText.setText(s1);
            mClosedBanner.setVisibility(0);
            if (ShoppingMenuAdapter.d(o).a(dbf.aZ) && !TextUtils.isEmpty(n))
            {
                mShoppingHeaderText.a(n);
                return;
            } else
            {
                mShoppingHeaderText.a(m);
                return;
            }
        }

        public void onEatsHeaderClicked()
        {
            if (ShoppingMenuAdapter.b(o) != null)
            {
                ShoppingMenuAdapter.b(o).c();
            }
        }

        final void w()
        {
            Object obj = ((WindowManager)ShoppingMenuAdapter.a(o).getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            ((Display) (obj)).getSize(point);
            int i1 = point.y;
            obj = ShoppingMenuAdapter.a(o).getResources();
            ShoppingMenuAdapter.a(o, i1 - ((Resources) (obj)).getDimensionPixelSize(0x7f080220) - ((Resources) (obj)).getDimensionPixelSize(0x7f080056) - ((Resources) (obj)).getDimensionPixelSize(0x7f0802dc) - ((Resources) (obj)).getDimensionPixelSize(0x7f080222));
            mTransparentHeader.getLayoutParams().height = ShoppingMenuAdapter.c(o);
        }

        final void x()
        {
            mClosedBanner.setVisibility(8);
            if (ShoppingMenuAdapter.d(o).a(dbf.aZ) && !TextUtils.isEmpty(n))
            {
                mShoppingHeaderText.a(n);
                return;
            } else
            {
                mShoppingHeaderText.a(l);
                return;
            }
        }

        LegacyHeaderViewHolder(View view)
        {
            o = ShoppingMenuAdapter.this;
            super(view);
            if (view.isInEditMode())
            {
                return;
            } else
            {
                ButterKnife.inject(this, view);
                y();
                shoppingmenuadapter = ShoppingMenuAdapter.a(ShoppingMenuAdapter.this).getResources();
                l = getString(0x7f0701f2);
                m = getString(0x7f0701f3);
                return;
            }
        }
    }


    private class ShoppingViewHolder extends hw
    {

        Item l;
        final ShoppingMenuAdapter m;
        TextView mAlert;
        Button mButtonMinus;
        Button mButtonPlus;
        TextView mDescription;
        View mDescriptionSection;
        ImageView mEndorsementIcon;
        View mEndorsementSection;
        TextView mEndorsementText;
        ImageView mImage;
        View mImageSection;
        ImageView mMoreDetailsIcon;
        LinearLayout mOnSaleSection;
        TextView mPrice;
        TextView mQuantity;
        FrameLayout mReminderSection;
        Button mReminderSetButton;
        Button mReminderUpdateButton;
        TextView mSubTitle;
        TextView mTitle;
        private int n;
        private BadgeColor o;
        private BadgeColor p;
        private String q;
        private long r;

        private void A()
        {
            boolean flag = false;
            mOnSaleSection.setVisibility(0);
            mReminderSection.setVisibility(8);
            Button button = mButtonMinus;
            if (n > 0)
            {
                flag = true;
            }
            button.setEnabled(flag);
            mQuantity.setEnabled(true);
            mButtonMinus.setBackgroundResource(0x7f02009f);
            mButtonPlus.setBackgroundResource(0x7f0200a0);
        }

        private void B()
        {
            if (ShoppingMenuAdapter.l(m) != null && !ShoppingMenuAdapter.l(m).isOpen() && ShoppingMenuAdapter.d(m).a(dbf.ba))
            {
                D();
                return;
            } else
            {
                C();
                return;
            }
        }

        private void C()
        {
            mOnSaleSection.setVisibility(0);
            mReminderSection.setVisibility(8);
            mButtonMinus.setEnabled(true);
            mQuantity.setEnabled(false);
            mButtonMinus.setBackgroundResource(0x7f0200af);
            mButtonPlus.setBackgroundResource(0x7f0200b4);
        }

        private void D()
        {
            mOnSaleSection.setVisibility(8);
            mReminderSection.setVisibility(0);
            mReminderSetButton.setVisibility(8);
            mReminderUpdateButton.setVisibility(8);
            Reminder reminder = l.getReminder();
            if (reminder == null)
            {
                mReminderSetButton.setVisibility(0);
                return;
            } else
            {
                mReminderUpdateButton.setText(ShoppingMenuAdapter.m(m).format(reminder.getReminderTime()));
                mReminderUpdateButton.setVisibility(0);
                return;
            }
        }

        private void E()
        {
            mQuantity.setText(String.valueOf(n));
            Button button = mButtonMinus;
            boolean flag;
            if (n > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            button.setEnabled(flag);
        }

        private void F()
        {
            Object obj1 = l.getAlert();
            Object obj = null;
            if (obj1 != null)
            {
                obj = a(((Badge) (obj1)).getBackgroundColor(), ShoppingMenuAdapter.n(m), 0.0F);
                mAlert.setBackgroundColor(dtu.a(dtu.a(((BadgeColor) (obj)).getColor()), ((BadgeColor) (obj)).getAlpha()));
                obj = ((Badge) (obj1)).getText();
                if (!TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    mAlert.setVisibility(0);
                    BadgeColor badgecolor = a(((Badge) (obj1)).getForegroundColor(), ShoppingMenuAdapter.n(m), 1.0F);
                    mAlert.setText(((CharSequence) (obj)));
                    mAlert.setTextColor(dtu.a(dtu.a(badgecolor.getColor()), badgecolor.getAlpha()));
                    ShoppingMenuAdapter.h(m).a(AnalyticsEvent.create("impression").setName(l.iu).setValue(((String) (obj))));
                } else
                {
                    mAlert.setVisibility(8);
                }
            }
            if (obj1 == null || obj == null)
            {
                mAlert.setVisibility(8);
            }
            obj = l.getEndorsement();
            if (obj != null)
            {
                mEndorsementSection.setVisibility(0);
                obj1 = ((Badge) (obj)).getIconUrl();
                if (!TextUtils.isEmpty(((CharSequence) (obj1))))
                {
                    mEndorsementIcon.setVisibility(0);
                    ShoppingMenuAdapter.a(m, ((String) (obj1)), mEndorsementIcon);
                    if (p == null)
                    {
                        p = a(((Badge) (obj)).getIconColor(), ShoppingMenuAdapter.n(m), 0.0F);
                    }
                    mEndorsementIcon.setColorFilter(dtu.a(dtu.a(p.getColor()), p.getAlpha()));
                } else
                {
                    mEndorsementIcon.setVisibility(8);
                }
                obj1 = ((Badge) (obj)).getText();
                if (!TextUtils.isEmpty(((CharSequence) (obj1))))
                {
                    mEndorsementText.setVisibility(0);
                    if (o == null)
                    {
                        o = a(((Badge) (obj)).getForegroundColor(), ShoppingMenuAdapter.o(m), 1.0F);
                    }
                    mEndorsementText.setText(((CharSequence) (obj1)));
                    mEndorsementText.setLineSpacing(0.0F, 0.9F);
                    mEndorsementText.setTextColor(dtu.a(dtu.a(o.getColor()), o.getAlpha()));
                    ShoppingMenuAdapter.h(m).a(AnalyticsEvent.create("impression").setName(l.iv).setValue(((String) (obj1))));
                    return;
                } else
                {
                    mEndorsementSection.setVisibility(8);
                    return;
                }
            } else
            {
                mEndorsementSection.setVisibility(8);
                return;
            }
        }

        private void G()
        {
            if (mDescriptionSection.getVisibility() == 0)
            {
                mDescriptionSection.setVisibility(8);
                mMoreDetailsIcon.setVisibility(0);
                return;
            } else
            {
                mDescriptionSection.setVisibility(0);
                mMoreDetailsIcon.setVisibility(8);
                return;
            }
        }

        private static BadgeColor a(BadgeColor badgecolor, String s1, float f1)
        {
            String s2 = null;
            float f2 = 0.0F;
            if (badgecolor != null)
            {
                s2 = badgecolor.getColor();
                f2 = badgecolor.getAlpha();
            }
            if (s2 != null)
            {
                f1 = f2;
                s1 = s2;
            }
            return new BadgeColor(f1, s1);
        }

        static void a(ShoppingViewHolder shoppingviewholder)
        {
            shoppingviewholder.y();
        }

        static void a(ShoppingViewHolder shoppingviewholder, n n1)
        {
            shoppingviewholder.a(n1);
        }

        private void a(n n1)
        {
            ShoppingMenuAdapter.h(m).a(AnalyticsEvent.create("tap").setName(n1).setValue(q).setValuePosition(Long.valueOf(r)));
        }

        static String b(ShoppingViewHolder shoppingviewholder)
        {
            return shoppingviewholder.q;
        }

        private PopupMenu x()
        {
            PopupMenu popupmenu = new PopupMenu(ShoppingMenuAdapter.a(m), mReminderUpdateButton);
            popupmenu.getMenuInflater().inflate(0x7f100001, popupmenu.getMenu());
            popupmenu.setOnMenuItemClickListener(new android.widget.PopupMenu.OnMenuItemClickListener() {

                final ShoppingViewHolder a;

                public final boolean onMenuItemClick(MenuItem menuitem)
                {
                    switch (menuitem.getItemId())
                    {
                    default:
                        return false;

                    case 2131625644: 
                        ShoppingViewHolder.a(a, n.hR);
                        a.w();
                        return true;

                    case 2131625645: 
                        ShoppingViewHolder.a(a, n.hS);
                        break;
                    }
                    ShoppingViewHolder.a(a);
                    return true;
                }

                
                {
                    a = ShoppingViewHolder.this;
                    super();
                }
            });
            popupmenu.show();
            return popupmenu;
        }

        private void y()
        {
            Reminder reminder = l.getReminder();
            if (!TextUtils.isEmpty(q) && reminder != null && !TextUtils.isEmpty(reminder.getUuid()) && ShoppingMenuAdapter.b(m) != null)
            {
                ShoppingMenuAdapter.b(m).a(q, reminder.getUuid());
            }
        }

        private void z()
        {
            boolean flag;
            if ((ShoppingMenuAdapter.a(m) instanceof Activity) && !TextUtils.isEmpty(ShoppingMenuAdapter.k(m)))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                Toast.makeText(ShoppingMenuAdapter.a(m), ShoppingMenuAdapter.k(m), 0).show();
            }
        }

        public final void a(PageItem pageitem, int i1)
        {
            l = pageitem.getItem();
            r = i1;
            if (l == null)
            {
                return;
            }
            n = l.getCount().intValue();
            q = l.getItemId();
            ShoppingMenuAdapter.a(m, l.getImageUrlOriginal(), mImage);
            mTitle.setText(l.getSubTitle());
            mTitle.setLineSpacing(0.0F, 0.9F);
            mSubTitle.setText(l.getTitle());
            mSubTitle.setLineSpacing(0.0F, 0.9F);
            mDescription.setText(l.getDescription());
            mDescriptionSection.setVisibility(8);
            mPrice.setText(ShoppingMenuAdapter.e(m).format(l.getPrice()));
            mQuantity.setText(String.valueOf(n));
            F();
            if (l.isOnSale())
            {
                A();
                return;
            } else
            {
                B();
                return;
            }
        }

        public void onClickImage()
        {
            G();
            a(n.fC);
        }

        public void onClickInfo()
        {
            G();
            a(n.fD);
        }

        public void onClickMinus()
        {
            if (!l.isOnSale())
            {
                z();
                return;
            } else
            {
                n = n - 1;
                ShoppingMenuAdapter.g(m).c(new fjb(ShoppingMenuAdapter.f(m), q, n));
                E();
                ShoppingMenuAdapter.h(m).a(AnalyticsEvent.create("tap").setName(n.fB).setValue(q).setValuePosition(Long.valueOf(n)));
                return;
            }
        }

        public void onClickPlus()
        {
            if (!l.isOnSale())
            {
                z();
                return;
            } else
            {
                n = n + 1;
                ShoppingMenuAdapter.g(m).c(new fjb(ShoppingMenuAdapter.f(m), q, n));
                E();
                ShoppingMenuAdapter.h(m).a(AnalyticsEvent.create("tap").setName(n.fx).setValue(q).setValuePosition(Long.valueOf(n)));
                return;
            }
        }

        public void onClickSetReminder()
        {
            a(n.hQ);
            w();
        }

        public void onClickUpdateReminder()
        {
            a(n.hQ);
            x();
        }

        final AlertDialog w()
        {
            Object obj1 = l.getTimeWindow();
            Object obj = l.getReminder();
            obj1 = new fis(m, ((TimeWindow) (obj1)).getEpochTimeOpen(), ((TimeWindow) (obj1)).getEpochTimeClose(), ShoppingMenuAdapter.i(m));
            View view = ShoppingMenuAdapter.j(m).inflate(0x7f030218, null);
            ((TextView)view.findViewById(0x7f0e0276)).setText(0x7f07041e);
            obj = (new android.app.AlertDialog.Builder(ShoppingMenuAdapter.a(m))).setCustomTitle(view).setAdapter(((android.widget.ListAdapter) (obj1)), new android.content.DialogInterface.OnClickListener(((fis) (obj1)), ((Reminder) (obj))) {

                final fis a;
                final Reminder b;
                final ShoppingViewHolder c;

                public final void onClick(DialogInterface dialoginterface, int i1)
                {
                    long l1 = ((Long)a.getItem(i1)).longValue();
                    if (ShoppingMenuAdapter.b(c.m) != null)
                    {
                        if (b == null || TextUtils.isEmpty(b.getUuid()))
                        {
                            ShoppingMenuAdapter.b(c.m).a(ShoppingViewHolder.b(c), l1);
                        } else
                        {
                            ShoppingMenuAdapter.b(c.m).a(ShoppingViewHolder.b(c), b.getUuid(), l1);
                        }
                    }
                    ShoppingViewHolder.a(c, n.hU);
                }

                
                {
                    c = ShoppingViewHolder.this;
                    a = fis1;
                    b = reminder;
                    super();
                }
            }).create();
            ((AlertDialog) (obj)).setButton(-2, ShoppingMenuAdapter.a(m).getString(0x7f07007b), new android.content.DialogInterface.OnClickListener() {

                final ShoppingViewHolder a;

                public final void onClick(DialogInterface dialoginterface, int i1)
                {
                }

                
                {
                    a = ShoppingViewHolder.this;
                    super();
                }
            });
            ((AlertDialog) (obj)).setCancelable(true);
            ((AlertDialog) (obj)).setCanceledOnTouchOutside(true);
            ((AlertDialog) (obj)).show();
            obj1 = ((AlertDialog) (obj)).findViewById(ShoppingMenuAdapter.a(m).getResources().getIdentifier("titleDivider", "id", "android"));
            if (obj1 != null)
            {
                ((View) (obj1)).setVisibility(8);
            }
            ShoppingMenuAdapter.h(m).a(AnalyticsEvent.create("impression").setName(l.iF).setValue(q).setValuePosition(Long.valueOf(r)));
            return ((AlertDialog) (obj));
        }

        public ShoppingViewHolder(View view)
        {
            m = ShoppingMenuAdapter.this;
            super(view);
            ButterKnife.inject(this, view);
            n = 0;
        }
    }

}
