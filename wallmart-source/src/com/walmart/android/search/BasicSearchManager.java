// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.search;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmart.android.search:
//            SearchData, RecentSearchProvider

public class BasicSearchManager
{
    public static interface OnBarcodeSearchRequestedListener
    {

        public abstract void onBarcodeSearchRequested();
    }

    public static interface OnSearchExecutedListener
    {

        public abstract void onSearchExecuted(Object obj);
    }

    public static interface OnSearchFieldFocusedListener
    {

        public abstract void onFocused(boolean flag);
    }

    public static interface OnSearchRequestedListener
    {

        public abstract Object onSearchRequested(String s);
    }

    public static interface OnVoiceSearchRequestedListener
    {

        public abstract void onVoiceSearchRequested();
    }


    public static final String TAG = com/walmart/android/search/BasicSearchManager.getSimpleName();
    private View mBarcodeSearchButton;
    private View mButtonsDelimiter;
    private View mClearTextButton;
    private ImageSpan mHintIconImageSpan;
    private OnBarcodeSearchRequestedListener mOnBarcodeSearchRequestedListener;
    private OnSearchExecutedListener mOnSearchExecutedListener;
    private OnSearchFieldFocusedListener mOnSearchFieldFocusedListener;
    private OnSearchRequestedListener mOnSearchRequestedListener;
    private OnVoiceSearchRequestedListener mOnVoiceSearchRequestedListener;
    private String mOriginalSuggestion;
    private RecentSearchProvider mRecentSearchProvider;
    protected ViewGroup mRootLayout;
    private View mSearchButton;
    private boolean mSearchButtonEnabled;
    protected EditText mSearchField;
    private String mSuggestionText;
    private boolean mSuggestionTextIsEditable;
    private View mVoiceSearchButton;

    public BasicSearchManager(ViewGroup viewgroup)
    {
        mRootLayout = viewgroup;
    }

    private CharSequence onCreateSuggestionText(String s)
    {
        if (mHintIconImageSpan != null)
        {
            s = new SpannableStringBuilder((new StringBuilder()).append("  ").append(s).toString());
            s.setSpan(mHintIconImageSpan, 0, 1, 18);
            return s;
        } else
        {
            return s;
        }
    }

    private void setButtonDelimiterVisibility(int i)
    {
        if (mButtonsDelimiter != null)
        {
            mButtonsDelimiter.setVisibility(i);
        }
    }

    protected void clearSearchText()
    {
        mSearchField.setText("");
    }

    public void destroy()
    {
        mRecentSearchProvider = null;
    }

    public void enableBarcodeSearchButton(boolean flag)
    {
        if (flag)
        {
            mBarcodeSearchButton.setVisibility(0);
            return;
        } else
        {
            mBarcodeSearchButton.setVisibility(8);
            return;
        }
    }

    public void enableVoiceSearchButton(boolean flag)
    {
        if (flag)
        {
            mVoiceSearchButton.setVisibility(0);
            setButtonDelimiterVisibility(mClearTextButton.getVisibility());
            return;
        } else
        {
            mVoiceSearchButton.setVisibility(8);
            setButtonDelimiterVisibility(8);
            return;
        }
    }

    public void finishSearch()
    {
        ViewUtil.hideKeyboard(mRootLayout);
    }

    public String getSearchText()
    {
        return mSearchField.getText().toString().trim();
    }

    protected void init()
    {
        if (mSearchField == null)
        {
            throw new RuntimeException("Must call setSearchField() before calling init()");
        } else
        {
            mRootLayout.setFocusableInTouchMode(true);
            mSearchField.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

                final BasicSearchManager this$0;

                public void onFocusChange(View view, boolean flag)
                {
                    if (flag)
                    {
                        if (mSuggestionTextIsEditable)
                        {
                            mSearchField.setText(mSuggestionText);
                        }
                        if (mOriginalSuggestion != null)
                        {
                            setSuggestionText(mOriginalSuggestion);
                        }
                    }
                    onSearchFieldFocusChange(flag);
                    if (mOnSearchFieldFocusedListener != null)
                    {
                        mOnSearchFieldFocusedListener.onFocused(flag);
                    }
                }

            
            {
                this$0 = BasicSearchManager.this;
                super();
            }
            });
            mSearchField.addTextChangedListener(new TextWatcher() {

                final BasicSearchManager this$0;

                public void afterTextChanged(Editable editable)
                {
                }

                public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
                {
                }

                public void onTextChanged(CharSequence charsequence, int i, int j, int k)
                {
                    onSearchFieldTextChanged(charsequence);
                }

            
            {
                this$0 = BasicSearchManager.this;
                super();
            }
            });
            mSearchField.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

                final BasicSearchManager this$0;

                public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
                {
                    requestSearch();
                    return false;
                }

            
            {
                this$0 = BasicSearchManager.this;
                super();
            }
            });
            return;
        }
    }

    public boolean onBackPressed()
    {
        return false;
    }

    protected void onSearchFieldFocusChange(boolean flag)
    {
    }

    protected void onSearchFieldTextChanged(CharSequence charsequence)
    {
        if (charsequence.length() == 0)
        {
            mClearTextButton.setVisibility(8);
            setButtonDelimiterVisibility(8);
            if (mSearchButtonEnabled)
            {
                mSearchButton.setVisibility(8);
            }
        } else
        {
            mClearTextButton.setVisibility(0);
            setButtonDelimiterVisibility(mVoiceSearchButton.getVisibility());
            if (mSearchButtonEnabled)
            {
                mSearchButton.setVisibility(0);
                return;
            }
        }
    }

    public void overrideSearchButton(Drawable drawable, android.view.View.OnClickListener onclicklistener)
    {
        if (drawable != null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                mSearchButton.setBackground(drawable);
            } else
            {
                mSearchButton.setBackgroundDrawable(drawable);
            }
        }
        mSearchButtonEnabled = false;
        mSearchButton.setVisibility(0);
        mSearchButton.setOnClickListener(onclicklistener);
    }

    public void performSearch(SearchData searchdata)
    {
        boolean flag;
        if (!TextUtils.isEmpty(searchdata.getSearchText()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && mRecentSearchProvider != null)
        {
            mRecentSearchProvider.addSearch(searchdata);
        }
        finishSearch();
        if (flag && mOnSearchExecutedListener != null)
        {
            mOnSearchExecutedListener.onSearchExecuted(searchdata);
        }
    }

    protected void requestSearch()
    {
        if (mOnSearchRequestedListener != null)
        {
            String s = getSearchText();
            performSearch((SearchData)mOnSearchRequestedListener.onSearchRequested(s));
        }
    }

    public void setBarcodeSearchButton(int i)
    {
        mBarcodeSearchButton = mRootLayout.findViewById(i);
        mBarcodeSearchButton.setOnClickListener(new android.view.View.OnClickListener() {

            final BasicSearchManager this$0;

            public void onClick(View view)
            {
                if (mOnBarcodeSearchRequestedListener != null)
                {
                    mOnBarcodeSearchRequestedListener.onBarcodeSearchRequested();
                }
            }

            
            {
                this$0 = BasicSearchManager.this;
                super();
            }
        });
    }

    public void setClearTextButton(int i)
    {
        mClearTextButton = mRootLayout.findViewById(i);
        mClearTextButton.setOnClickListener(new android.view.View.OnClickListener() {

            final BasicSearchManager this$0;

            public void onClick(View view)
            {
                clearSearchText();
            }

            
            {
                this$0 = BasicSearchManager.this;
                super();
            }
        });
    }

    public void setHintImageSpan(ImageSpan imagespan)
    {
        mHintIconImageSpan = imagespan;
    }

    public void setInitialSuggestionText(String s)
    {
        mOriginalSuggestion = s;
    }

    public void setOnBarcodeSearchRequestedListener(OnBarcodeSearchRequestedListener onbarcodesearchrequestedlistener)
    {
        mOnBarcodeSearchRequestedListener = onbarcodesearchrequestedlistener;
    }

    public void setOnSearchExecutedListener(OnSearchExecutedListener onsearchexecutedlistener)
    {
        mOnSearchExecutedListener = onsearchexecutedlistener;
    }

    public void setOnSearchFieldFocusedListener(OnSearchFieldFocusedListener onsearchfieldfocusedlistener)
    {
        mOnSearchFieldFocusedListener = onsearchfieldfocusedlistener;
    }

    public void setOnSearchRequestedListener(OnSearchRequestedListener onsearchrequestedlistener)
    {
        mOnSearchRequestedListener = onsearchrequestedlistener;
    }

    public void setOnVoiceSearchRequestedListener(OnVoiceSearchRequestedListener onvoicesearchrequestedlistener)
    {
        mOnVoiceSearchRequestedListener = onvoicesearchrequestedlistener;
    }

    public void setRecentSearchProvider(RecentSearchProvider recentsearchprovider)
    {
        mRecentSearchProvider = recentsearchprovider;
    }

    public void setSearchButton(int i)
    {
        mSearchButtonEnabled = true;
        mSearchButton = mRootLayout.findViewById(i);
        mSearchButton.setOnClickListener(new android.view.View.OnClickListener() {

            final BasicSearchManager this$0;

            public void onClick(View view)
            {
                requestSearch();
            }

            
            {
                this$0 = BasicSearchManager.this;
                super();
            }
        });
    }

    public void setSearchField(int i)
    {
        mSearchField = (EditText)mRootLayout.findViewById(i);
    }

    public void setSuggestionText(String s)
    {
        setSuggestionText(s, false);
    }

    public void setSuggestionText(String s, boolean flag)
    {
        mSuggestionText = s;
        mSuggestionTextIsEditable = flag;
        if (mOriginalSuggestion == null)
        {
            mOriginalSuggestion = s;
        }
        mSearchField.setHint(onCreateSuggestionText(s));
    }

    public void setVoiceButtonDelimiter(int i)
    {
        mButtonsDelimiter = mRootLayout.findViewById(i);
    }

    public void setVoiceSearchButton(int i)
    {
        mVoiceSearchButton = mRootLayout.findViewById(i);
        mVoiceSearchButton.setOnClickListener(new android.view.View.OnClickListener() {

            final BasicSearchManager this$0;

            public void onClick(View view)
            {
                if (mOnVoiceSearchRequestedListener != null)
                {
                    mOnVoiceSearchRequestedListener.onVoiceSearchRequested();
                }
            }

            
            {
                this$0 = BasicSearchManager.this;
                super();
            }
        });
    }







}
