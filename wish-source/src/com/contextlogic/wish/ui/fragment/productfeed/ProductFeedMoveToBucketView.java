// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.analytics.Analytics;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.api.data.WishUserProductBucket;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.components.navigation.NavigationBarImageButton;
import com.contextlogic.wish.ui.components.navigation.WishNavigationBar;
import com.contextlogic.wish.user.LoggedInUser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedMoveToBucketAdapter

public class ProductFeedMoveToBucketView extends FrameLayout
{

    private com.contextlogic.wish.ui.fragment.menu.wishlist.MoveToWishlistMenuFragment.Callback callback;
    private NavigationBarImageButton closeButton;
    private ListView listView;
    private EditText nameEditText;
    private WishNavigationBar navigationBar;
    private ArrayList productBuckets;
    private ArrayList productIdsRemoved;
    private View removeButton;
    private ProductFeedMoveToBucketAdapter wishlistAdapter;

    public ProductFeedMoveToBucketView(Context context)
    {
        this(context, null);
    }

    public ProductFeedMoveToBucketView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ProductFeedMoveToBucketView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void handleCreate()
    {
        hideKeyboard();
        android.text.Editable editable = nameEditText.getText();
        if (editable != null && !editable.toString().trim().equals(""))
        {
            Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.Done, com.contextlogic.wish.analytics.Analytics.PageViewType.RenameBucket, com.contextlogic.wish.analytics.Analytics.LabelType.Click);
            if (callback != null)
            {
                callback.onBucketEdited(productIdsRemoved, editable.toString(), null);
            }
            return;
        } else
        {
            PopupAlertDialog.showError(getContext(), getContext().getString(0x7f060146), getContext().getString(0x7f0602b7));
            return;
        }
    }

    private void handleRemove()
    {
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(getContext())).create();
        alertdialog.setTitle(getContext().getString(0x7f060073));
        alertdialog.setMessage(WishApplication.getAppInstance().getQuantityString(0x7f070001, productIdsRemoved.size()));
        alertdialog.setButton(getContext().getString(0x7f0602d8), new android.content.DialogInterface.OnClickListener() {

            final ProductFeedMoveToBucketView this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

            
            {
                this$0 = ProductFeedMoveToBucketView.this;
                super();
            }
        });
        alertdialog.setButton2(getContext().getString(0x7f060488), new android.content.DialogInterface.OnClickListener() {

            final ProductFeedMoveToBucketView this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.HideProduct, com.contextlogic.wish.analytics.Analytics.PageViewType.MoveToBucket, com.contextlogic.wish.analytics.Analytics.LabelType.Click);
                if (callback != null)
                {
                    callback.onProductsRemoved(productIdsRemoved);
                }
            }

            
            {
                this$0 = ProductFeedMoveToBucketView.this;
                super();
            }
        });
        alertdialog.show();
    }

    private void hideKeyboard()
    {
        InputMethodManager inputmethodmanager = (InputMethodManager)getContext().getSystemService("input_method");
        if (inputmethodmanager != null)
        {
            inputmethodmanager.hideSoftInputFromWindow(nameEditText.getWindowToken(), 0);
        }
    }

    private void updateProductBuckets()
    {
        productBuckets.clear();
        ArrayList arraylist = new ArrayList();
        if (LoggedInUser.getInstance().getCurrentUser() != null)
        {
            Iterator iterator = LoggedInUser.getInstance().getCurrentUser().getProductBuckets().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                WishUserProductBucket wishuserproductbucket = (WishUserProductBucket)iterator.next();
                if (wishuserproductbucket.isEditable())
                {
                    if (wishuserproductbucket.getBucketId().equalsIgnoreCase("holiday_wishlist") || wishuserproductbucket.getBucketId().equalsIgnoreCase("birthday_wishlist"))
                    {
                        productBuckets.add(wishuserproductbucket);
                    } else
                    {
                        arraylist.add(wishuserproductbucket);
                    }
                }
            } while (true);
        }
        Collections.sort(arraylist, new Comparator() {

            final ProductFeedMoveToBucketView this$0;

            public int compare(WishUserProductBucket wishuserproductbucket1, WishUserProductBucket wishuserproductbucket2)
            {
                return wishuserproductbucket1.getName().compareToIgnoreCase(wishuserproductbucket2.getName());
            }

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((WishUserProductBucket)obj, (WishUserProductBucket)obj1);
            }

            
            {
                this$0 = ProductFeedMoveToBucketView.this;
                super();
            }
        });
        productBuckets.addAll(arraylist);
    }

    public void init()
    {
        Object obj = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030087, this);
        navigationBar = (WishNavigationBar)((View) (obj)).findViewById(0x7f0d0292);
        navigationBar.setBarColor(com.contextlogic.wish.ui.components.navigation.WishNavigationBar.NavigationBarColor.Modal);
        navigationBar.setTitle(getContext().getString(0x7f0602b6));
        closeButton = new NavigationBarImageButton(getContext());
        closeButton.setButtonMode(com.contextlogic.wish.ui.components.navigation.NavigationBarImageButton.ButtonMode.BackGray);
        closeButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ProductFeedMoveToBucketView this$0;

            public void onClick(View view)
            {
                hideKeyboard();
                Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.Dismiss, com.contextlogic.wish.analytics.Analytics.PageViewType.MoveToBucket, com.contextlogic.wish.analytics.Analytics.LabelType.Click);
                if (callback != null)
                {
                    callback.onBucketEditCancelled();
                }
            }

            
            {
                this$0 = ProductFeedMoveToBucketView.this;
                super();
            }
        });
        navigationBar.setLeftButton(closeButton);
        nameEditText = (EditText)((View) (obj)).findViewById(0x7f0d0293);
        nameEditText.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final ProductFeedMoveToBucketView this$0;

            public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                if (i == 6)
                {
                    handleCreate();
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = ProductFeedMoveToBucketView.this;
                super();
            }
        });
        removeButton = ((View) (obj)).findViewById(0x7f0d0296);
        removeButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ProductFeedMoveToBucketView this$0;

            public void onClick(View view)
            {
                handleRemove();
            }

            
            {
                this$0 = ProductFeedMoveToBucketView.this;
                super();
            }
        });
        productBuckets = new ArrayList();
        ((Button)((View) (obj)).findViewById(0x7f0d0294)).setOnClickListener(new android.view.View.OnClickListener() {

            final ProductFeedMoveToBucketView this$0;

            public void onClick(View view)
            {
                handleCreate();
            }

            
            {
                this$0 = ProductFeedMoveToBucketView.this;
                super();
            }
        });
        listView = (ListView)((View) (obj)).findViewById(0x7f0d0295);
        wishlistAdapter = new ProductFeedMoveToBucketAdapter(getContext(), productBuckets);
        obj = new LinearLayout(getContext());
        ((LinearLayout) (obj)).setOrientation(0);
        ((LinearLayout) (obj)).setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, (int)TypedValue.applyDimension(1, 80F, getResources().getDisplayMetrics())));
        listView.addFooterView(((View) (obj)));
        listView.setAdapter(wishlistAdapter);
        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final ProductFeedMoveToBucketView this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.Done, com.contextlogic.wish.analytics.Analytics.PageViewType.RenameBucket, com.contextlogic.wish.analytics.Analytics.LabelType.Click);
                if (callback != null && i < productBuckets.size())
                {
                    adapterview = (WishUserProductBucket)productBuckets.get(i);
                    callback.onBucketEdited(productIdsRemoved, adapterview.getName(), adapterview.getBucketId());
                }
            }

            
            {
                this$0 = ProductFeedMoveToBucketView.this;
                super();
            }
        });
    }

    public void onBackPressed()
    {
        hideKeyboard();
        Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.Dismiss, com.contextlogic.wish.analytics.Analytics.PageViewType.MoveToBucket, com.contextlogic.wish.analytics.Analytics.LabelType.Click);
        if (callback != null)
        {
            callback.onBucketEditCancelled();
        }
    }

    public void setCallback(com.contextlogic.wish.ui.fragment.menu.wishlist.MoveToWishlistMenuFragment.Callback callback1)
    {
        callback = callback1;
    }

    public void show(ArrayList arraylist)
    {
        Analytics.getInstance().trackPageView(com.contextlogic.wish.analytics.Analytics.PageViewType.MoveToBucket);
        nameEditText.setText(null);
        productIdsRemoved = arraylist;
        listView.post(new Runnable() {

            final ProductFeedMoveToBucketView this$0;

            public void run()
            {
                updateProductBuckets();
                wishlistAdapter.notifyDataSetChanged();
            }

            
            {
                this$0 = ProductFeedMoveToBucketView.this;
                super();
            }
        });
    }








}
