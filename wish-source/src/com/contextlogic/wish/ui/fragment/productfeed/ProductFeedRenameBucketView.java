// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.contextlogic.wish.analytics.Analytics;
import com.contextlogic.wish.api.data.WishTag;
import com.contextlogic.wish.api.service.TagSearchService;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.components.list.SectionedListView;
import com.contextlogic.wish.ui.components.navigation.NavigationBarGrayTextButton;
import com.contextlogic.wish.ui.components.navigation.NavigationBarImageButton;
import com.contextlogic.wish.ui.components.navigation.WishNavigationBar;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedRenameBucketAdapter

public class ProductFeedRenameBucketView extends FrameLayout
{
    public static interface Callback
    {

        public abstract void onBucketRenameCanceled();

        public abstract void onBucketRenamed(String s);
    }


    private ArrayList autocompleteData;
    private Callback callback;
    private NavigationBarImageButton closeButton;
    private SectionedListView listView;
    private EditText nameEditText;
    private WishNavigationBar navigationBar;
    private NavigationBarGrayTextButton saveButton;
    private ProductFeedRenameBucketAdapter tagAutocompleteAdapter;
    private TagSearchService tagSearchService;

    public ProductFeedRenameBucketView(Context context)
    {
        this(context, null);
    }

    public ProductFeedRenameBucketView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ProductFeedRenameBucketView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void clearTagAutocomplete()
    {
        tagSearchService.cancelAllRequests();
        autocompleteData.clear();
        tagAutocompleteAdapter.notifyDataSetChanged();
    }

    private void getTagAutocomplete(String s)
    {
        tagAutocompleteAdapter.notifyDataSetChanged();
        tagSearchService.requestService(s, new com.contextlogic.wish.api.service.TagSearchService.SuccessCallback() {

            final ProductFeedRenameBucketView this$0;

            public void onServiceSucceeded(ArrayList arraylist)
            {
                autocompleteData.clear();
                autocompleteData.addAll(arraylist);
                tagAutocompleteAdapter.notifyDataSetChanged();
            }

            
            {
                this$0 = ProductFeedRenameBucketView.this;
                super();
            }
        }, null);
    }

    private void handleSave()
    {
        hideKeyboard();
        Editable editable = nameEditText.getText();
        if (editable != null && !editable.toString().trim().equals(""))
        {
            clearTagAutocomplete();
            Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.Done, com.contextlogic.wish.analytics.Analytics.PageViewType.RenameBucket, com.contextlogic.wish.analytics.Analytics.LabelType.Click);
            if (callback != null)
            {
                callback.onBucketRenamed(editable.toString());
            }
            return;
        } else
        {
            PopupAlertDialog.showError(getContext(), getContext().getString(0x7f06030d), getContext().getString(0x7f0602b7));
            return;
        }
    }

    private void hideKeyboard()
    {
        InputMethodManager inputmethodmanager = (InputMethodManager)getContext().getSystemService("input_method");
        if (inputmethodmanager != null)
        {
            inputmethodmanager.hideSoftInputFromWindow(nameEditText.getWindowToken(), 0);
        }
    }

    public void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f03008a, this);
        navigationBar = (WishNavigationBar)view.findViewById(0x7f0d029e);
        navigationBar.setBarColor(com.contextlogic.wish.ui.components.navigation.WishNavigationBar.NavigationBarColor.Modal);
        navigationBar.setTitle(getContext().getString(0x7f060373));
        closeButton = new NavigationBarImageButton(getContext());
        closeButton.setButtonMode(com.contextlogic.wish.ui.components.navigation.NavigationBarImageButton.ButtonMode.BackGray);
        closeButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ProductFeedRenameBucketView this$0;

            public void onClick(View view1)
            {
                hideKeyboard();
                clearTagAutocomplete();
                Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.Dismiss, com.contextlogic.wish.analytics.Analytics.PageViewType.RenameBucket, com.contextlogic.wish.analytics.Analytics.LabelType.Click);
                if (callback != null)
                {
                    callback.onBucketRenameCanceled();
                }
            }

            
            {
                this$0 = ProductFeedRenameBucketView.this;
                super();
            }
        });
        navigationBar.setLeftButton(closeButton);
        saveButton = new NavigationBarGrayTextButton(getContext());
        saveButton.setText(getContext().getString(0x7f060130));
        saveButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ProductFeedRenameBucketView this$0;

            public void onClick(View view1)
            {
                handleSave();
            }

            
            {
                this$0 = ProductFeedRenameBucketView.this;
                super();
            }
        });
        navigationBar.setRightButton(saveButton);
        nameEditText = (EditText)view.findViewById(0x7f0d029f);
        nameEditText.addTextChangedListener(new TextWatcher() {

            final ProductFeedRenameBucketView this$0;

            public void afterTextChanged(Editable editable)
            {
                if (editable != null)
                {
                    editable = editable.toString().trim();
                    if (editable.length() > 0)
                    {
                        getTagAutocomplete(editable);
                        return;
                    } else
                    {
                        clearTagAutocomplete();
                        return;
                    }
                } else
                {
                    clearTagAutocomplete();
                    return;
                }
            }

            public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            public void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            
            {
                this$0 = ProductFeedRenameBucketView.this;
                super();
            }
        });
        nameEditText.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final ProductFeedRenameBucketView this$0;

            public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                if (i == 6)
                {
                    handleSave();
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = ProductFeedRenameBucketView.this;
                super();
            }
        });
        tagSearchService = new TagSearchService();
        autocompleteData = new ArrayList();
        listView = (SectionedListView)view.findViewById(0x7f0d02a0);
        tagAutocompleteAdapter = new ProductFeedRenameBucketAdapter(getContext(), autocompleteData);
        listView.setAdapter(tagAutocompleteAdapter);
        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final ProductFeedRenameBucketView this$0;

            public void onItemClick(AdapterView adapterview, View view1, int i, long l)
            {
                hideKeyboard();
                adapterview = ((WishTag)autocompleteData.get(i)).getName();
                clearTagAutocomplete();
                Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.Done, com.contextlogic.wish.analytics.Analytics.PageViewType.RenameBucket, com.contextlogic.wish.analytics.Analytics.LabelType.Click);
                if (callback != null)
                {
                    callback.onBucketRenamed(adapterview);
                }
            }

            
            {
                this$0 = ProductFeedRenameBucketView.this;
                super();
            }
        });
    }

    public void onBackPressed()
    {
        hideKeyboard();
        clearTagAutocomplete();
        Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.Dismiss, com.contextlogic.wish.analytics.Analytics.PageViewType.RenameBucket, com.contextlogic.wish.analytics.Analytics.LabelType.Click);
        if (callback != null)
        {
            callback.onBucketRenameCanceled();
        }
    }

    public void setCallback(Callback callback1)
    {
        callback = callback1;
    }

    public void show(String s)
    {
        Analytics.getInstance().trackPageView(com.contextlogic.wish.analytics.Analytics.PageViewType.RenameBucket);
        nameEditText.setText(s);
        nameEditText.setSelection(s.length());
    }







}
