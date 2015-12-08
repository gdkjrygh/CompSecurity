// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ListPopupWindow;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            SpinnerCompat, ViewUtils

private class dismiss extends ListPopupWindow
    implements dismiss
{

    private ListAdapter mAdapter;
    private CharSequence mHintText;
    final SpinnerCompat this$0;

    void computeContentWidth()
    {
        Drawable drawable = getBackground();
        int i = 0;
        int i1;
        int j1;
        int k1;
        if (drawable != null)
        {
            drawable.getPadding(SpinnerCompat.access$400(SpinnerCompat.this));
            int j;
            int k;
            int l;
            if (ViewUtils.isLayoutRtl(SpinnerCompat.this))
            {
                i = SpinnerCompat.access$400(SpinnerCompat.this).right;
            } else
            {
                i = -SpinnerCompat.access$400(SpinnerCompat.this).left;
            }
        } else
        {
            Rect rect = SpinnerCompat.access$400(SpinnerCompat.this);
            SpinnerCompat.access$400(SpinnerCompat.this).right = 0;
            rect.left = 0;
        }
        i1 = getPaddingLeft();
        j1 = getPaddingRight();
        k1 = getWidth();
        if (mDropDownWidth == -2)
        {
            k = measureContentWidth((SpinnerAdapter)mAdapter, getBackground());
            l = getContext().getResources().getDisplayMetrics().widthPixels - SpinnerCompat.access$400(SpinnerCompat.this).left - SpinnerCompat.access$400(SpinnerCompat.this).right;
            j = k;
            if (k > l)
            {
                j = l;
            }
            setContentWidth(Math.max(j, k1 - i1 - j1));
        } else
        if (mDropDownWidth == -1)
        {
            setContentWidth(k1 - i1 - j1);
        } else
        {
            setContentWidth(mDropDownWidth);
        }
        if (ViewUtils.isLayoutRtl(SpinnerCompat.this))
        {
            i += k1 - j1 - getWidth();
        } else
        {
            i += i1;
        }
        setHorizontalOffset(i);
    }

    public CharSequence getHintText()
    {
        return mHintText;
    }

    public void setAdapter(ListAdapter listadapter)
    {
        super.setAdapter(listadapter);
        mAdapter = listadapter;
    }

    public void setPromptText(CharSequence charsequence)
    {
        mHintText = charsequence;
    }

    public void show(int i, int j)
    {
        boolean flag = isShowing();
        computeContentWidth();
        setInputMethodMode(2);
        super.show();
        getListView().setChoiceMode(1);
        setSelection(getSelectedItemPosition());
        ViewTreeObserver viewtreeobserver;
        if (!flag)
        {
            if ((viewtreeobserver = getViewTreeObserver()) != null)
            {
                final android.view.outListener layoutListener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                    final SpinnerCompat.DropdownPopup this$1;

                    public void onGlobalLayout()
                    {
                        computeContentWidth();
                        show();
                    }

            
            {
                this$1 = SpinnerCompat.DropdownPopup.this;
                super();
            }
                };
                viewtreeobserver.addOnGlobalLayoutListener(layoutListener);
                setOnDismissListener(new android.widget.PopupWindow.OnDismissListener() {

                    final SpinnerCompat.DropdownPopup this$1;
                    final android.view.ViewTreeObserver.OnGlobalLayoutListener val$layoutListener;

                    public void onDismiss()
                    {
                        ViewTreeObserver viewtreeobserver1 = getViewTreeObserver();
                        if (viewtreeobserver1 != null)
                        {
                            viewtreeobserver1.removeGlobalOnLayoutListener(layoutListener);
                        }
                    }

            
            {
                this$1 = SpinnerCompat.DropdownPopup.this;
                layoutListener = ongloballayoutlistener;
                super();
            }
                });
                return;
            }
        }
    }



    public _cls3.val.layoutListener(Context context, AttributeSet attributeset, int i)
    {
        this.this$0 = SpinnerCompat.this;
        super(context, attributeset, i);
        setAnchorView(SpinnerCompat.this);
        setModal(true);
        setPromptPosition(0);
        setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final SpinnerCompat.DropdownPopup this$1;
            final SpinnerCompat val$this$0;

            public void onItemClick(AdapterView adapterview, View view, int j, long l)
            {
                setSelection(j);
                if (mOnItemClickListener != null)
                {
                    performItemClick(view, j, mAdapter.getItemId(j));
                }
                dismiss();
            }

            
            {
                this$1 = SpinnerCompat.DropdownPopup.this;
                this$0 = spinnercompat;
                super();
            }
        });
    }
}
