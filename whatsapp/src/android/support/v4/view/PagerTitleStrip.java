// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v4.view:
//            ViewPager, PagerAdapter

public class PagerTitleStrip extends ViewGroup
    implements ViewPager.Decor
{

    private static final int ATTRS[];
    private static final PagerTitleStripImpl IMPL = new PagerTitleStripImplBase();
    private static final int TEXT_ATTRS[];
    private static final String z[];
    TextView mCurrText;
    private int mGravity;
    private int mLastKnownCurrentPage;
    private float mLastKnownPositionOffset;
    TextView mNextText;
    private int mNonPrimaryAlpha;
    private final PageListener mPageListener;
    ViewPager mPager;
    TextView mPrevText;
    private int mScaledTextSpacing;
    int mTextColor;
    private boolean mUpdatingPositions;
    private boolean mUpdatingText;
    private WeakReference mWatchingAdapter;

    public PagerTitleStrip(Context context)
    {
        this(context, null);
    }

    public PagerTitleStrip(Context context, AttributeSet attributeset)
    {
        boolean flag1 = false;
        boolean flag2 = ViewPager.a;
        super(context, attributeset);
        mLastKnownCurrentPage = -1;
        mLastKnownPositionOffset = -1F;
        mPageListener = new PageListener(null);
        TextView textview = new TextView(context);
        mPrevText = textview;
        addView(textview);
        textview = new TextView(context);
        mCurrText = textview;
        addView(textview);
        textview = new TextView(context);
        mNextText = textview;
        addView(textview);
        attributeset = context.obtainStyledAttributes(attributeset, ATTRS);
        int i = attributeset.getResourceId(0, 0);
        int j;
        boolean flag;
        if (i != 0)
        {
            try
            {
                mPrevText.setTextAppearance(context, i);
                mCurrText.setTextAppearance(context, i);
                mNextText.setTextAppearance(context, i);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        j = attributeset.getDimensionPixelSize(1, 0);
        if (j != 0)
        {
            float f = j;
            try
            {
                setTextSize(0, f);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        if (attributeset.hasValue(2))
        {
            j = attributeset.getColor(2, 0);
            mPrevText.setTextColor(j);
            mCurrText.setTextColor(j);
            mNextText.setTextColor(j);
        }
        mGravity = attributeset.getInteger(3, 80);
        attributeset.recycle();
        mTextColor = mCurrText.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6F);
        mPrevText.setEllipsize(android.text.TextUtils.TruncateAt.END);
        mCurrText.setEllipsize(android.text.TextUtils.TruncateAt.END);
        mNextText.setEllipsize(android.text.TextUtils.TruncateAt.END);
        if (i != 0)
        {
            attributeset = context.obtainStyledAttributes(i, TEXT_ATTRS);
            flag = attributeset.getBoolean(0, false);
            attributeset.recycle();
        } else
        {
            flag = false;
        }
        if (flag)
        {
            try
            {
                setSingleLineAllCaps(mPrevText);
                setSingleLineAllCaps(mCurrText);
                setSingleLineAllCaps(mNextText);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            if (!flag2)
            {
                break MISSING_BLOCK_LABEL_366;
            }
        }
        mPrevText.setSingleLine();
        mCurrText.setSingleLine();
        mNextText.setSingleLine();
        i = (int)(context.getResources().getDisplayMetrics().density * 16F);
        try
        {
            mScaledTextSpacing = i;
            i = Fragment.a;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        if (i != 0)
        {
            if (flag2)
            {
                flag = flag1;
            } else
            {
                flag = true;
            }
            ViewPager.a = flag;
        }
        return;
    }

    private static void setSingleLineAllCaps(TextView textview)
    {
        IMPL.setSingleLineAllCaps(textview);
    }

    int getMinHeight()
    {
        int i = 0;
        Drawable drawable = getBackground();
        if (drawable != null)
        {
            i = drawable.getIntrinsicHeight();
        }
        return i;
    }

    public int getTextSpacing()
    {
        return mScaledTextSpacing;
    }

    protected void onAttachedToWindow()
    {
        Object obj;
        PagerAdapter pageradapter;
        super.onAttachedToWindow();
        obj = getParent();
        try
        {
            if (!(obj instanceof ViewPager))
            {
                throw new IllegalStateException(z[1]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        obj = (ViewPager)obj;
        pageradapter = ((ViewPager) (obj)).getAdapter();
        ((ViewPager) (obj)).setInternalPageChangeListener(mPageListener);
        ((ViewPager) (obj)).setOnAdapterChangeListener(mPageListener);
        mPager = ((ViewPager) (obj));
        if (mWatchingAdapter == null) goto _L2; else goto _L1
_L1:
        obj = (PagerAdapter)mWatchingAdapter.get();
_L4:
        updateAdapter(((PagerAdapter) (obj)), pageradapter);
        return;
        obj;
        throw obj;
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onDetachedFromWindow()
    {
        try
        {
            super.onDetachedFromWindow();
            if (mPager != null)
            {
                updateAdapter(mPager.getAdapter(), null);
                mPager.setInternalPageChangeListener(null);
                mPager.setOnAdapterChangeListener(null);
                mPager = null;
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        float f = 0.0F;
        ViewPager viewpager = mPager;
        if (viewpager != null)
        {
            IllegalStateException illegalstateexception;
            try
            {
                if (mLastKnownPositionOffset >= 0.0F)
                {
                    f = mLastKnownPositionOffset;
                }
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
            updateTextPositions(mLastKnownCurrentPage, f, true);
        }
        return;
        illegalstateexception;
        throw illegalstateexception;
    }

    protected void onMeasure(int i, int j)
    {
        int l = android.view.View.MeasureSpec.getMode(i);
        int k = android.view.View.MeasureSpec.getMode(j);
        i = android.view.View.MeasureSpec.getSize(i);
        j = android.view.View.MeasureSpec.getSize(j);
        if (l != 0x40000000)
        {
            try
            {
                throw new IllegalStateException(z[0]);
            }
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
        }
        l = getMinHeight();
        int i1 = getPaddingTop() + getPaddingBottom();
        int j1 = android.view.View.MeasureSpec.makeMeasureSpec((int)((float)i * 0.8F), 0x80000000);
        int k1 = android.view.View.MeasureSpec.makeMeasureSpec(j - i1, 0x80000000);
        boolean flag;
        try
        {
            mPrevText.measure(j1, k1);
            mCurrText.measure(j1, k1);
            mNextText.measure(j1, k1);
        }
        catch (IllegalStateException illegalstateexception1)
        {
            throw illegalstateexception1;
        }
        if (k != 0x40000000)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        setMeasuredDimension(i, j);
        flag = ViewPager.a;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        setMeasuredDimension(i, Math.max(l, mCurrText.getMeasuredHeight() + i1));
    }

    public void requestLayout()
    {
        try
        {
            if (!mUpdatingText)
            {
                super.requestLayout();
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
    }

    public void setNonPrimaryAlpha(float f)
    {
        mNonPrimaryAlpha = (int)(255F * f) & 0xff;
        int i = mNonPrimaryAlpha << 24 | mTextColor & 0xffffff;
        mPrevText.setTextColor(i);
        mNextText.setTextColor(i);
    }

    public void setTextSize(int i, float f)
    {
        mPrevText.setTextSize(i, f);
        mCurrText.setTextSize(i, f);
        mNextText.setTextSize(i, f);
    }

    public void setTextSpacing(int i)
    {
        mScaledTextSpacing = i;
        requestLayout();
    }

    void updateAdapter(PagerAdapter pageradapter, PagerAdapter pageradapter1)
    {
        if (pageradapter != null)
        {
            try
            {
                pageradapter.unregisterDataSetObserver(mPageListener);
                mWatchingAdapter = null;
            }
            // Misplaced declaration of an exception variable
            catch (PagerAdapter pageradapter)
            {
                throw pageradapter;
            }
        }
        if (pageradapter1 != null)
        {
            try
            {
                pageradapter1.registerDataSetObserver(mPageListener);
                mWatchingAdapter = new WeakReference(pageradapter1);
            }
            // Misplaced declaration of an exception variable
            catch (PagerAdapter pageradapter)
            {
                throw pageradapter;
            }
        }
        try
        {
            if (mPager != null)
            {
                mLastKnownCurrentPage = -1;
                mLastKnownPositionOffset = -1F;
                updateText(mPager.getCurrentItem(), pageradapter1);
                requestLayout();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PagerAdapter pageradapter)
        {
            throw pageradapter;
        }
    }

    void updateText(int i, PagerAdapter pageradapter)
    {
        Object obj = null;
        CharSequence charsequence;
        TextView textview;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        if (pageradapter != null)
        {
            try
            {
                j = pageradapter.getCount();
            }
            // Misplaced declaration of an exception variable
            catch (PagerAdapter pageradapter)
            {
                throw pageradapter;
            }
        } else
        {
            j = 0;
        }
        mUpdatingText = true;
        if (i >= 1 && pageradapter != null)
        {
            charsequence = pageradapter.getPageTitle(i - 1);
        } else
        {
            charsequence = null;
        }
        mPrevText.setText(charsequence);
        textview = mCurrText;
        if (pageradapter != null && i < j)
        {
            try
            {
                charsequence = pageradapter.getPageTitle(i);
            }
            // Misplaced declaration of an exception variable
            catch (PagerAdapter pageradapter)
            {
                throw pageradapter;
            }
        } else
        {
            charsequence = null;
        }
        textview.setText(charsequence);
        charsequence = obj;
        if (i + 1 < j)
        {
            charsequence = obj;
            if (pageradapter != null)
            {
                charsequence = pageradapter.getPageTitle(i + 1);
            }
        }
        mNextText.setText(charsequence);
        i1 = getWidth();
        j1 = getPaddingLeft();
        k1 = getPaddingRight();
        j = getHeight();
        k = getPaddingTop();
        l = getPaddingBottom();
        i1 = android.view.View.MeasureSpec.makeMeasureSpec((int)((float)(i1 - j1 - k1) * 0.8F), 0x80000000);
        j = android.view.View.MeasureSpec.makeMeasureSpec(j - k - l, 0x80000000);
        try
        {
            mPrevText.measure(i1, j);
            mCurrText.measure(i1, j);
            mNextText.measure(i1, j);
            mLastKnownCurrentPage = i;
            if (!mUpdatingPositions)
            {
                updateTextPositions(i, mLastKnownPositionOffset, false);
            }
        }
        // Misplaced declaration of an exception variable
        catch (PagerAdapter pageradapter)
        {
            throw pageradapter;
        }
        mUpdatingText = false;
        return;
        pageradapter;
        throw pageradapter;
    }

    void updateTextPositions(int i, float f, boolean flag)
    {
        boolean flag1 = ViewPager.a;
        int j = mLastKnownCurrentPage;
        if (i == j)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        updateText(i, mPager.getAdapter());
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        if (!flag)
        {
            float f1;
            IllegalStateException illegalstateexception;
            try
            {
                f1 = mLastKnownPositionOffset;
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
            if (f == f1)
            {
                return;
            }
        }
        break MISSING_BLOCK_LABEL_72;
        illegalstateexception;
        throw illegalstateexception;
        illegalstateexception;
        throw illegalstateexception;
        illegalstateexception;
        throw illegalstateexception;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
label0:
        {
            mUpdatingPositions = true;
            j1 = mPrevText.getMeasuredWidth();
            i = mCurrText.getMeasuredWidth();
            i1 = mNextText.getMeasuredWidth();
            k = i / 2;
            k1 = getWidth();
            int l2 = getHeight();
            i2 = getPaddingLeft();
            l1 = getPaddingRight();
            int l3 = getPaddingTop();
            int i3 = getPaddingBottom();
            l = l1 + k;
            float f3 = 0.5F + f;
            float f2 = f3;
            if (f3 > 1.0F)
            {
                f2 = f3 - 1.0F;
            }
            j2 = k1 - l - (int)(f2 * (float)(k1 - (i2 + k) - l)) - i / 2;
            k2 = j2 + i;
            int j3 = mPrevText.getBaseline();
            l = mCurrText.getBaseline();
            i = mNextText.getBaseline();
            k = Math.max(Math.max(j3, l), i);
            j3 = k - j3;
            int k3 = k - l;
            int i4 = k - i;
            i = mPrevText.getMeasuredHeight();
            k = mCurrText.getMeasuredHeight();
            l = mNextText.getMeasuredHeight();
            int j4 = Math.max(Math.max(i + j3, k + k3), l + i4);
            switch (mGravity & 0x70)
            {
            default:
                l = l3 + j3;
                k = l3 + k3;
                i = l3 + i4;
                if (!flag1)
                {
                    break label0;
                }
                // fall through

            case 16: // '\020'
                i = (l2 - l3 - i3 - j4) / 2;
                l = i + j3;
                k = i + k3;
                i += i4;
                if (!flag1)
                {
                    break label0;
                }
                // fall through

            case 80: // 'P'
                i = l2 - i3 - j4;
                l = i + j3;
                k = i + k3;
                i += i4;
                break;
            }
        }
        mCurrText.layout(j2, k, k2, mCurrText.getMeasuredHeight() + k);
        k = Math.min(i2, j2 - mScaledTextSpacing - j1);
        mPrevText.layout(k, l, j1 + k, mPrevText.getMeasuredHeight() + l);
        k = Math.max(k1 - l1 - i1, mScaledTextSpacing + k2);
        mNextText.layout(k, i, k + i1, mNextText.getMeasuredHeight() + i);
        mLastKnownPositionOffset = f;
        mUpdatingPositions = false;
        return;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "f\004m\034\"F\024\177\033wY\024>\037k_\031>\tl\013\024f\ta_Qi\001f_\031";
        byte1 = -1;
        i = 0;
_L10:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L7:
        if (k <= j)
        {
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "{\020y\rp\177\030j\004gx\005l\001r\013\034k\033v\013\023{Hc\013\025w\032gH\005>\013jB\035zHmMQ\177HTB\024i8cL\024lF";
                i = 1;
                byte1 = 0;
                continue; /* Loop/switch isn't completed */

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                break;
            }
            byte byte0;
            char c;
            try
            {
                ATTRS = (new int[] {
                    0x1010034, 0x1010095, 0x1010098, 0x10100af
                });
                TEXT_ATTRS = (new int[] {
                    0x101038c
                });
                if (android.os.Build.VERSION.SDK_INT >= 14)
                {
                    IMPL = new PagerTitleStripImplIcs();
                    break MISSING_BLOCK_LABEL_249;
                }
            }
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
            break MISSING_BLOCK_LABEL_239;
        }
        c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 212
    //                   1 218
    //                   2 224
    //                   3 230;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_230;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte0 = 2;
_L8:
        obj[j] = (char)(byte0 ^ c);
        j++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 43;
          goto _L8
_L3:
        byte0 = 113;
          goto _L8
_L4:
        byte0 = 30;
          goto _L8
        byte0 = 104;
          goto _L8
        if (true) goto _L10; else goto _L9
_L9:
    }


    private class PageListener extends DataSetObserver
        implements ViewPager.OnPageChangeListener, ViewPager.OnAdapterChangeListener
    {

        private int mScrollState;
        final PagerTitleStrip this$0;

        public void onAdapterChanged(PagerAdapter pageradapter, PagerAdapter pageradapter1)
        {
            updateAdapter(pageradapter, pageradapter1);
        }

        public void onChanged()
        {
            float f = 0.0F;
            updateText(mPager.getCurrentItem(), mPager.getAdapter());
            if (mLastKnownPositionOffset >= 0.0F)
            {
                f = mLastKnownPositionOffset;
            }
            updateTextPositions(mPager.getCurrentItem(), f, true);
        }

        public void onPageScrollStateChanged(int i)
        {
            mScrollState = i;
        }

        public void onPageScrolled(int i, float f, int j)
        {
            j = i;
            if (f > 0.5F)
            {
                j = i + 1;
            }
            updateTextPositions(j, f, false);
        }

        public void onPageSelected(int i)
        {
            float f = 0.0F;
            if (mScrollState == 0)
            {
                updateText(mPager.getCurrentItem(), mPager.getAdapter());
                if (mLastKnownPositionOffset >= 0.0F)
                {
                    f = mLastKnownPositionOffset;
                }
                updateTextPositions(mPager.getCurrentItem(), f, true);
            }
        }

        private PageListener()
        {
            this$0 = PagerTitleStrip.this;
            super();
        }

        PageListener(_cls1 _pcls1)
        {
            this();
        }
    }


    private class PagerTitleStripImpl
    {

        public abstract void setSingleLineAllCaps(TextView textview);
    }


    private class PagerTitleStripImplIcs
        implements PagerTitleStripImpl
    {

        public void setSingleLineAllCaps(TextView textview)
        {
            PagerTitleStripIcs.setSingleLineAllCaps(textview);
        }

        PagerTitleStripImplIcs()
        {
        }
    }


    private class PagerTitleStripImplBase
        implements PagerTitleStripImpl
    {

        public void setSingleLineAllCaps(TextView textview)
        {
            textview.setSingleLine();
        }

        PagerTitleStripImplBase()
        {
        }
    }

}
