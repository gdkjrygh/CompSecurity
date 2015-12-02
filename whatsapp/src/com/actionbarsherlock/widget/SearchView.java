// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.view.KeyEventCompat;
import android.support.v4.widget.CursorAdapter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.CollapsibleActionView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

// Referenced classes of package com.actionbarsherlock.widget:
//            SuggestionsAdapter

public class SearchView extends LinearLayout
    implements CollapsibleActionView
{

    public static boolean a;
    private static final String z[];
    private Bundle mAppSearchData;
    private boolean mClearingFocus;
    private ImageView mCloseButton;
    private int mCollapsedImeOptions;
    private View mDropDownAnchor;
    private boolean mExpandedInActionView;
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
    private SearchAutoComplete mQueryTextView;
    private Runnable mReleaseCursorRunnable;
    private View mSearchButton;
    private View mSearchEditFrame;
    private ImageView mSearchHintIcon;
    private View mSearchPlate;
    private SearchableInfo mSearchable;
    private Runnable mShowImeRunnable;
    private View mSubmitArea;
    private View mSubmitButton;
    private boolean mSubmitButtonEnabled;
    private CursorAdapter mSuggestionsAdapter;
    android.view.View.OnKeyListener mTextKeyListener;
    private TextWatcher mTextWatcher;
    private Runnable mUpdateDrawableStateRunnable;
    private CharSequence mUserQuery;
    private final Intent mVoiceAppSearchIntent;
    private View mVoiceButton;
    private boolean mVoiceButtonEnabled;
    private final Intent mVoiceWebSearchIntent;

    public SearchView(Context context)
    {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeset)
    {
        boolean flag = a;
        super(context, attributeset);
        mShowImeRunnable = new _cls1();
        mUpdateDrawableStateRunnable = new _cls2();
        mReleaseCursorRunnable = new _cls3();
        mOutsideDrawablesCache = new WeakHashMap();
        mOnClickListener = new _cls7();
        mTextKeyListener = new _cls8();
        mOnEditorActionListener = new _cls9();
        mOnItemClickListener = new _cls10();
        mOnItemSelectedListener = new _cls11();
        mTextWatcher = new _cls12();
        if (android.os.Build.VERSION.SDK_INT >= 8);
        ((LayoutInflater)context.getSystemService(z[20])).inflate(com.actionbarsherlock.R.layout.abs__search_view, this, true);
        mSearchButton = findViewById(com.actionbarsherlock.R.id.abs__search_button);
        mQueryTextView = (SearchAutoComplete)findViewById(com.actionbarsherlock.R.id.abs__search_src_text);
        mQueryTextView.setSearchView(this);
        mSearchEditFrame = findViewById(com.actionbarsherlock.R.id.abs__search_edit_frame);
        mSearchPlate = findViewById(com.actionbarsherlock.R.id.abs__search_plate);
        mSubmitArea = findViewById(com.actionbarsherlock.R.id.abs__submit_area);
        mSubmitButton = findViewById(com.actionbarsherlock.R.id.abs__search_go_btn);
        mCloseButton = (ImageView)findViewById(com.actionbarsherlock.R.id.abs__search_close_btn);
        mVoiceButton = findViewById(com.actionbarsherlock.R.id.abs__search_voice_btn);
        mSearchHintIcon = (ImageView)findViewById(com.actionbarsherlock.R.id.abs__search_mag_icon);
        mSearchButton.setOnClickListener(mOnClickListener);
        mCloseButton.setOnClickListener(mOnClickListener);
        mSubmitButton.setOnClickListener(mOnClickListener);
        mVoiceButton.setOnClickListener(mOnClickListener);
        mQueryTextView.setOnClickListener(mOnClickListener);
        mQueryTextView.addTextChangedListener(mTextWatcher);
        mQueryTextView.setOnEditorActionListener(mOnEditorActionListener);
        mQueryTextView.setOnItemClickListener(mOnItemClickListener);
        mQueryTextView.setOnItemSelectedListener(mOnItemSelectedListener);
        mQueryTextView.setOnKeyListener(mTextKeyListener);
        mQueryTextView.setOnFocusChangeListener(new _cls4());
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, com.actionbarsherlock.R.styleable.SherlockSearchView, 0, 0);
        setIconifiedByDefault(typedarray.getBoolean(com.actionbarsherlock.R.styleable.SherlockSearchView_iconifiedByDefault, true));
        int i = typedarray.getDimensionPixelSize(com.actionbarsherlock.R.styleable.SherlockSearchView_android_maxWidth, -1);
        CharSequence charsequence;
        boolean flag2;
        if (i != -1)
        {
            try
            {
                setMaxWidth(i);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        charsequence = typedarray.getText(com.actionbarsherlock.R.styleable.SherlockSearchView_queryHint);
        try
        {
            if (!TextUtils.isEmpty(charsequence))
            {
                setQueryHint(charsequence);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        i = typedarray.getInt(com.actionbarsherlock.R.styleable.SherlockSearchView_android_imeOptions, -1);
        if (i != -1)
        {
            try
            {
                setImeOptions(i);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        i = typedarray.getInt(com.actionbarsherlock.R.styleable.SherlockSearchView_android_inputType, -1);
        if (i != -1)
        {
            try
            {
                setInputType(i);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        typedarray.recycle();
        context = context.obtainStyledAttributes(attributeset, com.actionbarsherlock.R.styleable.SherlockView, 0, 0);
        flag2 = context.getBoolean(com.actionbarsherlock.R.styleable.SherlockView_android_focusable, true);
        context.recycle();
        setFocusable(flag2);
        mVoiceWebSearchIntent = new Intent(z[19]);
        mVoiceWebSearchIntent.addFlags(0x10000000);
        mVoiceWebSearchIntent.putExtra(z[21], z[17]);
        mVoiceAppSearchIntent = new Intent(z[18]);
        mVoiceAppSearchIntent.addFlags(0x10000000);
        mDropDownAnchor = findViewById(mQueryTextView.getDropDownAnchor());
        context = mDropDownAnchor;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_716;
        }
        i = android.os.Build.VERSION.SDK_INT;
        if (i < 11)
        {
            break MISSING_BLOCK_LABEL_698;
        }
        mDropDownAnchor.addOnLayoutChangeListener(new _cls5());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_716;
        }
        boolean flag1;
        try
        {
            flag = SherlockActivity.a;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        if (flag)
        {
            flag1 = false;
        } else
        {
            flag1 = true;
        }
        SherlockActivity.a = flag1;
        mDropDownAnchor.getViewTreeObserver().addOnGlobalLayoutListener(new _cls6());
        updateViewsVisibility(mIconifiedByDefault);
        updateQueryHint();
        return;
        context;
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        throw context;
    }

    private void adjustDropDownSizeAndPosition()
    {
        if (mDropDownAnchor.getWidth() <= 1) goto _L2; else goto _L1
_L1:
        Rect rect;
        Resources resources;
        int j;
        resources = getContext().getResources();
        j = mSearchPlate.getPaddingLeft();
        rect = new Rect();
        if (!mIconifiedByDefault) goto _L4; else goto _L3
_L3:
        int i;
        int k;
        i = resources.getDimensionPixelSize(com.actionbarsherlock.R.dimen.abs__dropdownitem_icon_width);
        k = resources.getDimensionPixelSize(com.actionbarsherlock.R.dimen.abs__dropdownitem_text_padding_left);
        i = k + i;
_L6:
        mQueryTextView.getDropDownBackground().getPadding(rect);
        mQueryTextView.setDropDownHorizontalOffset(-(rect.left + i) + j);
        SearchAutoComplete searchautocomplete = mQueryTextView;
        int l = mDropDownAnchor.getWidth();
        int i1 = rect.left;
        searchautocomplete.setDropDownWidth((i + (rect.right + (l + i1))) - j);
_L2:
        return;
        ActivityNotFoundException activitynotfoundexception;
        activitynotfoundexception;
        throw activitynotfoundexception;
_L4:
        i = 0;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private Intent createIntent(String s, Uri uri, String s1, String s2, int i, String s3)
    {
        s = new Intent(s);
        try
        {
            s.addFlags(0x10000000);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (uri == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        s.setData(uri);
        try
        {
            s.putExtra(z[38], mUserQuery);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        s.putExtra(z[34], s2);
        if (s1 != null)
        {
            try
            {
                s.putExtra(z[33], s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        try
        {
            if (mAppSearchData != null)
            {
                s.putExtra(z[36], mAppSearchData);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (i != 0)
        {
            try
            {
                s.putExtra(z[35], i);
                s.putExtra(z[37], s3);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        s.setComponent(mSearchable.getSearchActivity());
        return s;
    }

    private Intent createIntentFromSuggestion(Cursor cursor, int i, String s)
    {
        Object obj;
        String s2;
        String s1;
        String s3;
        try
        {
            s1 = SuggestionsAdapter.getColumnString(cursor, z[4]);
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
            Log.w(z[1], (new StringBuilder()).append(z[5]).append(i).append(z[7]).toString(), s);
            return null;
        }
        obj = s1;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        obj = mSearchable.getSuggestIntentAction();
        s1 = ((String) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        s1 = z[8];
        s2 = SuggestionsAdapter.getColumnString(cursor, z[3]);
        obj = s2;
        if (s2 != null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        obj = mSearchable.getSuggestIntentData();
        s2 = ((String) (obj));
        if (obj == null) goto _L2; else goto _L1
_L1:
        s3 = SuggestionsAdapter.getColumnString(cursor, z[9]);
        s2 = ((String) (obj));
        if (s3 == null) goto _L2; else goto _L3
_L3:
        s2 = (new StringBuilder()).append(((String) (obj))).append("/").append(Uri.encode(s3)).toString();
          goto _L2
_L5:
        s2 = SuggestionsAdapter.getColumnString(cursor, z[6]);
        return createIntent(s1, ((Uri) (obj)), SuggestionsAdapter.getColumnString(cursor, z[2]), s2, i, s);
_L2:
        while (s2 != null) 
        {
            obj = Uri.parse(s2);
            continue; /* Loop/switch isn't completed */
        }
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private Intent createVoiceAppSearchIntent(Intent intent, SearchableInfo searchableinfo)
    {
        Object obj2 = null;
        ComponentName componentname = searchableinfo.getSearchActivity();
        Object obj = new Intent(z[23]);
        ((Intent) (obj)).setComponent(componentname);
        PendingIntent pendingintent = PendingIntent.getActivity(getContext(), 0, ((Intent) (obj)), 0x40000000);
        Bundle bundle = new Bundle();
        Intent intent1 = new Intent(intent);
        intent = z[28];
        int i = 1;
        Object obj1 = getResources();
        if (searchableinfo.getVoiceLanguageModeId() != 0)
        {
            intent = ((Resources) (obj1)).getString(searchableinfo.getVoiceLanguageModeId());
        }
        if (searchableinfo.getVoicePromptTextId() != 0)
        {
            obj = ((Resources) (obj1)).getString(searchableinfo.getVoicePromptTextId());
        } else
        {
            obj = null;
        }
        if (searchableinfo.getVoiceLanguageId() != 0)
        {
            obj1 = ((Resources) (obj1)).getString(searchableinfo.getVoiceLanguageId());
        } else
        {
            obj1 = null;
        }
        if (searchableinfo.getVoiceMaxResults() != 0)
        {
            i = searchableinfo.getVoiceMaxResults();
        }
        try
        {
            intent1.putExtra(z[26], intent);
            intent1.putExtra(z[27], ((String) (obj)));
            intent1.putExtra(z[22], ((String) (obj1)));
            intent1.putExtra(z[29], i);
            searchableinfo = z[25];
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (componentname == null)
        {
            intent = obj2;
        } else
        {
            intent = componentname.flattenToShortString();
        }
        intent1.putExtra(searchableinfo, intent);
        intent1.putExtra(z[24], pendingintent);
        intent1.putExtra(z[30], bundle);
        return intent1;
    }

    private Intent createVoiceWebSearchIntent(Intent intent, SearchableInfo searchableinfo)
    {
        Intent intent1 = new Intent(intent);
        intent = searchableinfo.getSearchActivity();
        try
        {
            searchableinfo = z[15];
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (intent == null)
        {
            intent = null;
        } else
        {
            intent = intent.flattenToShortString();
        }
        intent1.putExtra(searchableinfo, intent);
        return intent1;
    }

    private void dismissSuggestions()
    {
        mQueryTextView.dismissDropDown();
    }

    private static void ensureImeVisible(AutoCompleteTextView autocompletetextview, boolean flag)
    {
        try
        {
            Method method = android/widget/AutoCompleteTextView.getMethod(z[31], new Class[] {
                Boolean.TYPE
            });
            method.setAccessible(true);
            method.invoke(autocompletetextview, new Object[] {
                Boolean.valueOf(flag)
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AutoCompleteTextView autocompletetextview)
        {
            return;
        }
    }

    private void forceSuggestionQuery()
    {
        try
        {
            Method method = com/actionbarsherlock/widget/SearchView$SearchAutoComplete.getMethod(z[13], new Class[0]);
            Method method1 = com/actionbarsherlock/widget/SearchView$SearchAutoComplete.getMethod(z[12], new Class[0]);
            method.setAccessible(true);
            method1.setAccessible(true);
            method.invoke(mQueryTextView, new Object[0]);
            method1.invoke(mQueryTextView, new Object[0]);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    private CharSequence getDecoratedHint(CharSequence charsequence)
    {
        boolean flag;
        try
        {
            flag = mIconifiedByDefault;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
        if (!flag)
        {
            return charsequence;
        } else
        {
            SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(z[14]);
            spannablestringbuilder.append(charsequence);
            charsequence = getContext().getResources().getDrawable(getSearchIconId());
            int i = (int)((double)mQueryTextView.getTextSize() * 1.25D);
            charsequence.setBounds(0, 0, i, i);
            spannablestringbuilder.setSpan(new ImageSpan(charsequence), 1, 2, 33);
            return spannablestringbuilder;
        }
    }

    private int getPreferredWidth()
    {
        return getContext().getResources().getDimensionPixelSize(com.actionbarsherlock.R.dimen.abs__search_view_preferred_width);
    }

    private int getSearchIconId()
    {
        TypedValue typedvalue = new TypedValue();
        getContext().getTheme().resolveAttribute(com.actionbarsherlock.R.attr.searchViewSearchIcon, typedvalue, true);
        return typedvalue.resourceId;
    }

    static boolean isLandscapeMode(Context context)
    {
        int i;
        try
        {
            i = context.getResources().getConfiguration().orientation;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        return i == 2;
    }

    private boolean isSubmitAreaEnabled()
    {
        boolean flag = mSubmitButtonEnabled;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        flag = mVoiceButtonEnabled;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        ActivityNotFoundException activitynotfoundexception;
        boolean flag1;
        try
        {
            flag1 = isIconified();
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
        if (!flag1)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_38;
        activitynotfoundexception;
        throw activitynotfoundexception;
        activitynotfoundexception;
        throw activitynotfoundexception;
        return false;
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
            Log.e(z[41], (new StringBuilder()).append(z[40]).append(intent).toString(), runtimeexception);
        }
    }

    private void launchQuerySearch(int i, String s, String s1)
    {
        s = createIntent(z[16], null, null, s1, i, s);
        getContext().startActivity(s);
    }

    private boolean launchSuggestion(int i, int j, String s)
    {
        Cursor cursor = mSuggestionsAdapter.getCursor();
        if (cursor != null)
        {
            boolean flag;
            try
            {
                flag = cursor.moveToPosition(i);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            if (flag)
            {
                launchIntent(createIntentFromSuggestion(cursor, j, s));
                return true;
            }
        }
        return false;
    }

    private void onCloseClicked()
    {
        Object obj = mQueryTextView.getText();
        boolean flag = TextUtils.isEmpty(((CharSequence) (obj)));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        flag = mIconifiedByDefault;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        obj = mOnCloseListener;
        if (obj != null)
        {
            ActivityNotFoundException activitynotfoundexception;
            boolean flag1;
            try
            {
                flag1 = mOnCloseListener.onClose();
            }
            catch (ActivityNotFoundException activitynotfoundexception1)
            {
                try
                {
                    throw activitynotfoundexception1;
                }
                catch (ActivityNotFoundException activitynotfoundexception2)
                {
                    throw activitynotfoundexception2;
                }
            }
            if (flag1)
            {
                break MISSING_BLOCK_LABEL_87;
            }
        }
        clearFocus();
        updateViewsVisibility(true);
        if (!a)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        mQueryTextView.setText("");
        mQueryTextView.requestFocus();
        setImeVisibility(true);
        return;
        activitynotfoundexception;
        throw activitynotfoundexception;
        activitynotfoundexception;
        throw activitynotfoundexception;
        activitynotfoundexception;
        throw activitynotfoundexception;
    }

    private boolean onItemClicked(int i, int j, String s)
    {
        try
        {
            s = mOnSuggestionListener;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        if (mOnSuggestionListener.onSuggestionClick(i))
        {
            break MISSING_BLOCK_LABEL_47;
        }
        launchSuggestion(i, 0, null);
        setImeVisibility(false);
        dismissSuggestions();
        return true;
        return false;
    }

    private boolean onItemSelected(int i)
    {
        OnSuggestionListener onsuggestionlistener;
        try
        {
            onsuggestionlistener = mOnSuggestionListener;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            try
            {
                throw activitynotfoundexception;
            }
            catch (ActivityNotFoundException activitynotfoundexception1)
            {
                throw activitynotfoundexception1;
            }
        }
        if (onsuggestionlistener == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        if (mOnSuggestionListener.onSuggestionSelect(i))
        {
            break MISSING_BLOCK_LABEL_35;
        }
        rewriteQueryFromSuggestion(i);
        return true;
        return false;
    }

    private void onSearchClicked()
    {
        try
        {
            updateViewsVisibility(false);
            mQueryTextView.requestFocus();
            setImeVisibility(true);
            if (mOnSearchClickListener != null)
            {
                mOnSearchClickListener.onClick(this);
            }
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
    }

    private void onSubmitQuery()
    {
        Editable editable;
        editable = mQueryTextView.getText();
        if (editable == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        int i = TextUtils.getTrimmedLength(editable);
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        OnQueryTextListener onquerytextlistener = mOnQueryChangeListener;
        if (onquerytextlistener == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        boolean flag = mOnQueryChangeListener.onQueryTextSubmit(editable.toString());
        if (flag)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        ActivityNotFoundException activitynotfoundexception;
        try
        {
            if (mSearchable != null)
            {
                launchQuerySearch(0, null, editable.toString());
                setImeVisibility(false);
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
        dismissSuggestions();
        return;
        activitynotfoundexception;
        throw activitynotfoundexception;
        activitynotfoundexception;
        throw activitynotfoundexception;
        activitynotfoundexception;
        throw activitynotfoundexception;
    }

    private boolean onSuggestionsKey(View view, int i, KeyEvent keyevent)
    {
        try
        {
            view = mSearchable;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (view != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j;
        boolean flag;
        try
        {
            view = mSuggestionsAdapter;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (view == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            j = keyevent.getAction();
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            try
            {
                throw view;
            }
            // Misplaced declaration of an exception variable
            catch (View view) { }
            try
            {
                throw view;
            }
            // Misplaced declaration of an exception variable
            catch (View view) { }
            try
            {
                throw view;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
        }
        if (j != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = KeyEventCompat.hasNoModifiers(keyevent);
        if (flag)
        {
            if (i == 66 || i == 84 || i == 61)
            {
                return onItemClicked(mQueryTextView.getListSelection(), 0, null);
            }
            if (i == 21 || i == 22)
            {
                if (i == 21)
                {
                    i = 0;
                } else
                {
                    i = mQueryTextView.length();
                }
                mQueryTextView.setSelection(i);
                mQueryTextView.setListSelection(0);
                mQueryTextView.clearListSelection();
                ensureImeVisible(mQueryTextView, true);
                return true;
            }
            if (i == 19)
            {
                try
                {
                    i = mQueryTextView.getListSelection();
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    throw view;
                }
                if (i == 0)
                {
                    return false;
                }
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void onTextChanged(CharSequence charsequence)
    {
        boolean flag1 = true;
        Object obj = mQueryTextView.getText();
        boolean flag;
        try
        {
            mUserQuery = ((CharSequence) (obj));
            flag = TextUtils.isEmpty(((CharSequence) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            updateSubmitButton(flag);
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
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
        obj = mOnQueryChangeListener;
        if (obj != null)
        {
            try
            {
                if (!TextUtils.equals(charsequence, mOldQueryText))
                {
                    mOnQueryChangeListener.onQueryTextChange(charsequence.toString());
                }
            }
            // Misplaced declaration of an exception variable
            catch (CharSequence charsequence)
            {
                throw charsequence;
            }
        }
        mOldQueryText = charsequence.toString();
        return;
        charsequence;
        throw charsequence;
    }

    private void onVoiceClicked()
    {
        Object obj;
        try
        {
            obj = mSearchable;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        if (obj != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        activitynotfoundexception = mSearchable;
        Intent intent;
        if (!activitynotfoundexception.getVoiceSearchLaunchWebSearch())
        {
            break; /* Loop/switch isn't completed */
        }
        intent = createVoiceWebSearchIntent(mVoiceWebSearchIntent, activitynotfoundexception);
        getContext().startActivity(intent);
        if (!a) goto _L1; else goto _L3
_L3:
        boolean flag = activitynotfoundexception.getVoiceSearchLaunchRecognizer();
        if (flag)
        {
            try
            {
                activitynotfoundexception = createVoiceAppSearchIntent(mVoiceAppSearchIntent, activitynotfoundexception);
                getContext().startActivity(activitynotfoundexception);
                return;
            }
            catch (ActivityNotFoundException activitynotfoundexception1)
            {
                Log.w(z[10], z[11]);
            }
            return;
        }
          goto _L1
        ActivityNotFoundException activitynotfoundexception2;
        activitynotfoundexception2;
        throw activitynotfoundexception2;
    }

    private void postUpdateFocusedState()
    {
        post(mUpdateDrawableStateRunnable);
    }

    private void rewriteQueryFromSuggestion(int i)
    {
        Editable editable;
        Object obj;
        boolean flag;
        flag = a;
        editable = mQueryTextView.getText();
        obj = mSuggestionsAdapter.getCursor();
        if (obj != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!((Cursor) (obj)).moveToPosition(i))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = mSuggestionsAdapter.convertToString(((Cursor) (obj)));
        if (obj != null)
        {
            ActivityNotFoundException activitynotfoundexception;
            try
            {
                setQuery(((CharSequence) (obj)));
            }
            catch (ActivityNotFoundException activitynotfoundexception1)
            {
                throw activitynotfoundexception1;
            }
            if (!flag)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        setQuery(editable);
        if (!flag) goto _L1; else goto _L3
_L3:
        try
        {
            setQuery(editable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
    }

    private void setImeVisibility(boolean flag)
    {
        if (flag)
        {
            InputMethodManager inputmethodmanager;
            try
            {
                post(mShowImeRunnable);
                flag = a;
            }
            catch (ActivityNotFoundException activitynotfoundexception)
            {
                throw activitynotfoundexception;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_60;
            }
        }
        removeCallbacks(mShowImeRunnable);
        inputmethodmanager = (InputMethodManager)getContext().getSystemService(z[0]);
        if (inputmethodmanager == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        inputmethodmanager.hideSoftInputFromWindow(getWindowToken(), 0);
        return;
        ActivityNotFoundException activitynotfoundexception1;
        activitynotfoundexception1;
        throw activitynotfoundexception1;
    }

    private void setQuery(CharSequence charsequence)
    {
        SearchAutoComplete searchautocomplete;
        int i;
        boolean flag;
        try
        {
            setText(mQueryTextView, charsequence, true);
            searchautocomplete = mQueryTextView;
            flag = TextUtils.isEmpty(charsequence);
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
        if (flag)
        {
            i = 0;
        } else
        {
            i = charsequence.length();
        }
        searchautocomplete.setSelection(i);
    }

    private static void setText(AutoCompleteTextView autocompletetextview, CharSequence charsequence, boolean flag)
    {
        try
        {
            Method method = android/widget/AutoCompleteTextView.getMethod(z[32], new Class[] {
                java/lang/CharSequence, Boolean.TYPE
            });
            method.setAccessible(true);
            method.invoke(autocompletetextview, new Object[] {
                charsequence, Boolean.valueOf(flag)
            });
            return;
        }
        catch (Exception exception)
        {
            autocompletetextview.setText(charsequence);
        }
    }

    private static void showSoftInputUnchecked(View view, InputMethodManager inputmethodmanager, int i)
    {
        try
        {
            Method method = inputmethodmanager.getClass().getMethod(z[39], new Class[] {
                Integer.TYPE, android/os/ResultReceiver
            });
            method.setAccessible(true);
            method.invoke(inputmethodmanager, new Object[] {
                Integer.valueOf(i), null
            });
            return;
        }
        catch (Exception exception)
        {
            inputmethodmanager.showSoftInput(view, i);
        }
    }

    private void updateCloseButton()
    {
        Object obj;
        int i;
        boolean flag2 = true;
        boolean flag1 = false;
        Drawable drawable;
        boolean flag;
        boolean flag3;
        try
        {
            flag3 = TextUtils.isEmpty(mQueryTextView.getText());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (!flag3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = ((flag2) ? 1 : 0);
        if (flag) goto _L2; else goto _L1
_L1:
        flag3 = mIconifiedByDefault;
        if (!flag3) goto _L4; else goto _L3
_L3:
        try
        {
            flag3 = mExpandedInActionView;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (flag3) goto _L4; else goto _L5
_L5:
        i = ((flag2) ? 1 : 0);
_L2:
        try
        {
            obj = mCloseButton;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (i != 0)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 8;
        }
        try
        {
            ((ImageView) (obj)).setVisibility(i);
            drawable = mCloseButton.getDrawable();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        obj = ENABLED_STATE_SET;
_L6:
        drawable.setState(((int []) (obj)));
        return;
        obj;
        throw obj;
_L4:
        i = 0;
          goto _L2
        obj = EMPTY_STATE_SET;
          goto _L6
    }

    private void updateFocusedState()
    {
        Object obj;
        boolean flag = mQueryTextView.hasFocus();
        Drawable drawable;
        try
        {
            drawable = mSearchPlate.getBackground();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        obj = FOCUSED_STATE_SET;
_L3:
        try
        {
            drawable.setState(((int []) (obj)));
            drawable = mSubmitArea.getBackground();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        obj = FOCUSED_STATE_SET;
_L4:
        drawable.setState(((int []) (obj)));
        invalidate();
        return;
_L2:
        obj = EMPTY_STATE_SET;
          goto _L3
        obj = EMPTY_STATE_SET;
          goto _L4
    }

    private void updateQueryHint()
    {
        boolean flag = a;
        CharSequence charsequence = mQueryHint;
        if (charsequence != null)
        {
            Object obj;
            ActivityNotFoundException activitynotfoundexception;
            int i;
            try
            {
                mQueryTextView.setHint(getDecoratedHint(mQueryHint));
            }
            catch (ActivityNotFoundException activitynotfoundexception1)
            {
                throw activitynotfoundexception1;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_98;
            }
        }
        obj = mSearchable;
        if (obj != null)
        {
            obj = null;
            i = mSearchable.getHintId();
            if (i != 0)
            {
                obj = getContext().getString(i);
            }
            if (obj != null)
            {
                try
                {
                    mQueryTextView.setHint(getDecoratedHint(((CharSequence) (obj))));
                }
                catch (ActivityNotFoundException activitynotfoundexception2)
                {
                    throw activitynotfoundexception2;
                }
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_98;
            }
        }
        mQueryTextView.setHint(getDecoratedHint(""));
        return;
        activitynotfoundexception;
        throw activitynotfoundexception;
        ActivityNotFoundException activitynotfoundexception3;
        activitynotfoundexception3;
        throw activitynotfoundexception3;
    }

    private void updateSubmitArea()
    {
        byte byte1 = 8;
        byte byte0;
        int i;
        boolean flag;
        try
        {
            flag = isSubmitAreaEnabled();
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            try
            {
                throw activitynotfoundexception;
            }
            catch (ActivityNotFoundException activitynotfoundexception1)
            {
                throw activitynotfoundexception1;
            }
        }
        byte0 = byte1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        if (mSubmitButton.getVisibility() == 0)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        i = mVoiceButton.getVisibility();
        byte0 = byte1;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        byte0 = 0;
        mSubmitArea.setVisibility(byte0);
        return;
    }

    private void updateSubmitButton(boolean flag)
    {
        byte byte1 = 8;
        boolean flag1 = mSubmitButtonEnabled;
        byte byte0;
        byte0 = byte1;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        flag1 = isSubmitAreaEnabled();
        byte0 = byte1;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        flag1 = hasFocus();
        byte0 = byte1;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        if (!flag)
        {
            ActivityNotFoundException activitynotfoundexception;
            try
            {
                flag = mVoiceButtonEnabled;
            }
            catch (ActivityNotFoundException activitynotfoundexception1)
            {
                throw activitynotfoundexception1;
            }
            byte0 = byte1;
            if (flag)
            {
                break MISSING_BLOCK_LABEL_64;
            }
        }
        byte0 = 0;
        mSubmitButton.setVisibility(byte0);
        return;
        activitynotfoundexception;
        throw activitynotfoundexception;
        activitynotfoundexception;
        throw activitynotfoundexception;
        activitynotfoundexception;
        throw activitynotfoundexception;
    }

    private void updateViewsVisibility(boolean flag)
    {
        boolean flag2 = true;
        byte byte0 = 8;
        Object obj;
        int i;
        boolean flag1;
        try
        {
            mIconified = flag;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        try
        {
            flag1 = TextUtils.isEmpty(mQueryTextView.getText());
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
        if (!flag1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        try
        {
            mSearchButton.setVisibility(i);
            updateSubmitButton(flag1);
            obj = mSearchEditFrame;
        }
        catch (ActivityNotFoundException activitynotfoundexception2)
        {
            throw activitynotfoundexception2;
        }
        if (flag)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        try
        {
            ((View) (obj)).setVisibility(i);
            obj = mSearchHintIcon;
            flag = mIconifiedByDefault;
        }
        catch (ActivityNotFoundException activitynotfoundexception3)
        {
            throw activitynotfoundexception3;
        }
        if (flag)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        try
        {
            ((ImageView) (obj)).setVisibility(i);
            updateCloseButton();
        }
        catch (ActivityNotFoundException activitynotfoundexception4)
        {
            throw activitynotfoundexception4;
        }
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
        boolean flag1 = mVoiceButtonEnabled;
        if (!flag1) goto _L2; else goto _L1
_L1:
        ActivityNotFoundException activitynotfoundexception;
        int i;
        try
        {
            flag1 = isIconified();
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
        if (flag1 || !flag) goto _L2; else goto _L3
_L3:
        i = 0;
        mSubmitButton.setVisibility(8);
_L5:
        mVoiceButton.setVisibility(i);
        return;
        activitynotfoundexception;
        throw activitynotfoundexception;
_L2:
        i = 8;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void clearFocus()
    {
        mClearingFocus = true;
        setImeVisibility(false);
        super.clearFocus();
        mQueryTextView.clearFocus();
        mClearingFocus = false;
    }

    public CharSequence getQuery()
    {
        return mQueryTextView.getText();
    }

    public boolean isIconified()
    {
        return mIconified;
    }

    public void onActionViewCollapsed()
    {
        clearFocus();
        updateViewsVisibility(true);
        mQueryTextView.setImeOptions(mCollapsedImeOptions);
        mExpandedInActionView = false;
    }

    public void onActionViewExpanded()
    {
        boolean flag;
        try
        {
            flag = mExpandedInActionView;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        if (flag)
        {
            return;
        } else
        {
            mExpandedInActionView = true;
            mCollapsedImeOptions = mQueryTextView.getImeOptions();
            mQueryTextView.setImeOptions(mCollapsedImeOptions | 0x2000000);
            mQueryTextView.setText("");
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

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName(com/actionbarsherlock/widget/SearchView.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        accessibilitynodeinfo.setClassName(com/actionbarsherlock/widget/SearchView.getName());
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        SearchableInfo searchableinfo;
        try
        {
            searchableinfo = mSearchable;
        }
        // Misplaced declaration of an exception variable
        catch (KeyEvent keyevent)
        {
            throw keyevent;
        }
        if (searchableinfo == null)
        {
            return false;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        int l;
        boolean flag;
        flag = a;
        try
        {
            if (isIconified())
            {
                super.onMeasure(i, j);
                return;
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        l = android.view.View.MeasureSpec.getMode(i);
        i = android.view.View.MeasureSpec.getSize(i);
        k = i;
        l;
        JVM INSTR lookupswitch 3: default 72
    //                   -2147483648: 85
    //                   0: 165
    //                   1073741824: 136;
           goto _L1 _L2 _L3 _L4
_L1:
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), j);
        return;
_L2:
        int i1;
        try
        {
            i1 = mMaxWidth;
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
        k = i;
        if (i1 > 0)
        {
            k = Math.min(mMaxWidth, i);
            i = k;
            if (!flag)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        k = Math.min(getPreferredWidth(), k);
        i = k;
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        try
        {
            i1 = mMaxWidth;
        }
        catch (ActivityNotFoundException activitynotfoundexception2)
        {
            throw activitynotfoundexception2;
        }
        i = k;
        if (i1 <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = Math.min(mMaxWidth, k);
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        try
        {
            if (mMaxWidth > 0)
            {
                i = mMaxWidth;
                continue; /* Loop/switch isn't completed */
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception3)
        {
            throw activitynotfoundexception3;
        }
        i = getPreferredWidth();
        if (true) goto _L1; else goto _L5
_L5:
    }

    void onQueryRefine(CharSequence charsequence)
    {
        setQuery(charsequence);
    }

    void onTextFocusChanged()
    {
        try
        {
            updateViewsVisibility(isIconified());
            postUpdateFocusedState();
            if (mQueryTextView.hasFocus())
            {
                forceSuggestionQuery();
            }
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        postUpdateFocusedState();
    }

    public boolean requestFocus(int i, Rect rect)
    {
        boolean flag = false;
        boolean flag1;
        try
        {
            flag1 = mClearingFocus;
        }
        // Misplaced declaration of an exception variable
        catch (Rect rect)
        {
            throw rect;
        }
        if (!flag1)
        {
            boolean flag2;
            try
            {
                flag2 = isFocusable();
            }
            // Misplaced declaration of an exception variable
            catch (Rect rect)
            {
                throw rect;
            }
            if (flag2)
            {
                if (!isIconified())
                {
                    boolean flag3 = mQueryTextView.requestFocus(i, rect);
                    flag = flag3;
                    if (flag3)
                    {
                        try
                        {
                            updateViewsVisibility(false);
                        }
                        // Misplaced declaration of an exception variable
                        catch (Rect rect)
                        {
                            throw rect;
                        }
                        return flag3;
                    }
                } else
                {
                    return super.requestFocus(i, rect);
                }
            }
        }
        return flag;
    }

    public void setIconified(boolean flag)
    {
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        onCloseClicked();
        if (!a)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        onSearchClicked();
        return;
        ActivityNotFoundException activitynotfoundexception;
        activitynotfoundexception;
        throw activitynotfoundexception;
    }

    public void setIconifiedByDefault(boolean flag)
    {
        boolean flag1;
        try
        {
            flag1 = mIconifiedByDefault;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        if (flag1 == flag)
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
        mQueryTextView.setImeOptions(i);
    }

    public void setInputType(int i)
    {
        mQueryTextView.setInputType(i);
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

    public void setOnQueryTextListener(OnQueryTextListener onquerytextlistener)
    {
        mOnQueryChangeListener = onquerytextlistener;
    }

    public void setOnSearchClickListener(android.view.View.OnClickListener onclicklistener)
    {
        mOnSearchClickListener = onclicklistener;
    }

    public void setQuery(CharSequence charsequence, boolean flag)
    {
        try
        {
            mQueryTextView.setText(charsequence);
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
        if (charsequence == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        mQueryTextView.setSelection(mQueryTextView.length());
        mUserQuery = charsequence;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        if (!TextUtils.isEmpty(charsequence))
        {
            onSubmitQuery();
        }
        return;
        charsequence;
        throw charsequence;
    }

    public void setQueryHint(CharSequence charsequence)
    {
        mQueryHint = charsequence;
        updateQueryHint();
    }

    public void setSubmitButtonEnabled(boolean flag)
    {
        mSubmitButtonEnabled = flag;
        updateViewsVisibility(isIconified());
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[42];
        obj = "\036uZf2(vOg.\030\177";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "$~Ka%\037MCv1";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\004nMt#\004ouz(\003~Dg\031\022c^a'(\177Kg'";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "\004nMt#\004ouz(\003~Dg\031\023z^r";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "\004nMt#\004ouz(\003~Dg\031\026x^z)\031";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "$~Ka%\037;Yf!\020~Yg/\030uY3%\002iY|4Wz^34\030l\n";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\004nMt#\004ouz(\003~Dg\031\006nOa?";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "WiOg3\005uOwf\022cIv6\003rE}h";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\026uNa)\036\177\004z(\003~Dgh\026x^z)\0315yV\007%Xb";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\004nMt#\004ouz(\003~Dg\031\023z^r\031\036\177";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "$~Ka%\037MCv1";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "4t_\177\"WuEgf\021rDwf\001tCp#WhOr4\024s\nr%\003r\\z2\016";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "\023tku2\022i~v>\003XBr(\020~N";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "\023thv \030iOG#\017oi{'\031|Ow";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "W;\n";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "\024zF\177/\031|uc'\024pKt#";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "\026uNa)\036\177\004z(\003~Dgh\026x^z)\0315yV\007%Xb";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "\000~HL5\022zXp.";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "\026uNa)\036\177\004`6\022~I{h\026x^z)\0315xV\0058\\dZ\0342DyC\0032Xb";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                obj = "\026uNa)\036\177\004`6\022~I{h\026x^z)\0315}V\004(HoR\0244S";
                byte0 = 18;
                i = 19;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "\033zS|3\003DC} \033z^v4";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "\026uNa)\036\177\004`6\022~I{h\022c^a'YWk]\001\"ZmV\031:TnV\n";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "\026uNa)\036\177\004`6\022~I{h\022c^a'YWk]\001\"ZmV";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "\026uNa)\036\177\004z(\003~Dgh\026x^z)\0315yV\007%Xb";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "\026uNa)\036\177\004`6\022~I{h\022c^a'YIo@\023;OyL\0262UnZ\b0RdG\0039O";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "\024zF\177/\031|uc'\024pKt#";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "\026uNa)\036\177\004`6\022~I{h\022c^a'YWk]\001\"ZmV\031:TnV\n";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                obj = "\026uNa)\036\177\004`6\022~I{h\022c^a'YKx\\\013'O";
                byte0 = 26;
                i = 27;
                break;

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 28;
                obj = "\021iOv\031\021tX~";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i] = ((String) (obj));
                i = 29;
                obj = "\026uNa)\036\177\004`6\022~I{h\022c^a'YVkK\031%^yF\n#H";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i] = ((String) (obj));
                i = 30;
                obj = "\026uNa)\036\177\004`6\022~I{h\022c^a'YIo@\023;OyL\0262UnZ\b0RdG\0039OuQ\0239_fV";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i] = ((String) (obj));
                i = 31;
                obj = "\022uYf4\022RGv\020\036hCq*\022";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i] = ((String) (obj));
                i = 32;
                obj = "\004~^G#\017o";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i] = ((String) (obj));
                i = 33;
                obj = "\036u^v(\003DOk2\005zuw'\003zux#\016";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i] = ((String) (obj));
                i = 34;
                obj = "\006nOa?";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i] = ((String) (obj));
                i = 35;
                obj = "\026x^z)\031DAv?";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[i] = ((String) (obj));
                i = 36;
                obj = "\026kZL\"\026oK";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[i] = ((String) (obj));
                i = 37;
                obj = "\026x^z)\031DG`!";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[i] = ((String) (obj));
                i = 38;
                obj = "\002hOa\031\006nOa?";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[i] = ((String) (obj));
                i = 39;
                obj = "\004sEd\025\030}^Z(\007n^F(\024sOp-\022\177";
                byte0 = 38;
                break;

            case 38: // '&'
                as1[i] = ((String) (obj));
                i = 40;
                obj = "1zC\177#\023;Fr3\031xB3'\024oCe/\003b\0203";
                byte0 = 39;
                break;

            case 39: // '\''
                as1[i] = ((String) (obj));
                i = 41;
                obj = "$~Ka%\037MCv1";
                byte0 = 40;
                break;

            case 40: // '('
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 1004
    //                   0 1027
    //                   1 1034
    //                   2 1041
    //                   3 1048;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_1048;
_L3:
        byte byte1 = 70;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 119;
          goto _L9
_L5:
        byte1 = 27;
          goto _L9
_L6:
        byte1 = 42;
          goto _L9
        byte1 = 19;
          goto _L9
    }
























    private class _cls1
        implements Runnable
    {

        private static final String z;
        final SearchView this$0;

        public void run()
        {
            InputMethodManager inputmethodmanager = (InputMethodManager)getContext().getSystemService(z);
            if (inputmethodmanager != null)
            {
                SearchView.showSoftInputUnchecked(SearchView.this, inputmethodmanager, 0);
            }
        }

        static 
        {
            char ac[];
            int i;
            int j;
            ac = "\n{\021n5<x\004o)\fq".toCharArray();
            j = ac.length;
            i = 0;
_L7:
            char c;
            if (j <= i)
            {
                z = (new String(ac)).intern();
                return;
            }
            c = ac[i];
            i % 5;
            JVM INSTR tableswitch 0 3: default 68
        //                       0 86
        //                       1 92
        //                       2 98
        //                       3 104;
               goto _L1 _L2 _L3 _L4 _L5
_L5:
            break MISSING_BLOCK_LABEL_104;
_L2:
            break; /* Loop/switch isn't completed */
_L1:
            byte byte0 = 65;
_L8:
            ac[i] = (char)(byte0 ^ c);
            i++;
            if (true) goto _L7; else goto _L6
_L6:
            byte0 = 99;
              goto _L8
_L3:
            byte0 = 21;
              goto _L8
_L4:
            byte0 = 97;
              goto _L8
            byte0 = 27;
              goto _L8
        }

        _cls1()
        {
            this$0 = SearchView.this;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final SearchView this$0;

        public void run()
        {
            updateFocusedState();
        }

        _cls2()
        {
            this$0 = SearchView.this;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final SearchView this$0;

        public void run()
        {
            if (mSuggestionsAdapter != null && (mSuggestionsAdapter instanceof SuggestionsAdapter))
            {
                mSuggestionsAdapter.changeCursor(null);
            }
        }

        _cls3()
        {
            this$0 = SearchView.this;
            super();
        }
    }


    private class _cls7
        implements android.view.View.OnClickListener
    {

        final SearchView this$0;

        public void onClick(View view)
        {
label0:
            {
                boolean flag = SearchView.a;
                if (view == mSearchButton)
                {
                    onSearchClicked();
                    if (!flag)
                    {
                        break label0;
                    }
                }
                if (view == mCloseButton)
                {
                    onCloseClicked();
                    if (!flag)
                    {
                        break label0;
                    }
                }
                if (view == mSubmitButton)
                {
                    onSubmitQuery();
                    if (!flag)
                    {
                        break label0;
                    }
                }
                if (view == mVoiceButton)
                {
                    onVoiceClicked();
                    if (!flag)
                    {
                        break label0;
                    }
                }
                if (view == mQueryTextView)
                {
                    forceSuggestionQuery();
                }
            }
        }

        _cls7()
        {
            this$0 = SearchView.this;
            super();
        }
    }


    private class _cls8
        implements android.view.View.OnKeyListener
    {

        final SearchView this$0;

        public boolean onKey(View view, int i, KeyEvent keyevent)
        {
            if (mSearchable != null)
            {
                if (mQueryTextView.isPopupShowing() && mQueryTextView.getListSelection() != -1)
                {
                    return onSuggestionsKey(view, i, keyevent);
                }
                if (!mQueryTextView.isEmpty() && KeyEventCompat.hasNoModifiers(keyevent))
                {
                    if (keyevent.getAction() == 1 && i == 66)
                    {
                        view.cancelLongPress();
                        launchQuerySearch(0, null, mQueryTextView.getText().toString());
                        return true;
                    }
                    if (keyevent.getAction() == 0)
                    {
                        return false;
                    }
                }
            }
            return false;
        }

        _cls8()
        {
            this$0 = SearchView.this;
            super();
        }
    }


    private class _cls9
        implements android.widget.TextView.OnEditorActionListener
    {

        final SearchView this$0;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            onSubmitQuery();
            return true;
        }

        _cls9()
        {
            this$0 = SearchView.this;
            super();
        }
    }


    private class _cls10
        implements android.widget.AdapterView.OnItemClickListener
    {

        final SearchView this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            onItemClicked(i, 0, null);
        }

        _cls10()
        {
            this$0 = SearchView.this;
            super();
        }
    }


    private class _cls11
        implements android.widget.AdapterView.OnItemSelectedListener
    {

        final SearchView this$0;

        public void onItemSelected(AdapterView adapterview, View view, int i, long l)
        {
            SearchView.this.onItemSelected(i);
        }

        public void onNothingSelected(AdapterView adapterview)
        {
        }

        _cls11()
        {
            this$0 = SearchView.this;
            super();
        }
    }


    private class _cls12
        implements TextWatcher
    {

        final SearchView this$0;

        public void afterTextChanged(Editable editable)
        {
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
            SearchView.this.onTextChanged(charsequence);
        }

        _cls12()
        {
            this$0 = SearchView.this;
            super();
        }
    }


    private class SearchAutoComplete extends AutoCompleteTextView
    {

        private static final String z;
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
                ((InputMethodManager)getContext().getSystemService(z)).showSoftInput(this, 0);
                if (SearchView.isLandscapeMode(getContext()))
                {
                    SearchView.ensureImeVisible(this, true);
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

        static 
        {
            char ac[];
            int i;
            int j;
            ac = "l4wl.Z7bm2j>".toCharArray();
            j = ac.length;
            i = 0;
_L7:
            char c;
            if (j <= i)
            {
                z = (new String(ac)).intern();
                return;
            }
            c = ac[i];
            i % 5;
            JVM INSTR tableswitch 0 3: default 68
        //                       0 86
        //                       1 91
        //                       2 97
        //                       3 103;
               goto _L1 _L2 _L3 _L4 _L5
_L5:
            break MISSING_BLOCK_LABEL_103;
_L2:
            break; /* Loop/switch isn't completed */
_L1:
            byte byte0 = 90;
_L8:
            ac[i] = (char)(byte0 ^ c);
            i++;
            if (true) goto _L7; else goto _L6
_L6:
            byte0 = 5;
              goto _L8
_L3:
            byte0 = 90;
              goto _L8
_L4:
            byte0 = 7;
              goto _L8
            byte0 = 25;
              goto _L8
        }


        public SearchAutoComplete(Context context)
        {
            super(context);
            mThreshold = getThreshold();
        }

        public SearchAutoComplete(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            mThreshold = getThreshold();
        }

        public SearchAutoComplete(Context context, AttributeSet attributeset, int i)
        {
            super(context, attributeset, i);
            mThreshold = getThreshold();
        }
    }


    private class _cls4
        implements android.view.View.OnFocusChangeListener
    {

        final SearchView this$0;

        public void onFocusChange(View view, boolean flag)
        {
            if (mOnQueryTextFocusChangeListener != null)
            {
                mOnQueryTextFocusChangeListener.onFocusChange(SearchView.this, flag);
            }
        }

        _cls4()
        {
            this$0 = SearchView.this;
            super();
        }
    }


    private class _cls5
        implements android.view.View.OnLayoutChangeListener
    {

        final SearchView this$0;

        public void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
                int k1, int l1)
        {
            adjustDropDownSizeAndPosition();
        }

        _cls5()
        {
            this$0 = SearchView.this;
            super();
        }
    }


    private class _cls6
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        final SearchView this$0;

        public void onGlobalLayout()
        {
            adjustDropDownSizeAndPosition();
        }

        _cls6()
        {
            this$0 = SearchView.this;
            super();
        }
    }


    private class OnCloseListener
    {

        public abstract boolean onClose();
    }


    private class OnSuggestionListener
    {

        public abstract boolean onSuggestionClick(int i);

        public abstract boolean onSuggestionSelect(int i);
    }


    private class OnQueryTextListener
    {

        public abstract boolean onQueryTextChange(String s);

        public abstract boolean onQueryTextSubmit(String s);
    }

}
