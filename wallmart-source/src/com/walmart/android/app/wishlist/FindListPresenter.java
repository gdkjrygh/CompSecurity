// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ui.FloatLabel;
import com.walmartlabs.ui.NoDefaultSpinner;

// Referenced classes of package com.walmart.android.app.wishlist:
//            SearchListParams, FindListResultsPresenter

public class FindListPresenter extends Presenter
{

    private final AppCompatActivity mActivity;
    private FloatLabel mFirstNameEditLabel;
    private EditText mFirstNameEditText;
    private FloatLabel mLastNameEditLabel;
    private EditText mLastNameEditText;
    private View mRootView;
    private View mSearchButton;
    private NoDefaultSpinner mUsStateSpinner;
    private FloatLabel mUsStateSpinnerLabel;
    private final String mUsStatesAbbreviationArray[] = addInitialElement("", 0x7f0e000f);
    private final String mUsStatesArray[];

    public FindListPresenter(AppCompatActivity appcompatactivity)
    {
        mActivity = appcompatactivity;
        mUsStatesArray = addInitialElement(mActivity.getString(0x7f0905aa), 0x7f0e000e);
    }

    private String[] addInitialElement(String s, int i)
    {
        String as[] = mActivity.getResources().getStringArray(i);
        String as1[] = new String[as.length + 1];
        as1[0] = s;
        System.arraycopy(as, 0, as1, 1, as.length);
        return as1;
    }

    private boolean areFieldsValid()
    {
        clearErrors();
        boolean flag = true;
        if (TextUtils.isEmpty(mLastNameEditText.getText().toString().trim()))
        {
            flag = false;
            mLastNameEditLabel.setError(0x7f090654);
        }
        return flag;
    }

    private void clearErrors()
    {
        mLastNameEditLabel.clearError();
    }

    private SearchListParams getInputData()
    {
        SearchListParams searchlistparams = new SearchListParams();
        searchlistparams.mFirstName = mFirstNameEditText.getText().toString().trim();
        searchlistparams.mLastName = mLastNameEditText.getText().toString().trim();
        if (mUsStateSpinner.getSelectedItemPosition() != -1)
        {
            searchlistparams.mState = mUsStatesAbbreviationArray[mUsStateSpinner.getSelectedItemPosition()];
        }
        return searchlistparams;
    }

    private void wireListeners()
    {
        mSearchButton.setOnClickListener(new OnSingleClickListener(this) {

            final FindListPresenter this$0;

            public void onSingleClick(View view)
            {
                if (areFieldsValid())
                {
                    ViewUtil.hideKeyboard(mRootView);
                    view = getInputData();
                    pushPresenter(new FindListResultsPresenter(mActivity, view));
                    MessageBus.getBus().post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder("findListFinalTap"));
                }
            }

            
            {
                this$0 = FindListPresenter.this;
                super(presenter);
            }
        });
        mUsStateSpinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final FindListPresenter this$0;

            public void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                mUsStateSpinnerLabel.show();
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = FindListPresenter.this;
                super();
            }
        });
    }

    public String getTitleText()
    {
        return mActivity.getString(0x7f090630);
    }

    public View getView()
    {
        return mRootView;
    }

    public boolean onCreateMenu(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        return super.onCreateMenu(menu, menuinflater);
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mRootView == null)
        {
            mRootView = ViewUtil.inflate(mActivity, 0x7f0401e1);
            mFirstNameEditText = (EditText)ViewUtil.findViewById(mRootView, 0x7f10062a);
            mFirstNameEditLabel = (FloatLabel)ViewUtil.findViewById(mRootView, 0x7f100629);
            mFirstNameEditLabel.attach(mFirstNameEditText);
            mLastNameEditText = (EditText)ViewUtil.findViewById(mRootView, 0x7f10062c);
            mLastNameEditLabel = (FloatLabel)ViewUtil.findViewById(mRootView, 0x7f10062b);
            mLastNameEditLabel.attach(mLastNameEditText);
            mUsStateSpinner = (NoDefaultSpinner)ViewUtil.findViewById(mRootView, 0x7f10062e);
            mUsStateSpinnerLabel = (FloatLabel)ViewUtil.findViewById(mRootView, 0x7f10062d);
            mUsStateSpinnerLabel.attach(mUsStateSpinner);
            mUsStateSpinner.setAdapter(new com.walmartlabs.ui.NoDefaultSpinner.Adapter(mActivity, mActivity.getString(0x7f090659), mUsStatesArray));
            mSearchButton = ViewUtil.findViewById(mRootView, 0x7f10062f);
            wireListeners();
        }
    }

    public void onNewTop()
    {
        super.onNewTop();
        if (mRootView != null)
        {
            ViewUtil.hideKeyboard(mRootView);
        }
    }

    protected void onPageView()
    {
        super.onPageView();
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "find a list").putString("section", "lists");
        MessageBus.getBus().post(builder);
    }

    public void onPauseAsTop()
    {
        super.onPauseAsTop();
        if (mRootView != null)
        {
            ViewUtil.hideKeyboard(mRootView);
        }
    }

    public void onPop()
    {
        super.onPop();
        if (mRootView != null)
        {
            ViewUtil.hideKeyboard(mRootView);
        }
    }






}
