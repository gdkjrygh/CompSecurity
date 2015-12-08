// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.walmart.android.app.shop.ShelfPriceView;
import com.walmart.android.service.wishlist.PurchasedItem;
import com.walmart.android.service.wishlist.models.ListItemModel;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ui.recycler.BasicAdapter;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmart.android.app.wishlist:
//            MatchedItemModel, QuantityEditorDialogFragment

public class MatchedItemsAdapter extends BasicAdapter
{
    public static interface OnSelectionChangedListener
    {

        public abstract void onSelectionChanged(boolean flag);
    }

    public class ViewHolder extends BasicViewHolder
    {

        final CheckBox mCheckBox;
        final TextView mItemName;
        MatchedItemModel mMatchedItemModel;
        final ShelfPriceView mPriceView;
        final ImageView mProductImage;
        final TextView mQtyEditor;
        boolean mSelfChange;
        final MatchedItemsAdapter this$0;

        void apply(MatchedItemModel matcheditemmodel)
        {
            mSelfChange = true;
            mMatchedItemModel = matcheditemmodel;
            matcheditemmodel = mMatchedItemModel.getItem();
            mCheckBox.setChecked(mMatchedItemModel.isSelected());
            mItemName.setText(matcheditemmodel.getName());
            Picasso.with(mActivity).load(matcheditemmodel.getImageUrl()).error(0x7f02021b).into(mProductImage);
            mPriceView.setPrice(matcheditemmodel.getReceiptPrice());
            mQtyEditor.setText(String.valueOf(mMatchedItemModel.getQuantity()));
            mSelfChange = false;
        }

        ViewHolder(View view)
        {
            this$0 = MatchedItemsAdapter.this;
            super(view);
            mCheckBox = (CheckBox)ViewUtil.findViewById(view, 0x7f100684);
            mItemName = (TextView)ViewUtil.findViewById(view, 0x7f1001a2);
            mProductImage = (ImageView)ViewUtil.findViewById(view, 0x7f100618);
            mPriceView = (ShelfPriceView)ViewUtil.findViewById(view, 0x7f10064f);
            mQtyEditor = (TextView)ViewUtil.findViewById(view, 0x7f100685);
            mCheckBox.setOnCheckedChangeListener(new _cls1());
            mQtyEditor.setOnClickListener(new _cls2());
        }
    }


    private final AppCompatActivity mActivity;
    private final ArrayList mItems = new ArrayList();
    private OnSelectionChangedListener mSelectionChangedListener;

    public MatchedItemsAdapter(AppCompatActivity appcompatactivity)
    {
        mActivity = appcompatactivity;
    }

    private void fireSelectionChangedEvent()
    {
        if (mSelectionChangedListener != null)
        {
            boolean flag1 = false;
            Iterator iterator = mItems.iterator();
            boolean flag;
            do
            {
                flag = flag1;
                if (!iterator.hasNext())
                {
                    break;
                }
                if (!((MatchedItemModel)iterator.next()).isSelected())
                {
                    continue;
                }
                flag = true;
                break;
            } while (true);
            mSelectionChangedListener.onSelectionChanged(flag);
        }
    }

    public int getItemCount()
    {
        return mItems.size();
    }

    public PurchasedItem[] getSelectedItems()
    {
        ArrayList arraylist = new ArrayList(getItemCount());
        Iterator iterator = mItems.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            MatchedItemModel matcheditemmodel = (MatchedItemModel)iterator.next();
            if (matcheditemmodel.isSelected())
            {
                arraylist.add(new PurchasedItem(matcheditemmodel.getItem().getId(), matcheditemmodel.getQuantity()));
            }
        } while (true);
        return (PurchasedItem[])arraylist.toArray(new PurchasedItem[arraylist.size()]);
    }

    public ViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return new ViewHolder(ViewUtil.inflate(mActivity, 0x7f0401f3, viewgroup));
    }

    public volatile BasicViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return onConstructViewHolder(viewgroup, i);
    }

    public void onPopulateViewHolder(ViewHolder viewholder, int i)
    {
        viewholder.apply((MatchedItemModel)mItems.get(i));
    }

    public volatile void onPopulateViewHolder(BasicViewHolder basicviewholder, int i)
    {
        onPopulateViewHolder((ViewHolder)basicviewholder, i);
    }

    public void setItems(List list)
    {
        mItems.clear();
        ListItemModel listitemmodel;
        for (list = list.iterator(); list.hasNext(); mItems.add(new MatchedItemModel(listitemmodel)))
        {
            listitemmodel = (ListItemModel)list.next();
        }

        notifyDataSetChanged();
    }

    public void setSelectionChangedListener(OnSelectionChangedListener onselectionchangedlistener)
    {
        mSelectionChangedListener = onselectionchangedlistener;
    }



    // Unreferenced inner class com/walmart/android/app/wishlist/MatchedItemsAdapter$ViewHolder$1

/* anonymous class */
    class ViewHolder._cls1
        implements android.widget.CompoundButton.OnCheckedChangeListener
    {

        final ViewHolder this$1;
        final MatchedItemsAdapter val$this$0;

        public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
        {
            if (!mSelfChange && flag != mMatchedItemModel.isSelected())
            {
                mMatchedItemModel.setSelected(flag);
                fireSelectionChangedEvent();
                notifyItemChanged(getAdapterPosition());
            }
        }

            
            {
                this$1 = final_viewholder;
                this$0 = MatchedItemsAdapter.this;
                super();
            }
    }


    // Unreferenced inner class com/walmart/android/app/wishlist/MatchedItemsAdapter$ViewHolder$2

/* anonymous class */
    class ViewHolder._cls2
        implements android.view.View.OnClickListener
    {

        final ViewHolder this$1;
        final MatchedItemsAdapter val$this$0;

        public void onClick(View view)
        {
            view = QuantityEditorDialogFragment.newInstance(mMatchedItemModel.getQuantity(), 1, mMatchedItemModel.getItem().getReceiptQuantity());
            view.setOnNewQuantityListener(new QuantityEditorDialogFragment.OnNewQuantityListener() {

                final ViewHolder._cls2 this$2;

                public void onNewQuantity(int i)
                {
    class ViewHolder._cls2
        implements android.view.View.OnClickListener
    {
                    mMatchedItemModel.setQuantity(i);
                    mQtyEditor.setText(String.valueOf(i));
                }

            
            {
                this$2 = ViewHolder._cls2.this;
                super();
            }
            });
            view.show(mActivity.getSupportFragmentManager(), "qtyDialog");
        }

            
            {
                this$1 = final_viewholder;
                this$0 = MatchedItemsAdapter.this;
                super();
            }
    }

}
