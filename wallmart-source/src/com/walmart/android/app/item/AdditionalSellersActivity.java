// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.walmart.android.app.main.FullScreenActivity;
import com.walmart.android.service.item.BuyingOptionModel;
import com.walmart.android.service.item.ItemPrice;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmui.Typefaces;
import com.walmartlabs.ui.recycler.BasicAdapter;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import com.walmartlabs.ui.recycler.ListRecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmart.android.app.item:
//            ItemPriceView

public class AdditionalSellersActivity extends FullScreenActivity
{
    private static class Adapter extends BasicAdapter
    {

        private final Context mContext;
        private List mData;
        private String mSelectedSeller;

        public SellerInfo getItem(int i)
        {
            return (SellerInfo)mData.get(i);
        }

        public int getItemCount()
        {
            return mData.size();
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public ViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
        {
            return new ViewHolder(ViewUtil.inflate(mContext, 0x7f04007a, viewgroup));
        }

        public volatile BasicViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
        {
            return onConstructViewHolder(viewgroup, i);
        }

        public void onPopulateViewHolder(ViewHolder viewholder, int i)
        {
            if (mData != null)
            {
                SellerInfo sellerinfo = (SellerInfo)mData.get(i);
                if (sellerinfo != null)
                {
                    viewholder.updateView(sellerinfo, mSelectedSeller);
                }
            }
        }

        public volatile void onPopulateViewHolder(BasicViewHolder basicviewholder, int i)
        {
            onPopulateViewHolder((ViewHolder)basicviewholder, i);
        }

        public Adapter(Context context, ArrayList arraylist, String s)
        {
            mData = new ArrayList();
            mContext = context;
            mData = arraylist;
            mSelectedSeller = s;
        }
    }

    private static class AdditionalSellersPresenter extends Presenter
    {

        private final AdditionalSellersActivity mActivity;
        private final Adapter mAdapter;
        private View mRootView;

        public View getView()
        {
            if (mRootView != null)
            {
                ListRecyclerView listrecyclerview = (ListRecyclerView)ViewUtil.findViewById(mRootView, 0x7f1001aa);
                listrecyclerview.setOnItemClickListener(new com.walmartlabs.ui.recycler.BasicRecyclerView.OnItemClickListener() {

                    final AdditionalSellersPresenter this$0;

                    public void onItemClick(BasicViewHolder basicviewholder, int i)
                    {
                        basicviewholder = mAdapter.getItem(i);
                        mActivity.finishWithSellerId(((SellerInfo) (basicviewholder)).id);
                    }

            
            {
                this$0 = AdditionalSellersPresenter.this;
                super();
            }
                });
                listrecyclerview.setAdapter(mAdapter);
            }
            return mRootView;
        }

        protected void onCreateView(ViewGroup viewgroup)
        {
            if (mRootView == null)
            {
                mRootView = ViewUtil.inflate(mActivity, 0x7f040078);
            }
        }



        public AdditionalSellersPresenter(Activity activity, ArrayList arraylist, String s)
        {
            mActivity = (AdditionalSellersActivity)activity;
            mAdapter = new Adapter(mActivity, arraylist, s);
            setTitleText(mActivity.getString(0x7f09016b));
        }
    }

    private static class HelpScreen extends DialogFragment
    {

        public Dialog onCreateDialog(Bundle bundle)
        {
            bundle = getActivity().getLayoutInflater();
            com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(getActivity());
            builder.setView(bundle.inflate(0x7f040079, null)).setNeutralButton(0x7f090070, null);
            return builder.create();
        }

        private HelpScreen()
        {
        }

    }

    private static class SellerInfo
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SellerInfo createFromParcel(Parcel parcel)
            {
                return new SellerInfo(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public SellerInfo[] newArray(int i)
            {
                return new SellerInfo[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        final String id;
        final String name;
        final String price;
        final boolean submap;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(name);
            parcel.writeString(price);
            parcel.writeString(id);
            if (submap)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeByte((byte)i);
        }


        protected SellerInfo(Parcel parcel)
        {
            name = parcel.readString();
            price = parcel.readString();
            id = parcel.readString();
            boolean flag;
            if (parcel.readByte() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            submap = flag;
        }

        SellerInfo(String s, String s1, String s2, boolean flag)
        {
            name = s;
            price = s1;
            id = s2;
            submap = flag;
        }
    }

    private static class ViewHolder extends BasicViewHolder
    {

        public Context mContext;
        public ItemPriceView price;
        public LinearLayout priceContainer;
        public TextView priceInCart;
        public RadioButton selected;
        public TextView seller;

        public void updateView(SellerInfo sellerinfo, String s)
        {
            selected.setChecked(sellerinfo.id.equals(s));
            seller.setText(sellerinfo.name);
            if (sellerinfo.submap)
            {
                priceContainer.setVisibility(8);
                priceInCart.setTypeface(Typefaces.create(mContext, com.walmart.android.wmui.Typefaces.Family.MEDIUM));
                priceInCart.setVisibility(0);
                return;
            } else
            {
                priceInCart.setVisibility(8);
                price.setPrice(sellerinfo.price);
                priceContainer.setVisibility(0);
                return;
            }
        }

        public ViewHolder(View view)
        {
            super(view);
            selected = (RadioButton)ViewUtil.findViewById(view, 0x7f1001ab);
            seller = (TextView)ViewUtil.findViewById(view, 0x7f1001ac);
            price = (ItemPriceView)ViewUtil.findViewById(view, 0x7f1001ae);
            priceInCart = (TextView)ViewUtil.findViewById(view, 0x7f1001b0);
            priceContainer = (LinearLayout)ViewUtil.findViewById(view, 0x7f1001ad);
            mContext = view.getContext();
        }
    }


    private static final String EXTRA_SELLERS = "sellers";
    private static final String EXTRA_SELLER_ID = "seller_id";

    public AdditionalSellersActivity()
    {
    }

    private static ArrayList buyingOptionModelListToSellerInfoList(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        BuyingOptionModel buyingoptionmodel;
        for (list = list.iterator(); list.hasNext(); arraylist.add(new SellerInfo(buyingoptionmodel.getSellerName(), buyingoptionmodel.getPrice().getPriceString(), buyingoptionmodel.getSellerId(), buyingoptionmodel.getPrice().isSubmap())))
        {
            buyingoptionmodel = (BuyingOptionModel)list.next();
        }

        return arraylist;
    }

    public static BuyingOptionModel getSelectedSeller(Intent intent, List list)
    {
label0:
        {
            intent = intent.getStringExtra("seller_id");
            if (TextUtils.isEmpty(intent))
            {
                break label0;
            }
            list = list.iterator();
            BuyingOptionModel buyingoptionmodel;
            do
            {
                if (!list.hasNext())
                {
                    break label0;
                }
                buyingoptionmodel = (BuyingOptionModel)list.next();
            } while (!buyingoptionmodel.getSellerId().equals(intent));
            return buyingoptionmodel;
        }
        return null;
    }

    public static void launch(Activity activity, int i, List list, BuyingOptionModel buyingoptionmodel)
    {
        Intent intent = new Intent(activity, com/walmart/android/app/item/AdditionalSellersActivity);
        intent.putParcelableArrayListExtra("sellers", buyingOptionModelListToSellerInfoList(list));
        if (buyingoptionmodel != null)
        {
            intent.putExtra("seller_id", buyingoptionmodel.getSellerId());
        }
        activity.startActivityForResult(intent, i);
    }

    public void finishWithSellerId(String s)
    {
        Intent intent = new Intent();
        intent.putExtra("seller_id", s);
        setResult(-1, intent);
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Object obj = null;
        PresenterStack presenterstack = getPresenterStack();
        Object obj1 = getIntent();
        bundle = obj;
        if (obj1 != null)
        {
            ArrayList arraylist = ((Intent) (obj1)).getParcelableArrayListExtra("sellers");
            obj1 = ((Intent) (obj1)).getStringExtra("seller_id");
            bundle = obj;
            if (arraylist != null)
            {
                bundle = obj;
                if (!arraylist.isEmpty())
                {
                    bundle = new AdditionalSellersPresenter(this, arraylist, ((String) (obj1)));
                }
            }
        }
        setResult(0);
        if (bundle != null)
        {
            ActionBar actionbar = getSupportActionBar();
            if (actionbar != null)
            {
                actionbar.setDisplayHomeAsUpEnabled(true);
                actionbar.setDisplayShowTitleEnabled(true);
            }
            presenterstack.pushPresenter(bundle, false);
        } else
        if (presenterstack.peek() == null)
        {
            finish();
            return;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.clear();
        getMenuInflater().inflate(0x7f120000, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x7f10068c)
        {
            (new HelpScreen()).show(getSupportFragmentManager(), "HelpDialogFragment");
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        return true;
    }
}
