// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.actionbarsherlock.internal.view.View_HasStateListenerSupport;
import com.actionbarsherlock.internal.view.View_OnAttachStateChangeListener;
import com.actionbarsherlock.internal.widget.IcsListPopupWindow;
import com.actionbarsherlock.view.MenuItem;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            MenuPresenter, MenuBuilder, SubMenuBuilder, MenuItemImpl

public class MenuPopupHelper
    implements android.widget.AdapterView.OnItemClickListener, android.view.View.OnKeyListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.widget.PopupWindow.OnDismissListener, View_OnAttachStateChangeListener, MenuPresenter
{

    static final int ITEM_LAYOUT;
    private static final String z;
    private MenuAdapter mAdapter;
    private View mAnchorView;
    private Context mContext;
    boolean mForceShowIcon;
    private LayoutInflater mInflater;
    private ViewGroup mMeasureParent;
    private MenuBuilder mMenu;
    private boolean mOverflowOnly;
    private IcsListPopupWindow mPopup;
    private int mPopupMaxWidth;
    private MenuPresenter.Callback mPresenterCallback;
    private ViewTreeObserver mTreeObserver;

    public MenuPopupHelper(Context context, MenuBuilder menubuilder)
    {
        this(context, menubuilder, null, false);
    }

    public MenuPopupHelper(Context context, MenuBuilder menubuilder, View view, boolean flag)
    {
        mContext = context;
        mInflater = LayoutInflater.from(context);
        mMenu = menubuilder;
        mOverflowOnly = flag;
        context = context.getResources();
        mPopupMaxWidth = Math.max(context.getDisplayMetrics().widthPixels / 2, context.getDimensionPixelSize(com.actionbarsherlock.R.dimen.abs__config_prefDialogWidth));
        mAnchorView = view;
        menubuilder.addMenuPresenter(this);
    }

    private int measureContentWidth(ListAdapter listadapter)
    {
        int i = 0;
        int i1 = MenuBuilder.a;
        int j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int k1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int l1 = listadapter.getCount();
        int k = 0;
        int j = 0;
        View view = null;
        do
        {
label0:
            {
                int l = i;
                if (k < l1)
                {
                    l = listadapter.getItemViewType(k);
                    if (l != j)
                    {
                        view = null;
                        j = l;
                    }
                    try
                    {
                        if (mMeasureParent == null)
                        {
                            mMeasureParent = new FrameLayout(mContext);
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (ListAdapter listadapter)
                    {
                        throw listadapter;
                    }
                    view = listadapter.getView(k, view, mMeasureParent);
                    view.measure(j1, k1);
                    i = Math.max(i, view.getMeasuredWidth());
                    if (i1 == 0)
                    {
                        break label0;
                    }
                    l = i;
                }
                return l;
            }
            k++;
        } while (true);
    }

    public boolean collapseItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
    {
        return false;
    }

    public void dismiss()
    {
        try
        {
            if (isShowing())
            {
                mPopup.dismiss();
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
    }

    public boolean expandItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
    {
        return false;
    }

    public boolean flagActionItems()
    {
        return false;
    }

    public void initForMenu(Context context, MenuBuilder menubuilder)
    {
    }

    public boolean isShowing()
    {
        IcsListPopupWindow icslistpopupwindow;
        try
        {
            icslistpopupwindow = mPopup;
        }
        catch (IllegalStateException illegalstateexception)
        {
            try
            {
                throw illegalstateexception;
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
        }
        if (icslistpopupwindow == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        if (mPopup.isShowing())
        {
            return true;
        }
        return false;
    }

    public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
        MenuBuilder menubuilder1;
        try
        {
            menubuilder1 = mMenu;
        }
        // Misplaced declaration of an exception variable
        catch (MenuBuilder menubuilder)
        {
            throw menubuilder;
        }
        if (menubuilder == menubuilder1)
        {
            try
            {
                dismiss();
                if (mPresenterCallback != null)
                {
                    mPresenterCallback.onCloseMenu(menubuilder, flag);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (MenuBuilder menubuilder)
            {
                throw menubuilder;
            }
        }
    }

    public void onDismiss()
    {
        ViewTreeObserver viewtreeobserver;
        mPopup = null;
        mMenu.close();
        viewtreeobserver = mTreeObserver;
        if (viewtreeobserver != null)
        {
            IllegalStateException illegalstateexception;
            try
            {
                if (!mTreeObserver.isAlive())
                {
                    mTreeObserver = mAnchorView.getViewTreeObserver();
                }
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
            mTreeObserver.removeGlobalOnLayoutListener(this);
            mTreeObserver = null;
        }
        ((View_HasStateListenerSupport)mAnchorView).removeOnAttachStateChangeListener(this);
        return;
        illegalstateexception;
        throw illegalstateexception;
    }

    public void onGlobalLayout()
    {
        View view;
        if (!isShowing())
        {
            break MISSING_BLOCK_LABEL_51;
        }
        view = mAnchorView;
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        boolean flag = view.isShown();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        IllegalStateException illegalstateexception;
        int i;
        try
        {
            dismiss();
            i = MenuBuilder.a;
        }
        catch (IllegalStateException illegalstateexception1)
        {
            try
            {
                throw illegalstateexception1;
            }
            catch (IllegalStateException illegalstateexception2)
            {
                throw illegalstateexception2;
            }
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        if (isShowing())
        {
            mPopup.show();
        }
        return;
        illegalstateexception;
        throw illegalstateexception;
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = mAdapter;
        ((MenuAdapter) (adapterview)).mAdapterMenu.performItemAction(adapterview.getItem(i), 0);
    }

    public boolean onKey(View view, int i, KeyEvent keyevent)
    {
        int j = keyevent.getAction();
        if (j == 1 && i == 82)
        {
            try
            {
                dismiss();
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            return true;
        } else
        {
            return false;
        }
        view;
        throw view;
    }

    public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
    {
        int j = MenuBuilder.a;
        if (!submenubuilder.hasVisibleItems()) goto _L2; else goto _L1
_L1:
        MenuPopupHelper menupopuphelper;
        int i;
        int k;
        boolean flag;
        menupopuphelper = new MenuPopupHelper(mContext, submenubuilder, mAnchorView, false);
        menupopuphelper.setCallback(mPresenterCallback);
        k = submenubuilder.size();
        i = 0;
        flag = false;
_L9:
        Object obj;
        boolean flag1;
        flag1 = flag;
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = submenubuilder.getItem(i);
        flag1 = flag;
        if (!((MenuItem) (obj)).isVisible()) goto _L4; else goto _L3
_L3:
        obj = ((MenuItem) (obj)).getIcon();
        flag1 = flag;
        if (obj == null) goto _L4; else goto _L5
_L5:
        if (j == 0) goto _L7; else goto _L6
_L6:
        flag1 = true;
_L4:
        i++;
        flag = flag1;
        if (j == 0) goto _L9; else goto _L8
_L8:
        menupopuphelper.setForceShowIcon(flag1);
        flag = menupopuphelper.tryShow();
        if (flag)
        {
            try
            {
                if (mPresenterCallback != null)
                {
                    mPresenterCallback.onOpenSubMenu(submenubuilder);
                }
            }
            // Misplaced declaration of an exception variable
            catch (SubMenuBuilder submenubuilder)
            {
                throw submenubuilder;
            }
            return true;
        }
          goto _L2
        submenubuilder;
        throw submenubuilder;
        submenubuilder;
        throw submenubuilder;
_L2:
        return false;
_L7:
        flag1 = true;
        if (true) goto _L8; else goto _L10
_L10:
    }

    public void onViewAttachedToWindow(View view)
    {
    }

    public void onViewDetachedFromWindow(View view)
    {
        ViewTreeObserver viewtreeobserver = mTreeObserver;
        if (viewtreeobserver != null)
        {
            try
            {
                if (!mTreeObserver.isAlive())
                {
                    mTreeObserver = view.getViewTreeObserver();
                }
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            mTreeObserver.removeGlobalOnLayoutListener(this);
        }
        ((View_HasStateListenerSupport)view).removeOnAttachStateChangeListener(this);
        return;
        view;
        throw view;
    }

    public void setAnchorView(View view)
    {
        mAnchorView = view;
    }

    public void setCallback(MenuPresenter.Callback callback)
    {
        mPresenterCallback = callback;
    }

    public void setForceShowIcon(boolean flag)
    {
        mForceShowIcon = flag;
    }

    public void show()
    {
        try
        {
            if (!tryShow())
            {
                throw new IllegalStateException(z);
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
    }

    public boolean tryShow()
    {
        mPopup = new IcsListPopupWindow(mContext, null, com.actionbarsherlock.R.attr.popupMenuStyle);
        mPopup.setOnDismissListener(this);
        mPopup.setOnItemClickListener(this);
        mAdapter = new MenuAdapter(mMenu);
        mPopup.setAdapter(mAdapter);
        mPopup.setModal(true);
        View view = mAnchorView;
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        ViewTreeObserver viewtreeobserver;
        int i;
        try
        {
            viewtreeobserver = mTreeObserver;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        if (viewtreeobserver == null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        try
        {
            mTreeObserver = view.getViewTreeObserver();
        }
        catch (IllegalStateException illegalstateexception1)
        {
            throw illegalstateexception1;
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        mTreeObserver.addOnGlobalLayoutListener(this);
        try
        {
            ((View_HasStateListenerSupport)view).addOnAttachStateChangeListener(this);
            mPopup.setAnchorView(view);
            i = MenuBuilder.a;
        }
        catch (IllegalStateException illegalstateexception2)
        {
            throw illegalstateexception2;
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        return false;
        mPopup.setContentWidth(Math.min(measureContentWidth(mAdapter), mPopupMaxWidth));
        mPopup.setInputMethodMode(2);
        mPopup.show();
        mPopup.getListView().setOnKeyListener(this);
        return true;
    }

    public void updateMenuView(boolean flag)
    {
        try
        {
            if (mAdapter != null)
            {
                mAdapter.notifyDataSetChanged();
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "l&O\026MN3T\023UD/Q\006o\001 @\rsN7\001\001x\0016R\006y\0014H\027uN6UC|Oc@\r~I,S".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            ITEM_LAYOUT = com.actionbarsherlock.R.layout.abs__popup_menu_item_layout;
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 76
    //                   0 94
    //                   1 100
    //                   2 106
    //                   3 112;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_112;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 29;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 33;
          goto _L8
_L3:
        byte0 = 67;
          goto _L8
_L4:
        byte0 = 33;
          goto _L8
        byte0 = 99;
          goto _L8
    }





    private class MenuAdapter extends BaseAdapter
    {
        private class ExpandedIndexObserver extends DataSetObserver
        {

            final MenuPopupHelper this$0;

            public void onChanged()
            {
                mAdapter.findExpandedIndex();
            }

            private ExpandedIndexObserver()
            {
                this$0 = MenuPopupHelper.this;
                super();
            }

            ExpandedIndexObserver(_cls1 _pcls1)
            {
                this();
            }
        }


        private MenuBuilder mAdapterMenu;
        private int mExpandedIndex;
        final MenuPopupHelper this$0;

        void findExpandedIndex()
        {
            MenuItemImpl menuitemimpl;
            int j;
            j = MenuBuilder.a;
            menuitemimpl = mMenu.getExpandedItem();
            if (menuitemimpl == null) goto _L2; else goto _L1
_L1:
            ArrayList arraylist;
            int i;
            int k;
            arraylist = mMenu.getNonActionItems();
            k = arraylist.size();
            i = 0;
_L6:
            if (i >= k) goto _L2; else goto _L3
_L3:
            if ((MenuItemImpl)arraylist.get(i) == menuitemimpl)
            {
                mExpandedIndex = i;
                return;
            }
            if (j == 0) goto _L4; else goto _L2
_L2:
            mExpandedIndex = -1;
            return;
_L4:
            i++;
            if (true) goto _L6; else goto _L5
_L5:
        }

        public int getCount()
        {
            ArrayList arraylist;
            if (mOverflowOnly)
            {
                arraylist = mAdapterMenu.getNonActionItems();
            } else
            {
                arraylist = mAdapterMenu.getVisibleItems();
            }
            if (mExpandedIndex < 0)
            {
                return arraylist.size();
            } else
            {
                return arraylist.size() - 1;
            }
        }

        public MenuItemImpl getItem(int i)
        {
            ArrayList arraylist;
            int j;
            if (mOverflowOnly)
            {
                arraylist = mAdapterMenu.getNonActionItems();
            } else
            {
                arraylist = mAdapterMenu.getVisibleItems();
            }
            j = i;
            if (mExpandedIndex >= 0)
            {
                j = i;
                if (i >= mExpandedIndex)
                {
                    j = i + 1;
                }
            }
            return (MenuItemImpl)arraylist.get(j);
        }

        public Object getItem(int i)
        {
            return getItem(i);
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            if (view == null)
            {
                view = mInflater.inflate(MenuPopupHelper.ITEM_LAYOUT, viewgroup, false);
            }
            viewgroup = (MenuView.ItemView)view;
            if (mForceShowIcon)
            {
                ((ListMenuItemView)view).setForceShowIcon(true);
            }
            viewgroup.initialize(getItem(i), 0);
            return view;
        }


        public MenuAdapter(MenuBuilder menubuilder)
        {
            this$0 = MenuPopupHelper.this;
            super();
            mExpandedIndex = -1;
            mAdapterMenu = menubuilder;
            registerDataSetObserver(new ExpandedIndexObserver(null));
            findExpandedIndex();
        }
    }

}
