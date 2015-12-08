// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.view.KeyEventCompat;
import android.support.v4.widget.CursorAdapter;
import android.support.v7.internal.widget.TintManager;
import android.support.v7.internal.widget.TintTypedArray;
import android.support.v7.internal.widget.ViewUtils;
import android.support.v7.view.CollapsibleActionView;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v7.widget:
//            LinearLayoutCompat, SuggestionsAdapter, AppCompatAutoCompleteTextView

public class SearchView extends LinearLayoutCompat
    implements CollapsibleActionView
{
    private static class AutoCompleteTextViewReflector
    {

        private Method doAfterTextChanged;
        private Method doBeforeTextChanged;
        private Method ensureImeVisible;
        private Method showSoftInputUnchecked;

        void doAfterTextChanged(AutoCompleteTextView autocompletetextview)
        {
            if (doAfterTextChanged == null)
            {
                break MISSING_BLOCK_LABEL_20;
            }
            doAfterTextChanged.invoke(autocompletetextview, new Object[0]);
            return;
            autocompletetextview;
        }

        void doBeforeTextChanged(AutoCompleteTextView autocompletetextview)
        {
            if (doBeforeTextChanged == null)
            {
                break MISSING_BLOCK_LABEL_20;
            }
            doBeforeTextChanged.invoke(autocompletetextview, new Object[0]);
            return;
            autocompletetextview;
        }

        void ensureImeVisible(AutoCompleteTextView autocompletetextview, boolean flag)
        {
            if (ensureImeVisible == null)
            {
                break MISSING_BLOCK_LABEL_27;
            }
            ensureImeVisible.invoke(autocompletetextview, new Object[] {
                Boolean.valueOf(flag)
            });
            return;
            autocompletetextview;
        }

        void showSoftInputUnchecked(InputMethodManager inputmethodmanager, View view, int i)
        {
            if (showSoftInputUnchecked != null)
            {
                try
                {
                    showSoftInputUnchecked.invoke(inputmethodmanager, new Object[] {
                        Integer.valueOf(i), null
                    });
                    return;
                }
                catch (Exception exception) { }
            }
            inputmethodmanager.showSoftInput(view, i);
        }

        AutoCompleteTextViewReflector()
        {
            try
            {
                doBeforeTextChanged = android/widget/AutoCompleteTextView.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                doBeforeTextChanged.setAccessible(true);
            }
            catch (NoSuchMethodException nosuchmethodexception3) { }
            try
            {
                doAfterTextChanged = android/widget/AutoCompleteTextView.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                doAfterTextChanged.setAccessible(true);
            }
            catch (NoSuchMethodException nosuchmethodexception2) { }
            try
            {
                ensureImeVisible = android/widget/AutoCompleteTextView.getMethod("ensureImeVisible", new Class[] {
                    Boolean.TYPE
                });
                ensureImeVisible.setAccessible(true);
            }
            catch (NoSuchMethodException nosuchmethodexception1) { }
            try
            {
                showSoftInputUnchecked = android/view/inputmethod/InputMethodManager.getMethod("showSoftInputUnchecked", new Class[] {
                    Integer.TYPE, android/os/ResultReceiver
                });
                showSoftInputUnchecked.setAccessible(true);
                return;
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                return;
            }
        }
    }

    public static interface OnCloseListener
    {

        public abstract boolean onClose();
    }

    public static interface OnQueryTextListener
    {

        public abstract boolean onQueryTextChange(String s);

        public abstract boolean onQueryTextSubmit(String s);
    }

    public static interface OnSuggestionListener
    {

        public abstract boolean onSuggestionClick(int i);

        public abstract boolean onSuggestionSelect(int i);
    }

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView
    {

        private SearchView mSearchView;
        private int mThreshold;

        private boolean isEmpty()
        {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public boolean enoughToFilter()
        {
            return mThreshold <= 0 || super.enoughToFilter();
        }

        protected void onFocusChanged(boolean flag, int i, Rect rect)
        {
            super.onFocusChanged(flag, i, rect);
            mSearchView.onTextFocusChanged();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyevent)
        {
            if (i == 4)
            {
                if (keyevent.getAction() == 0 && keyevent.getRepeatCount() == 0)
                {
                    android.view.KeyEvent.DispatcherState dispatcherstate = getKeyDispatcherState();
                    if (dispatcherstate != null)
                    {
                        dispatcherstate.startTracking(keyevent, this);
                    }
                    return true;
                }
                if (keyevent.getAction() == 1)
                {
                    android.view.KeyEvent.DispatcherState dispatcherstate1 = getKeyDispatcherState();
                    if (dispatcherstate1 != null)
                    {
                        dispatcherstate1.handleUpEvent(keyevent);
                    }
                    if (keyevent.isTracking() && !keyevent.isCanceled())
                    {
                        mSearchView.clearFocus();
                        mSearchView.setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyevent);
        }

        public void onWindowFocusChanged(boolean flag)
        {
            super.onWindowFocusChanged(flag);
            if (flag && mSearchView.hasFocus() && getVisibility() == 0)
            {
                ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(this, 0);
                if (SearchView.isLandscapeMode(getContext()))
                {
                    SearchView.HIDDEN_METHOD_INVOKER.ensureImeVisible(this, true);
                }
            }
        }

        public void performCompletion()
        {
        }

        protected void replaceText(CharSequence charsequence)
        {
        }

        void setSearchView(SearchView searchview)
        {
            mSearchView = searchview;
        }

        public void setThreshold(int i)
        {
            super.setThreshold(i);
            mThreshold = i;
        }


        public SearchAutoComplete(Context context)
        {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeset)
        {
            this(context, attributeset, android.support.v7.appcompat.R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeset, int i)
        {
            super(context, attributeset, i);
            mThreshold = getThreshold();
        }
    }


    private static final boolean DBG = false;
    static final AutoCompleteTextViewReflector HIDDEN_METHOD_INVOKER = new AutoCompleteTextViewReflector();
    private static final String IME_OPTION_NO_MICROPHONE = "nm";
    private static final boolean IS_AT_LEAST_FROYO;
    private static final String LOG_TAG = "SearchView";
    private Bundle mAppSearchData;
    private boolean mClearingFocus;
    private final ImageView mCloseButton;
    private final ImageView mCollapsedIcon;
    private int mCollapsedImeOptions;
    private final CharSequence mDefaultQueryHint;
    private final View mDropDownAnchor;
    private boolean mExpandedInActionView;
    private final ImageView mGoButton;
    private boolean mIconified;
    private boolean mIconifiedByDefault;
    private int mMaxWidth;
    private CharSequence mOldQueryText;
    private final android.view.View.OnClickListener mOnClickListener;
    private OnCloseListener mOnCloseListener;
    private final android.widget.TextView.OnEditorActionListener mOnEditorActionListener;
    private final android.widget.AdapterView.OnItemClickListener mOnItemClickListener;
    private final android.widget.AdapterView.OnItemSelectedListener mOnItemSelectedListener;
    private OnQueryTextListener mOnQueryChangeListener;
    private android.view.View.OnFocusChangeListener mOnQueryTextFocusChangeListener;
    private android.view.View.OnClickListener mOnSearchClickListener;
    private OnSuggestionListener mOnSuggestionListener;
    private final WeakHashMap mOutsideDrawablesCache;
    private CharSequence mQueryHint;
    private boolean mQueryRefinement;
    private Runnable mReleaseCursorRunnable = new Runnable() {

        final SearchView this$0;

        public void run()
        {
            if (mSuggestionsAdapter != null && (mSuggestionsAdapter instanceof SuggestionsAdapter))
            {
                mSuggestionsAdapter.changeCursor(null);
            }
        }

            
            {
                this$0 = SearchView.this;
                super();
            }
    };
    private final ImageView mSearchButton;
    private final View mSearchEditFrame;
    private final Drawable mSearchHintIcon;
    private final View mSearchPlate;
    private final SearchAutoComplete mSearchSrcTextView;
    private SearchableInfo mSearchable;
    private Runnable mShowImeRunnable = new Runnable() {

        final SearchView this$0;

        public void run()
        {
            InputMethodManager inputmethodmanager = (InputMethodManager)getContext().getSystemService("input_method");
            if (inputmethodmanager != null)
            {
                SearchView.HIDDEN_METHOD_INVOKER.showSoftInputUnchecked(inputmethodmanager, SearchView.this, 0);
            }
        }

            
            {
                this$0 = SearchView.this;
                super();
            }
    };
    private final View mSubmitArea;
    private boolean mSubmitButtonEnabled;
    private final int mSuggestionCommitIconResId;
    private final int mSuggestionRowLayout;
    private CursorAdapter mSuggestionsAdapter;
    android.view.View.OnKeyListener mTextKeyListener = new android.view.View.OnKeyListener() {

        final SearchView this$0;

        public boolean onKey(View view, int j, KeyEvent keyevent)
        {
            if (mSearchable != null)
            {
                if (mSearchSrcTextView.isPopupShowing() && mSearchSrcTextView.getListSelection() != -1)
                {
                    return onSuggestionsKey(view, j, keyevent);
                }
                if (!mSearchSrcTextView.isEmpty() && KeyEventCompat.hasNoModifiers(keyevent) && keyevent.getAction() == 1 && j == 66)
                {
                    view.cancelLongPress();
                    launchQuerySearch(0, null, mSearchSrcTextView.getText().toString());
                    return true;
                }
            }
            return false;
        }

            
            {
                this$0 = SearchView.this;
                super();
            }
    };
    private TextWatcher mTextWatcher = new TextWatcher() {

        final SearchView this$0;

        public void afterTextChanged(Editable editable)
        {
        }

        public void beforeTextChanged(CharSequence charsequence, int j, int k, int l)
        {
        }

        public void onTextChanged(CharSequence charsequence, int j, int k, int l)
        {
            SearchView.this.onTextChanged(charsequence);
        }

            
            {
                this$0 = SearchView.this;
                super();
            }
    };
    private final TintManager mTintManager;
    private final Runnable mUpdateDrawableStateRunnable;
    private CharSequence mUserQuery;
    private final Intent mVoiceAppSearchIntent;
    private final ImageView mVoiceButton;
    private boolean mVoiceButtonEnabled;
    private final Intent mVoiceWebSearchIntent;

    public SearchView(Context context)
    {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, android.support.v7.appcompat.R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mUpdateDrawableStateRunnable = new Runnable() {

            final SearchView this$0;

            public void run()
            {
                updateFocusedState();
            }

            
            {
                this$0 = SearchView.this;
                super();
            }
        };
        mOutsideDrawablesCache = new WeakHashMap();
        mOnClickListener = new android.view.View.OnClickListener() {

            final SearchView this$0;

            public void onClick(View view)
            {
                if (view == mSearchButton)
                {
                    onSearchClicked();
                } else
                {
                    if (view == mCloseButton)
                    {
                        onCloseClicked();
                        return;
                    }
                    if (view == mGoButton)
                    {
                        onSubmitQuery();
                        return;
                    }
                    if (view == mVoiceButton)
                    {
                        onVoiceClicked();
                        return;
                    }
                    if (view == mSearchSrcTextView)
                    {
                        forceSuggestionQuery();
                        return;
                    }
                }
            }

            
            {
                this$0 = SearchView.this;
                super();
            }
        };
        mOnEditorActionListener = new android.widget.TextView.OnEditorActionListener() {

            final SearchView this$0;

            public boolean onEditorAction(TextView textview, int j, KeyEvent keyevent)
            {
                onSubmitQuery();
                return true;
            }

            
            {
                this$0 = SearchView.this;
                super();
            }
        };
        mOnItemClickListener = new android.widget.AdapterView.OnItemClickListener() {

            final SearchView this$0;

            public void onItemClick(AdapterView adapterview, View view, int j, long l)
            {
                onItemClicked(j, 0, null);
            }

            
            {
                this$0 = SearchView.this;
                super();
            }
        };
        mOnItemSelectedListener = new android.widget.AdapterView.OnItemSelectedListener() {

            final SearchView this$0;

            public void onItemSelected(AdapterView adapterview, View view, int j, long l)
            {
                SearchView.this.onItemSelected(j);
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = SearchView.this;
                super();
            }
        };
        attributeset = TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.SearchView, i, 0);
        mTintManager = attributeset.getTintManager();
        LayoutInflater.from(context).inflate(attributeset.getResourceId(android.support.v7.appcompat.R.styleable.SearchView_layout, android.support.v7.appcompat.R.layout.abc_search_view), this, true);
        mSearchSrcTextView = (SearchAutoComplete)findViewById(android.support.v7.appcompat.R.id.search_src_text);
        mSearchSrcTextView.setSearchView(this);
        mSearchEditFrame = findViewById(android.support.v7.appcompat.R.id.search_edit_frame);
        mSearchPlate = findViewById(android.support.v7.appcompat.R.id.search_plate);
        mSubmitArea = findViewById(android.support.v7.appcompat.R.id.submit_area);
        mSearchButton = (ImageView)findViewById(android.support.v7.appcompat.R.id.search_button);
        mGoButton = (ImageView)findViewById(android.support.v7.appcompat.R.id.search_go_btn);
        mCloseButton = (ImageView)findViewById(android.support.v7.appcompat.R.id.search_close_btn);
        mVoiceButton = (ImageView)findViewById(android.support.v7.appcompat.R.id.search_voice_btn);
        mCollapsedIcon = (ImageView)findViewById(android.support.v7.appcompat.R.id.search_mag_icon);
        mSearchPlate.setBackgroundDrawable(attributeset.getDrawable(android.support.v7.appcompat.R.styleable.SearchView_queryBackground));
        mSubmitArea.setBackgroundDrawable(attributeset.getDrawable(android.support.v7.appcompat.R.styleable.SearchView_submitBackground));
        mSearchButton.setImageDrawable(attributeset.getDrawable(android.support.v7.appcompat.R.styleable.SearchView_searchIcon));
        mGoButton.setImageDrawable(attributeset.getDrawable(android.support.v7.appcompat.R.styleable.SearchView_goIcon));
        mCloseButton.setImageDrawable(attributeset.getDrawable(android.support.v7.appcompat.R.styleable.SearchView_closeIcon));
        mVoiceButton.setImageDrawable(attributeset.getDrawable(android.support.v7.appcompat.R.styleable.SearchView_voiceIcon));
        mCollapsedIcon.setImageDrawable(attributeset.getDrawable(android.support.v7.appcompat.R.styleable.SearchView_searchIcon));
        mSearchHintIcon = attributeset.getDrawable(android.support.v7.appcompat.R.styleable.SearchView_searchHintIcon);
        mSuggestionRowLayout = attributeset.getResourceId(android.support.v7.appcompat.R.styleable.SearchView_suggestionRowLayout, android.support.v7.appcompat.R.layout.abc_search_dropdown_item_icons_2line);
        mSuggestionCommitIconResId = attributeset.getResourceId(android.support.v7.appcompat.R.styleable.SearchView_commitIcon, 0);
        mSearchButton.setOnClickListener(mOnClickListener);
        mCloseButton.setOnClickListener(mOnClickListener);
        mGoButton.setOnClickListener(mOnClickListener);
        mVoiceButton.setOnClickListener(mOnClickListener);
        mSearchSrcTextView.setOnClickListener(mOnClickListener);
        mSearchSrcTextView.addTextChangedListener(mTextWatcher);
        mSearchSrcTextView.setOnEditorActionListener(mOnEditorActionListener);
        mSearchSrcTextView.setOnItemClickListener(mOnItemClickListener);
        mSearchSrcTextView.setOnItemSelectedListener(mOnItemSelectedListener);
        mSearchSrcTextView.setOnKeyListener(mTextKeyListener);
        mSearchSrcTextView.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            final SearchView this$0;

            public void onFocusChange(View view, boolean flag)
            {
                if (mOnQueryTextFocusChangeListener != null)
                {
                    mOnQueryTextFocusChangeListener.onFocusChange(SearchView.this, flag);
                }
            }

            
            {
                this$0 = SearchView.this;
                super();
            }
        });
        setIconifiedByDefault(attributeset.getBoolean(android.support.v7.appcompat.R.styleable.SearchView_iconifiedByDefault, true));
        i = attributeset.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.SearchView_android_maxWidth, -1);
        if (i != -1)
        {
            setMaxWidth(i);
        }
        mDefaultQueryHint = attributeset.getText(android.support.v7.appcompat.R.styleable.SearchView_defaultQueryHint);
        mQueryHint = attributeset.getText(android.support.v7.appcompat.R.styleable.SearchView_queryHint);
        i = attributeset.getInt(android.support.v7.appcompat.R.styleable.SearchView_android_imeOptions, -1);
        if (i != -1)
        {
            setImeOptions(i);
        }
        i = attributeset.getInt(android.support.v7.appcompat.R.styleable.SearchView_android_inputType, -1);
        if (i != -1)
        {
            setInputType(i);
        }
        setFocusable(attributeset.getBoolean(android.support.v7.appcompat.R.styleable.SearchView_android_focusable, true));
        attributeset.recycle();
        mVoiceWebSearchIntent = new Intent("android.speech.action.WEB_SEARCH");
        mVoiceWebSearchIntent.addFlags(0x10000000);
        mVoiceWebSearchIntent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        mVoiceAppSearchIntent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        mVoiceAppSearchIntent.addFlags(0x10000000);
        mDropDownAnchor = findViewById(mSearchSrcTextView.getDropDownAnchor());
        if (mDropDownAnchor != null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                addOnLayoutChangeListenerToDropDownAnchorSDK11();
            } else
            {
                addOnLayoutChangeListenerToDropDownAnchorBase();
            }
        }
        updateViewsVisibility(mIconifiedByDefault);
        updateQueryHint();
    }

    private void addOnLayoutChangeListenerToDropDownAnchorBase()
    {
        mDropDownAnchor.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final SearchView this$0;

            public void onGlobalLayout()
            {
                adjustDropDownSizeAndPosition();
            }

            
            {
                this$0 = SearchView.this;
                super();
            }
        });
    }

    private void addOnLayoutChangeListenerToDropDownAnchorSDK11()
    {
        mDropDownAnchor.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() {

            final SearchView this$0;

            public void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
                    int k1, int l1)
            {
                adjustDropDownSizeAndPosition();
            }

            
            {
                this$0 = SearchView.this;
                super();
            }
        });
    }

    private void adjustDropDownSizeAndPosition()
    {
        if (mDropDownAnchor.getWidth() > 1)
        {
            Resources resources = getContext().getResources();
            int k = mSearchPlate.getPaddingLeft();
            Rect rect = new Rect();
            boolean flag = ViewUtils.isLayoutRtl(this);
            int i;
            int j;
            int l;
            int i1;
            if (mIconifiedByDefault)
            {
                i = resources.getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_dropdownitem_text_padding_left);
            } else
            {
                i = 0;
            }
            mSearchSrcTextView.getDropDownBackground().getPadding(rect);
            if (flag)
            {
                j = -rect.left;
            } else
            {
                j = k - (rect.left + i);
            }
            mSearchSrcTextView.setDropDownHorizontalOffset(j);
            j = mDropDownAnchor.getWidth();
            l = rect.left;
            i1 = rect.right;
            mSearchSrcTextView.setDropDownWidth((j + l + i1 + i) - k);
        }
    }

    private Intent createIntent(String s, Uri uri, String s1, String s2, int i, String s3)
    {
        s = new Intent(s);
        s.addFlags(0x10000000);
        if (uri != null)
        {
            s.setData(uri);
        }
        s.putExtra("user_query", mUserQuery);
        if (s2 != null)
        {
            s.putExtra("query", s2);
        }
        if (s1 != null)
        {
            s.putExtra("intent_extra_data_key", s1);
        }
        if (mAppSearchData != null)
        {
            s.putExtra("app_data", mAppSearchData);
        }
        if (i != 0)
        {
            s.putExtra("action_key", i);
            s.putExtra("action_msg", s3);
        }
        if (IS_AT_LEAST_FROYO)
        {
            s.setComponent(mSearchable.getSearchActivity());
        }
        return s;
    }

    private Intent createIntentFromSuggestion(Cursor cursor, int i, String s)
    {
        Object obj;
        Object obj1;
        Object obj2;
        String s1;
        try
        {
            obj1 = SuggestionsAdapter.getColumnString(cursor, "suggest_intent_action");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                i = cursor.getPosition();
            }
            // Misplaced declaration of an exception variable
            catch (Cursor cursor)
            {
                i = -1;
            }
            Log.w("SearchView", (new StringBuilder()).append("Search suggestions cursor at row ").append(i).append(" returned exception.").toString(), s);
            return null;
        }
        obj = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        obj = obj1;
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            obj = mSearchable.getSuggestIntentAction();
        }
          goto _L2
_L7:
        obj2 = SuggestionsAdapter.getColumnString(cursor, "suggest_intent_data");
        obj = obj2;
        if (!IS_AT_LEAST_FROYO)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        obj = obj2;
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        obj = mSearchable.getSuggestIntentData();
        obj2 = obj;
        if (obj == null) goto _L4; else goto _L3
_L3:
        s1 = SuggestionsAdapter.getColumnString(cursor, "suggest_intent_data_id");
        obj2 = obj;
        if (s1 == null) goto _L4; else goto _L5
_L5:
        obj2 = (new StringBuilder()).append(((String) (obj))).append("/").append(Uri.encode(s1)).toString();
          goto _L4
_L6:
        obj2 = SuggestionsAdapter.getColumnString(cursor, "suggest_intent_query");
        return createIntent(((String) (obj1)), ((Uri) (obj)), SuggestionsAdapter.getColumnString(cursor, "suggest_intent_extra_data"), ((String) (obj2)), i, s);
_L9:
        obj = Uri.parse(((String) (obj2)));
          goto _L6
_L2:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = "android.intent.action.SEARCH";
        }
          goto _L7
_L4:
        if (obj2 != null) goto _L9; else goto _L8
_L8:
        obj = null;
          goto _L6
    }

    private Intent createVoiceAppSearchIntent(Intent intent, SearchableInfo searchableinfo)
    {
        ComponentName componentname = searchableinfo.getSearchActivity();
        Object obj = new Intent("android.intent.action.SEARCH");
        ((Intent) (obj)).setComponent(componentname);
        PendingIntent pendingintent = PendingIntent.getActivity(getContext(), 0, ((Intent) (obj)), 0x40000000);
        Bundle bundle = new Bundle();
        if (mAppSearchData != null)
        {
            bundle.putParcelable("app_data", mAppSearchData);
        }
        Intent intent2 = new Intent(intent);
        intent = "free_form";
        String s1 = null;
        obj = null;
        Object obj1 = null;
        String s = null;
        boolean flag = true;
        Intent intent1 = intent;
        int i = ((flag) ? 1 : 0);
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            obj1 = getResources();
            if (searchableinfo.getVoiceLanguageModeId() != 0)
            {
                intent = ((Resources) (obj1)).getString(searchableinfo.getVoiceLanguageModeId());
            }
            if (searchableinfo.getVoicePromptTextId() != 0)
            {
                obj = ((Resources) (obj1)).getString(searchableinfo.getVoicePromptTextId());
            }
            if (searchableinfo.getVoiceLanguageId() != 0)
            {
                s = ((Resources) (obj1)).getString(searchableinfo.getVoiceLanguageId());
            }
            obj1 = s;
            intent1 = intent;
            i = ((flag) ? 1 : 0);
            s1 = ((String) (obj));
            if (searchableinfo.getVoiceMaxResults() != 0)
            {
                i = searchableinfo.getVoiceMaxResults();
                s1 = ((String) (obj));
                intent1 = intent;
                obj1 = s;
            }
        }
        intent2.putExtra("android.speech.extra.LANGUAGE_MODEL", intent1);
        intent2.putExtra("android.speech.extra.PROMPT", s1);
        intent2.putExtra("android.speech.extra.LANGUAGE", ((String) (obj1)));
        intent2.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (componentname == null)
        {
            intent = null;
        } else
        {
            intent = componentname.flattenToShortString();
        }
        intent2.putExtra("calling_package", intent);
        intent2.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", pendingintent);
        intent2.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent2;
    }

    private Intent createVoiceWebSearchIntent(Intent intent, SearchableInfo searchableinfo)
    {
        Intent intent1 = new Intent(intent);
        intent = searchableinfo.getSearchActivity();
        if (intent == null)
        {
            intent = null;
        } else
        {
            intent = intent.flattenToShortString();
        }
        intent1.putExtra("calling_package", intent);
        return intent1;
    }

    private void dismissSuggestions()
    {
        mSearchSrcTextView.dismissDropDown();
    }

    private void forceSuggestionQuery()
    {
        HIDDEN_METHOD_INVOKER.doBeforeTextChanged(mSearchSrcTextView);
        HIDDEN_METHOD_INVOKER.doAfterTextChanged(mSearchSrcTextView);
    }

    private CharSequence getDecoratedHint(CharSequence charsequence)
    {
        if (!mIconifiedByDefault || mSearchHintIcon == null)
        {
            return charsequence;
        } else
        {
            int i = (int)((double)mSearchSrcTextView.getTextSize() * 1.25D);
            mSearchHintIcon.setBounds(0, 0, i, i);
            SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder("   ");
            spannablestringbuilder.setSpan(new ImageSpan(mSearchHintIcon), 1, 2, 33);
            spannablestringbuilder.append(charsequence);
            return spannablestringbuilder;
        }
    }

    private int getPreferredWidth()
    {
        return getContext().getResources().getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_search_view_preferred_width);
    }

    private boolean hasVoiceSearch()
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (mSearchable == null) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (!mSearchable.getVoiceSearchEnabled()) goto _L2; else goto _L3
_L3:
        Intent intent = null;
        if (!mSearchable.getVoiceSearchLaunchWebSearch()) goto _L5; else goto _L4
_L4:
        intent = mVoiceWebSearchIntent;
_L7:
        flag = flag1;
        if (intent != null)
        {
            flag = flag1;
            if (getContext().getPackageManager().resolveActivity(intent, 0x10000) != null)
            {
                flag = true;
            }
        }
_L2:
        return flag;
_L5:
        if (mSearchable.getVoiceSearchLaunchRecognizer())
        {
            intent = mVoiceAppSearchIntent;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    static boolean isLandscapeMode(Context context)
    {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean isSubmitAreaEnabled()
    {
        return (mSubmitButtonEnabled || mVoiceButtonEnabled) && !isIconified();
    }

    private void launchIntent(Intent intent)
    {
        if (intent == null)
        {
            return;
        }
        try
        {
            getContext().startActivity(intent);
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            Log.e("SearchView", (new StringBuilder()).append("Failed launch activity: ").append(intent).toString(), runtimeexception);
        }
    }

    private void launchQuerySearch(int i, String s, String s1)
    {
        s = createIntent("android.intent.action.SEARCH", null, null, s1, i, s);
        getContext().startActivity(s);
    }

    private boolean launchSuggestion(int i, int j, String s)
    {
        Cursor cursor = mSuggestionsAdapter.getCursor();
        if (cursor != null && cursor.moveToPosition(i))
        {
            launchIntent(createIntentFromSuggestion(cursor, j, s));
            return true;
        } else
        {
            return false;
        }
    }

    private void onCloseClicked()
    {
        if (TextUtils.isEmpty(mSearchSrcTextView.getText()))
        {
            if (mIconifiedByDefault && (mOnCloseListener == null || !mOnCloseListener.onClose()))
            {
                clearFocus();
                updateViewsVisibility(true);
            }
            return;
        } else
        {
            mSearchSrcTextView.setText("");
            mSearchSrcTextView.requestFocus();
            setImeVisibility(true);
            return;
        }
    }

    private boolean onItemClicked(int i, int j, String s)
    {
        boolean flag = false;
        if (mOnSuggestionListener == null || !mOnSuggestionListener.onSuggestionClick(i))
        {
            launchSuggestion(i, 0, null);
            setImeVisibility(false);
            dismissSuggestions();
            flag = true;
        }
        return flag;
    }

    private boolean onItemSelected(int i)
    {
        if (mOnSuggestionListener == null || !mOnSuggestionListener.onSuggestionSelect(i))
        {
            rewriteQueryFromSuggestion(i);
            return true;
        } else
        {
            return false;
        }
    }

    private void onSearchClicked()
    {
        updateViewsVisibility(false);
        mSearchSrcTextView.requestFocus();
        setImeVisibility(true);
        if (mOnSearchClickListener != null)
        {
            mOnSearchClickListener.onClick(this);
        }
    }

    private void onSubmitQuery()
    {
        Editable editable = mSearchSrcTextView.getText();
        if (editable != null && TextUtils.getTrimmedLength(editable) > 0 && (mOnQueryChangeListener == null || !mOnQueryChangeListener.onQueryTextSubmit(editable.toString())))
        {
            if (mSearchable != null)
            {
                launchQuerySearch(0, null, editable.toString());
            }
            setImeVisibility(false);
            dismissSuggestions();
        }
    }

    private boolean onSuggestionsKey(View view, int i, KeyEvent keyevent)
    {
        if (mSearchable != null && mSuggestionsAdapter != null && keyevent.getAction() == 0 && KeyEventCompat.hasNoModifiers(keyevent))
        {
            if (i == 66 || i == 84 || i == 61)
            {
                return onItemClicked(mSearchSrcTextView.getListSelection(), 0, null);
            }
            if (i == 21 || i == 22)
            {
                if (i == 21)
                {
                    i = 0;
                } else
                {
                    i = mSearchSrcTextView.length();
                }
                mSearchSrcTextView.setSelection(i);
                mSearchSrcTextView.setListSelection(0);
                mSearchSrcTextView.clearListSelection();
                HIDDEN_METHOD_INVOKER.ensureImeVisible(mSearchSrcTextView, true);
                return true;
            }
            if (i == 19 && mSearchSrcTextView.getListSelection() == 0)
            {
                return false;
            }
        }
        return false;
    }

    private void onTextChanged(CharSequence charsequence)
    {
        boolean flag1 = true;
        Editable editable = mSearchSrcTextView.getText();
        mUserQuery = editable;
        boolean flag;
        if (!TextUtils.isEmpty(editable))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        updateSubmitButton(flag);
        if (!flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        updateVoiceButton(flag);
        updateCloseButton();
        updateSubmitArea();
        if (mOnQueryChangeListener != null && !TextUtils.equals(charsequence, mOldQueryText))
        {
            mOnQueryChangeListener.onQueryTextChange(charsequence.toString());
        }
        mOldQueryText = charsequence.toString();
    }

    private void onVoiceClicked()
    {
        if (mSearchable != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        obj = mSearchable;
        try
        {
            if (((SearchableInfo) (obj)).getVoiceSearchLaunchWebSearch())
            {
                obj = createVoiceWebSearchIntent(mVoiceWebSearchIntent, ((SearchableInfo) (obj)));
                getContext().startActivity(((Intent) (obj)));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.w("SearchView", "Could not find voice search activity");
            return;
        }
        if (!((SearchableInfo) (obj)).getVoiceSearchLaunchRecognizer()) goto _L1; else goto _L3
_L3:
        obj = createVoiceAppSearchIntent(mVoiceAppSearchIntent, ((SearchableInfo) (obj)));
        getContext().startActivity(((Intent) (obj)));
        return;
    }

    private void postUpdateFocusedState()
    {
        post(mUpdateDrawableStateRunnable);
    }

    private void rewriteQueryFromSuggestion(int i)
    {
        Editable editable = mSearchSrcTextView.getText();
        Object obj = mSuggestionsAdapter.getCursor();
        if (obj == null)
        {
            return;
        }
        if (((Cursor) (obj)).moveToPosition(i))
        {
            obj = mSuggestionsAdapter.convertToString(((Cursor) (obj)));
            if (obj != null)
            {
                setQuery(((CharSequence) (obj)));
                return;
            } else
            {
                setQuery(editable);
                return;
            }
        } else
        {
            setQuery(editable);
            return;
        }
    }

    private void setImeVisibility(boolean flag)
    {
        if (flag)
        {
            post(mShowImeRunnable);
        } else
        {
            removeCallbacks(mShowImeRunnable);
            InputMethodManager inputmethodmanager = (InputMethodManager)getContext().getSystemService("input_method");
            if (inputmethodmanager != null)
            {
                inputmethodmanager.hideSoftInputFromWindow(getWindowToken(), 0);
                return;
            }
        }
    }

    private void setQuery(CharSequence charsequence)
    {
        mSearchSrcTextView.setText(charsequence);
        SearchAutoComplete searchautocomplete = mSearchSrcTextView;
        int i;
        if (TextUtils.isEmpty(charsequence))
        {
            i = 0;
        } else
        {
            i = charsequence.length();
        }
        searchautocomplete.setSelection(i);
    }

    private void updateCloseButton()
    {
        boolean flag2 = true;
        boolean flag1 = false;
        ImageView imageview;
        Drawable drawable;
        boolean flag;
        int i;
        if (!TextUtils.isEmpty(mSearchSrcTextView.getText()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = ((flag2) ? 1 : 0);
        if (!flag)
        {
            if (mIconifiedByDefault && !mExpandedInActionView)
            {
                i = ((flag2) ? 1 : 0);
            } else
            {
                i = 0;
            }
        }
        imageview = mCloseButton;
        if (i != 0)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 8;
        }
        imageview.setVisibility(i);
        drawable = mCloseButton.getDrawable();
        if (drawable != null)
        {
            int ai[];
            if (flag)
            {
                ai = ENABLED_STATE_SET;
            } else
            {
                ai = EMPTY_STATE_SET;
            }
            drawable.setState(ai);
        }
    }

    private void updateFocusedState()
    {
        int ai[];
        Drawable drawable;
        if (mSearchSrcTextView.hasFocus())
        {
            ai = FOCUSED_STATE_SET;
        } else
        {
            ai = EMPTY_STATE_SET;
        }
        drawable = mSearchPlate.getBackground();
        if (drawable != null)
        {
            drawable.setState(ai);
        }
        drawable = mSubmitArea.getBackground();
        if (drawable != null)
        {
            drawable.setState(ai);
        }
        invalidate();
    }

    private void updateQueryHint()
    {
        CharSequence charsequence = getQueryHint();
        SearchAutoComplete searchautocomplete = mSearchSrcTextView;
        Object obj = charsequence;
        if (charsequence == null)
        {
            obj = "";
        }
        searchautocomplete.setHint(getDecoratedHint(((CharSequence) (obj))));
    }

    private void updateSearchAutoComplete()
    {
        boolean flag = true;
        mSearchSrcTextView.setThreshold(mSearchable.getSuggestThreshold());
        mSearchSrcTextView.setImeOptions(mSearchable.getImeOptions());
        int j = mSearchable.getInputType();
        int i = j;
        if ((j & 0xf) == 1)
        {
            j &= 0xfffeffff;
            i = j;
            if (mSearchable.getSuggestAuthority() != null)
            {
                i = j | 0x10000 | 0x80000;
            }
        }
        mSearchSrcTextView.setInputType(i);
        if (mSuggestionsAdapter != null)
        {
            mSuggestionsAdapter.changeCursor(null);
        }
        if (mSearchable.getSuggestAuthority() != null)
        {
            mSuggestionsAdapter = new SuggestionsAdapter(getContext(), this, mSearchable, mOutsideDrawablesCache);
            mSearchSrcTextView.setAdapter(mSuggestionsAdapter);
            SuggestionsAdapter suggestionsadapter = (SuggestionsAdapter)mSuggestionsAdapter;
            byte byte0 = flag;
            if (mQueryRefinement)
            {
                byte0 = 2;
            }
            suggestionsadapter.setQueryRefinement(byte0);
        }
    }

    private void updateSubmitArea()
    {
        byte byte0;
label0:
        {
            byte byte1 = 8;
            byte0 = byte1;
            if (!isSubmitAreaEnabled())
            {
                break label0;
            }
            if (mGoButton.getVisibility() != 0)
            {
                byte0 = byte1;
                if (mVoiceButton.getVisibility() != 0)
                {
                    break label0;
                }
            }
            byte0 = 0;
        }
        mSubmitArea.setVisibility(byte0);
    }

    private void updateSubmitButton(boolean flag)
    {
        byte byte0;
label0:
        {
            byte byte1 = 8;
            byte0 = byte1;
            if (!mSubmitButtonEnabled)
            {
                break label0;
            }
            byte0 = byte1;
            if (!isSubmitAreaEnabled())
            {
                break label0;
            }
            byte0 = byte1;
            if (!hasFocus())
            {
                break label0;
            }
            if (!flag)
            {
                byte0 = byte1;
                if (mVoiceButtonEnabled)
                {
                    break label0;
                }
            }
            byte0 = 0;
        }
        mGoButton.setVisibility(byte0);
    }

    private void updateViewsVisibility(boolean flag)
    {
        boolean flag2 = true;
        byte byte0 = 8;
        mIconified = flag;
        Object obj;
        int i;
        boolean flag1;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        if (!TextUtils.isEmpty(mSearchSrcTextView.getText()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        mSearchButton.setVisibility(i);
        updateSubmitButton(flag1);
        obj = mSearchEditFrame;
        if (flag)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((View) (obj)).setVisibility(i);
        obj = mCollapsedIcon;
        if (mIconifiedByDefault)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        ((ImageView) (obj)).setVisibility(i);
        updateCloseButton();
        if (!flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        updateVoiceButton(flag);
        updateSubmitArea();
    }

    private void updateVoiceButton(boolean flag)
    {
        byte byte1 = 8;
        byte byte0 = byte1;
        if (mVoiceButtonEnabled)
        {
            byte0 = byte1;
            if (!isIconified())
            {
                byte0 = byte1;
                if (flag)
                {
                    byte0 = 0;
                    mGoButton.setVisibility(8);
                }
            }
        }
        mVoiceButton.setVisibility(byte0);
    }

    public void clearFocus()
    {
        mClearingFocus = true;
        setImeVisibility(false);
        super.clearFocus();
        mSearchSrcTextView.clearFocus();
        mClearingFocus = false;
    }

    public int getImeOptions()
    {
        return mSearchSrcTextView.getImeOptions();
    }

    public int getInputType()
    {
        return mSearchSrcTextView.getInputType();
    }

    public int getMaxWidth()
    {
        return mMaxWidth;
    }

    public CharSequence getQuery()
    {
        return mSearchSrcTextView.getText();
    }

    public CharSequence getQueryHint()
    {
        if (mQueryHint != null)
        {
            return mQueryHint;
        }
        if (IS_AT_LEAST_FROYO && mSearchable != null && mSearchable.getHintId() != 0)
        {
            return getContext().getText(mSearchable.getHintId());
        } else
        {
            return mDefaultQueryHint;
        }
    }

    int getSuggestionCommitIconResId()
    {
        return mSuggestionCommitIconResId;
    }

    int getSuggestionRowLayout()
    {
        return mSuggestionRowLayout;
    }

    public CursorAdapter getSuggestionsAdapter()
    {
        return mSuggestionsAdapter;
    }

    public boolean isIconfiedByDefault()
    {
        return mIconifiedByDefault;
    }

    public boolean isIconified()
    {
        return mIconified;
    }

    public boolean isQueryRefinementEnabled()
    {
        return mQueryRefinement;
    }

    public boolean isSubmitButtonEnabled()
    {
        return mSubmitButtonEnabled;
    }

    public void onActionViewCollapsed()
    {
        setQuery("", false);
        clearFocus();
        updateViewsVisibility(true);
        mSearchSrcTextView.setImeOptions(mCollapsedImeOptions);
        mExpandedInActionView = false;
    }

    public void onActionViewExpanded()
    {
        if (mExpandedInActionView)
        {
            return;
        } else
        {
            mExpandedInActionView = true;
            mCollapsedImeOptions = mSearchSrcTextView.getImeOptions();
            mSearchSrcTextView.setImeOptions(mCollapsedImeOptions | 0x2000000);
            mSearchSrcTextView.setText("");
            setIconified(false);
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        removeCallbacks(mUpdateDrawableStateRunnable);
        post(mReleaseCursorRunnable);
        super.onDetachedFromWindow();
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        int l;
        if (isIconified())
        {
            super.onMeasure(i, j);
            return;
        }
        l = android.view.View.MeasureSpec.getMode(i);
        k = android.view.View.MeasureSpec.getSize(i);
        l;
        JVM INSTR lookupswitch 3: default 60
    //                   -2147483648: 75
    //                   0: 127
    //                   1073741824: 106;
           goto _L1 _L2 _L3 _L4
_L1:
        i = k;
_L6:
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), j);
        return;
_L2:
        if (mMaxWidth > 0)
        {
            i = Math.min(mMaxWidth, k);
        } else
        {
            i = Math.min(getPreferredWidth(), k);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        i = k;
        if (mMaxWidth > 0)
        {
            i = Math.min(mMaxWidth, k);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (mMaxWidth > 0)
        {
            i = mMaxWidth;
        } else
        {
            i = getPreferredWidth();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    void onQueryRefine(CharSequence charsequence)
    {
        setQuery(charsequence);
    }

    void onTextFocusChanged()
    {
        updateViewsVisibility(isIconified());
        postUpdateFocusedState();
        if (mSearchSrcTextView.hasFocus())
        {
            forceSuggestionQuery();
        }
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        postUpdateFocusedState();
    }

    public boolean requestFocus(int i, Rect rect)
    {
        boolean flag;
        if (mClearingFocus)
        {
            flag = false;
        } else
        {
            if (!isFocusable())
            {
                return false;
            }
            if (!isIconified())
            {
                boolean flag1 = mSearchSrcTextView.requestFocus(i, rect);
                flag = flag1;
                if (flag1)
                {
                    updateViewsVisibility(false);
                    return flag1;
                }
            } else
            {
                return super.requestFocus(i, rect);
            }
        }
        return flag;
    }

    public void setAppSearchData(Bundle bundle)
    {
        mAppSearchData = bundle;
    }

    public void setIconified(boolean flag)
    {
        if (flag)
        {
            onCloseClicked();
            return;
        } else
        {
            onSearchClicked();
            return;
        }
    }

    public void setIconifiedByDefault(boolean flag)
    {
        if (mIconifiedByDefault == flag)
        {
            return;
        } else
        {
            mIconifiedByDefault = flag;
            updateViewsVisibility(flag);
            updateQueryHint();
            return;
        }
    }

    public void setImeOptions(int i)
    {
        mSearchSrcTextView.setImeOptions(i);
    }

    public void setInputType(int i)
    {
        mSearchSrcTextView.setInputType(i);
    }

    public void setMaxWidth(int i)
    {
        mMaxWidth = i;
        requestLayout();
    }

    public void setOnCloseListener(OnCloseListener oncloselistener)
    {
        mOnCloseListener = oncloselistener;
    }

    public void setOnQueryTextFocusChangeListener(android.view.View.OnFocusChangeListener onfocuschangelistener)
    {
        mOnQueryTextFocusChangeListener = onfocuschangelistener;
    }

    public void setOnQueryTextListener(OnQueryTextListener onquerytextlistener)
    {
        mOnQueryChangeListener = onquerytextlistener;
    }

    public void setOnSearchClickListener(android.view.View.OnClickListener onclicklistener)
    {
        mOnSearchClickListener = onclicklistener;
    }

    public void setOnSuggestionListener(OnSuggestionListener onsuggestionlistener)
    {
        mOnSuggestionListener = onsuggestionlistener;
    }

    public void setQuery(CharSequence charsequence, boolean flag)
    {
        mSearchSrcTextView.setText(charsequence);
        if (charsequence != null)
        {
            mSearchSrcTextView.setSelection(mSearchSrcTextView.length());
            mUserQuery = charsequence;
        }
        if (flag && !TextUtils.isEmpty(charsequence))
        {
            onSubmitQuery();
        }
    }

    public void setQueryHint(CharSequence charsequence)
    {
        mQueryHint = charsequence;
        updateQueryHint();
    }

    public void setQueryRefinementEnabled(boolean flag)
    {
        mQueryRefinement = flag;
        if (mSuggestionsAdapter instanceof SuggestionsAdapter)
        {
            SuggestionsAdapter suggestionsadapter = (SuggestionsAdapter)mSuggestionsAdapter;
            byte byte0;
            if (flag)
            {
                byte0 = 2;
            } else
            {
                byte0 = 1;
            }
            suggestionsadapter.setQueryRefinement(byte0);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableinfo)
    {
        mSearchable = searchableinfo;
        if (mSearchable != null)
        {
            if (IS_AT_LEAST_FROYO)
            {
                updateSearchAutoComplete();
            }
            updateQueryHint();
        }
        boolean flag;
        if (IS_AT_LEAST_FROYO && hasVoiceSearch())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mVoiceButtonEnabled = flag;
        if (mVoiceButtonEnabled)
        {
            mSearchSrcTextView.setPrivateImeOptions("nm");
        }
        updateViewsVisibility(isIconified());
    }

    public void setSubmitButtonEnabled(boolean flag)
    {
        mSubmitButtonEnabled = flag;
        updateViewsVisibility(isIconified());
    }

    public void setSuggestionsAdapter(CursorAdapter cursoradapter)
    {
        mSuggestionsAdapter = cursoradapter;
        mSearchSrcTextView.setAdapter(mSuggestionsAdapter);
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        IS_AT_LEAST_FROYO = flag;
    }





















}
