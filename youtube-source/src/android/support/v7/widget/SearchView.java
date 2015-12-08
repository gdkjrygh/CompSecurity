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
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.u;
import android.support.v4.widget.c;
import android.support.v7.a.e;
import android.support.v7.a.f;
import android.support.v7.a.h;
import android.support.v7.a.k;
import android.support.v7.c.b;
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
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v7.widget:
//            m, a, e, f, 
//            j, k, l, b, 
//            c, d, g, h, 
//            i, q, p, o, 
//            n

public class SearchView extends LinearLayout
    implements b
{

    static final m a = new m();
    private CharSequence A;
    private CharSequence B;
    private boolean C;
    private int D;
    private SearchableInfo E;
    private Bundle F;
    private Runnable G;
    private Runnable H;
    private Runnable I;
    private final Intent J;
    private final Intent K;
    private final WeakHashMap L;
    private final android.view.View.OnClickListener M;
    private final android.widget.TextView.OnEditorActionListener N;
    private final android.widget.AdapterView.OnItemClickListener O;
    private final android.widget.AdapterView.OnItemSelectedListener P;
    private TextWatcher Q;
    android.view.View.OnKeyListener b;
    private o c;
    private n d;
    private android.view.View.OnFocusChangeListener e;
    private p f;
    private android.view.View.OnClickListener g;
    private boolean h;
    private boolean i;
    private c j;
    private View k;
    private View l;
    private View m;
    private View n;
    private ImageView o;
    private View p;
    private View q;
    private SearchAutoComplete r;
    private View s;
    private ImageView t;
    private boolean u;
    private CharSequence v;
    private boolean w;
    private boolean x;
    private int y;
    private boolean z;

    public SearchView(Context context)
    {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        G = new a(this);
        H = new android.support.v7.widget.e(this);
        I = new android.support.v7.widget.f(this);
        L = new WeakHashMap();
        M = new j(this);
        b = new android.support.v7.widget.k(this);
        N = new l(this);
        O = new android.support.v7.widget.b(this);
        P = new android.support.v7.widget.c(this);
        Q = new d(this);
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(h.s, this, true);
        k = findViewById(f.t);
        r = (SearchAutoComplete)findViewById(f.z);
        r.a(this);
        p = findViewById(f.v);
        m = findViewById(f.y);
        n = findViewById(f.D);
        l = findViewById(f.w);
        o = (ImageView)findViewById(f.u);
        q = findViewById(f.A);
        t = (ImageView)findViewById(f.x);
        k.setOnClickListener(M);
        o.setOnClickListener(M);
        l.setOnClickListener(M);
        q.setOnClickListener(M);
        r.setOnClickListener(M);
        r.addTextChangedListener(Q);
        r.setOnEditorActionListener(N);
        r.setOnItemClickListener(O);
        r.setOnItemSelectedListener(P);
        r.setOnKeyListener(b);
        r.setOnFocusChangeListener(new g(this));
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, k.A, 0, 0);
        setIconifiedByDefault(typedarray.getBoolean(3, true));
        int i1 = typedarray.getDimensionPixelSize(0, -1);
        if (i1 != -1)
        {
            setMaxWidth(i1);
        }
        CharSequence charsequence = typedarray.getText(4);
        if (!TextUtils.isEmpty(charsequence))
        {
            setQueryHint(charsequence);
        }
        i1 = typedarray.getInt(2, -1);
        if (i1 != -1)
        {
            setImeOptions(i1);
        }
        i1 = typedarray.getInt(1, -1);
        if (i1 != -1)
        {
            setInputType(i1);
        }
        typedarray.recycle();
        context = context.obtainStyledAttributes(attributeset, k.J, 0, 0);
        boolean flag = context.getBoolean(0, true);
        context.recycle();
        setFocusable(flag);
        J = new Intent("android.speech.action.WEB_SEARCH");
        J.addFlags(0x10000000);
        J.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        K = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        K.addFlags(0x10000000);
        s = findViewById(r.getDropDownAnchor());
        if (s != null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                s.addOnLayoutChangeListener(new android.support.v7.widget.h(this));
            } else
            {
                s.getViewTreeObserver().addOnGlobalLayoutListener(new i(this));
            }
        }
        a(h);
        i();
    }

    private Intent a(Cursor cursor, int i1, String s1)
    {
        Object obj;
        Object obj1;
        Object obj2;
        String s2;
        try
        {
            obj1 = android.support.v7.widget.q.a(cursor, "suggest_intent_action");
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            try
            {
                i1 = cursor.getPosition();
            }
            // Misplaced declaration of an exception variable
            catch (Cursor cursor)
            {
                i1 = -1;
            }
            Log.w("SearchView", (new StringBuilder("Search suggestions cursor at row ")).append(i1).append(" returned exception.").toString(), s1);
            return null;
        }
        obj = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        obj = E.getSuggestIntentAction();
          goto _L2
_L7:
        obj2 = android.support.v7.widget.q.a(cursor, "suggest_intent_data");
        obj = obj2;
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        obj = E.getSuggestIntentData();
        obj2 = obj;
        if (obj == null) goto _L4; else goto _L3
_L3:
        s2 = android.support.v7.widget.q.a(cursor, "suggest_intent_data_id");
        obj2 = obj;
        if (s2 == null) goto _L4; else goto _L5
_L5:
        obj2 = (new StringBuilder()).append(((String) (obj))).append("/").append(Uri.encode(s2)).toString();
          goto _L4
_L6:
        obj2 = android.support.v7.widget.q.a(cursor, "suggest_intent_query");
        return a(((String) (obj1)), ((Uri) (obj)), android.support.v7.widget.q.a(cursor, "suggest_intent_extra_data"), ((String) (obj2)), i1, s1);
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

    private Intent a(String s1, Uri uri, String s2, String s3, int i1, String s4)
    {
        s1 = new Intent(s1);
        s1.addFlags(0x10000000);
        if (uri != null)
        {
            s1.setData(uri);
        }
        s1.putExtra("user_query", B);
        if (s3 != null)
        {
            s1.putExtra("query", s3);
        }
        if (s2 != null)
        {
            s1.putExtra("intent_extra_data_key", s2);
        }
        if (F != null)
        {
            s1.putExtra("app_data", F);
        }
        if (i1 != 0)
        {
            s1.putExtra("action_key", i1);
            s1.putExtra("action_msg", s4);
        }
        s1.setComponent(E.getSearchActivity());
        return s1;
    }

    private void a(int i1, String s1, String s2)
    {
        s1 = a("android.intent.action.SEARCH", null, null, s2, i1, s1);
        getContext().startActivity(s1);
    }

    private void a(Intent intent)
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
            Log.e("SearchView", (new StringBuilder("Failed launch activity: ")).append(intent).toString(), runtimeexception);
        }
    }

    static void a(SearchView searchview)
    {
        boolean flag = searchview.r.hasFocus();
        Drawable drawable = searchview.m.getBackground();
        int ai[];
        if (flag)
        {
            ai = FOCUSED_STATE_SET;
        } else
        {
            ai = EMPTY_STATE_SET;
        }
        drawable.setState(ai);
        drawable = searchview.n.getBackground();
        if (flag)
        {
            ai = FOCUSED_STATE_SET;
        } else
        {
            ai = EMPTY_STATE_SET;
        }
        drawable.setState(ai);
        searchview.invalidate();
    }

    static void a(SearchView searchview, int i1, String s1, String s2)
    {
        searchview.a(0, ((String) (null)), s2);
    }

    static void a(SearchView searchview, CharSequence charsequence)
    {
        boolean flag1 = true;
        android.text.Editable editable = searchview.r.getText();
        searchview.B = editable;
        boolean flag;
        if (!TextUtils.isEmpty(editable))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        searchview.b(flag);
        if (!flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        searchview.d(flag);
        searchview.g();
        searchview.f();
        if (searchview.c != null && !TextUtils.equals(charsequence, searchview.A))
        {
            o o1 = searchview.c;
            charsequence.toString();
        }
        searchview.A = charsequence.toString();
    }

    static void a(SearchView searchview, boolean flag)
    {
        searchview.c(false);
    }

    private void a(boolean flag)
    {
        boolean flag2 = true;
        byte byte0 = 8;
        i = flag;
        Object obj;
        int i1;
        boolean flag1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        if (!TextUtils.isEmpty(r.getText()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        k.setVisibility(i1);
        b(flag1);
        obj = p;
        if (flag)
        {
            i1 = 8;
        } else
        {
            i1 = 0;
        }
        ((View) (obj)).setVisibility(i1);
        obj = t;
        if (h)
        {
            i1 = byte0;
        } else
        {
            i1 = 0;
        }
        ((ImageView) (obj)).setVisibility(i1);
        g();
        if (!flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        d(flag);
        f();
    }

    private boolean a(int i1)
    {
        boolean flag = false;
        if (f == null || !f.b())
        {
            Cursor cursor = j.a();
            if (cursor != null && cursor.moveToPosition(i1))
            {
                a(a(cursor, 0, null));
            }
            c(false);
            r.dismissDropDown();
            flag = true;
        }
        return flag;
    }

    static boolean a(Context context)
    {
        return context.getResources().getConfiguration().orientation == 2;
    }

    static boolean a(SearchView searchview, int i1)
    {
        if (searchview.f == null || !searchview.f.a())
        {
            android.text.Editable editable = searchview.r.getText();
            Object obj = searchview.j.a();
            if (obj != null)
            {
                if (((Cursor) (obj)).moveToPosition(i1))
                {
                    obj = searchview.j.b(((Cursor) (obj)));
                    if (obj != null)
                    {
                        searchview.c(((CharSequence) (obj)));
                    } else
                    {
                        searchview.c(editable);
                    }
                } else
                {
                    searchview.c(editable);
                }
            }
            return true;
        } else
        {
            return false;
        }
    }

    static boolean a(SearchView searchview, int i1, int j1, String s1)
    {
        return searchview.a(i1);
    }

    static boolean a(SearchView searchview, View view, int i1, KeyEvent keyevent)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (searchview.E != null)
        {
            flag = flag1;
            if (searchview.j != null)
            {
                flag = flag1;
                if (keyevent.getAction() == 0)
                {
                    flag = flag1;
                    if (android.support.v4.view.u.a(keyevent))
                    {
                        if (i1 == 66 || i1 == 84 || i1 == 61)
                        {
                            flag = searchview.a(searchview.r.getListSelection());
                        } else
                        {
                            if (i1 == 21 || i1 == 22)
                            {
                                if (i1 == 21)
                                {
                                    i1 = 0;
                                } else
                                {
                                    i1 = searchview.r.length();
                                }
                                searchview.r.setSelection(i1);
                                searchview.r.setListSelection(0);
                                searchview.r.clearListSelection();
                                a.a(searchview.r, true);
                                return true;
                            }
                            flag = flag1;
                            if (i1 == 19)
                            {
                                searchview.r.getListSelection();
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    static c b(SearchView searchview)
    {
        return searchview.j;
    }

    private CharSequence b(CharSequence charsequence)
    {
        if (!h)
        {
            return charsequence;
        } else
        {
            SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder("   ");
            spannablestringbuilder.append(charsequence);
            charsequence = getContext().getResources();
            TypedValue typedvalue = new TypedValue();
            getContext().getTheme().resolveAttribute(android.support.v7.a.c.l, typedvalue, true);
            charsequence = charsequence.getDrawable(typedvalue.resourceId);
            int i1 = (int)((double)r.getTextSize() * 1.25D);
            charsequence.setBounds(0, 0, i1, i1);
            spannablestringbuilder.setSpan(new ImageSpan(charsequence), 1, 2, 33);
            return spannablestringbuilder;
        }
    }

    private void b(boolean flag)
    {
        byte byte0;
label0:
        {
            byte byte1 = 8;
            byte0 = byte1;
            if (!u)
            {
                break label0;
            }
            byte0 = byte1;
            if (!e())
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
                if (z)
                {
                    break label0;
                }
            }
            byte0 = 0;
        }
        l.setVisibility(byte0);
    }

    static android.view.View.OnFocusChangeListener c(SearchView searchview)
    {
        return searchview.e;
    }

    private void c(CharSequence charsequence)
    {
        r.setText(charsequence);
        SearchAutoComplete searchautocomplete = r;
        int i1;
        if (TextUtils.isEmpty(charsequence))
        {
            i1 = 0;
        } else
        {
            i1 = charsequence.length();
        }
        searchautocomplete.setSelection(i1);
    }

    private void c(boolean flag)
    {
        if (flag)
        {
            post(G);
        } else
        {
            removeCallbacks(G);
            InputMethodManager inputmethodmanager = (InputMethodManager)getContext().getSystemService("input_method");
            if (inputmethodmanager != null)
            {
                inputmethodmanager.hideSoftInputFromWindow(getWindowToken(), 0);
                return;
            }
        }
    }

    private int d()
    {
        return getContext().getResources().getDimensionPixelSize(e.f);
    }

    static void d(SearchView searchview)
    {
        if (searchview.s.getWidth() > 1)
        {
            Resources resources = searchview.getContext().getResources();
            int j1 = searchview.m.getPaddingLeft();
            Rect rect = new Rect();
            int i1;
            int k1;
            int l1;
            int i2;
            if (searchview.h)
            {
                i1 = resources.getDimensionPixelSize(e.d);
                i1 = resources.getDimensionPixelSize(e.e) + i1;
            } else
            {
                i1 = 0;
            }
            searchview.r.getDropDownBackground().getPadding(rect);
            k1 = rect.left;
            searchview.r.setDropDownHorizontalOffset(j1 - (k1 + i1));
            k1 = searchview.s.getWidth();
            l1 = rect.left;
            i2 = rect.right;
            searchview.r.setDropDownWidth((i1 + (i2 + (k1 + l1))) - j1);
        }
    }

    private void d(boolean flag)
    {
        int i1;
        if (z && !i && flag)
        {
            i1 = 0;
            l.setVisibility(8);
        } else
        {
            i1 = 8;
        }
        q.setVisibility(i1);
    }

    static View e(SearchView searchview)
    {
        return searchview.k;
    }

    private boolean e()
    {
        return (u || z) && !i;
    }

    private void f()
    {
        byte byte0;
label0:
        {
            byte byte1 = 8;
            byte0 = byte1;
            if (!e())
            {
                break label0;
            }
            if (l.getVisibility() != 0)
            {
                byte0 = byte1;
                if (q.getVisibility() != 0)
                {
                    break label0;
                }
            }
            byte0 = 0;
        }
        n.setVisibility(byte0);
    }

    static void f(SearchView searchview)
    {
        searchview.l();
    }

    static ImageView g(SearchView searchview)
    {
        return searchview.o;
    }

    private void g()
    {
        boolean flag2 = true;
        boolean flag1 = false;
        ImageView imageview;
        int ai[];
        Drawable drawable;
        boolean flag;
        int i1;
        if (!TextUtils.isEmpty(r.getText()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i1 = ((flag2) ? 1 : 0);
        if (!flag)
        {
            if (h && !C)
            {
                i1 = ((flag2) ? 1 : 0);
            } else
            {
                i1 = 0;
            }
        }
        imageview = o;
        if (i1 != 0)
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        imageview.setVisibility(i1);
        drawable = o.getDrawable();
        if (flag)
        {
            ai = ENABLED_STATE_SET;
        } else
        {
            ai = EMPTY_STATE_SET;
        }
        drawable.setState(ai);
    }

    private void h()
    {
        post(H);
    }

    static void h(SearchView searchview)
    {
        searchview.k();
    }

    static View i(SearchView searchview)
    {
        return searchview.l;
    }

    private void i()
    {
        if (v != null)
        {
            r.setHint(b(v));
        } else
        if (E != null)
        {
            String s1 = null;
            int i1 = E.getHintId();
            if (i1 != 0)
            {
                s1 = getContext().getString(i1);
            }
            if (s1 != null)
            {
                r.setHint(b(s1));
                return;
            }
        } else
        {
            r.setHint(b(""));
            return;
        }
    }

    private void j()
    {
label0:
        {
            android.text.Editable editable = r.getText();
            if (editable == null || TextUtils.getTrimmedLength(editable) <= 0)
            {
                break label0;
            }
            if (c != null)
            {
                o o1 = c;
                editable.toString();
                if (o1.a())
                {
                    break label0;
                }
            }
            if (E != null)
            {
                a(0, ((String) (null)), editable.toString());
                c(false);
            }
            r.dismissDropDown();
        }
    }

    static void j(SearchView searchview)
    {
        searchview.j();
    }

    static View k(SearchView searchview)
    {
        return searchview.q;
    }

    private void k()
    {
        if (TextUtils.isEmpty(r.getText()))
        {
            if (h && (d == null || !d.a()))
            {
                clearFocus();
                a(true);
            }
            return;
        } else
        {
            r.setText("");
            r.requestFocus();
            c(true);
            return;
        }
    }

    private void l()
    {
        a(false);
        r.requestFocus();
        c(true);
        if (g != null)
        {
            g.onClick(this);
        }
    }

    static void l(SearchView searchview)
    {
        Object obj;
        Object obj3;
        SearchableInfo searchableinfo;
        obj3 = null;
        obj = null;
        if (searchview.E == null)
        {
            break MISSING_BLOCK_LABEL_370;
        }
        searchableinfo = searchview.E;
        Object obj1;
        Object obj2;
        if (!searchableinfo.getVoiceSearchLaunchWebSearch())
        {
            break MISSING_BLOCK_LABEL_74;
        }
        obj1 = new Intent(searchview.J);
        obj2 = searchableinfo.getSearchActivity();
        if (obj2 != null) goto _L2; else goto _L1
_L2:
        obj = ((ComponentName) (obj2)).flattenToShortString();
          goto _L1
        ComponentName componentname;
        if (!searchableinfo.getVoiceSearchLaunchRecognizer())
        {
            break MISSING_BLOCK_LABEL_370;
        }
        obj = searchview.K;
        componentname = searchableinfo.getSearchActivity();
        obj1 = new Intent("android.intent.action.SEARCH");
        ((Intent) (obj1)).setComponent(componentname);
        pendingintent = PendingIntent.getActivity(searchview.getContext(), 0, ((Intent) (obj1)), 0x40000000);
        bundle = new Bundle();
        if (searchview.F != null)
        {
            bundle.putParcelable("app_data", searchview.F);
        }
        intent = new Intent(((Intent) (obj)));
        i1 = 1;
        obj2 = searchview.getResources();
        if (searchableinfo.getVoiceLanguageModeId() == 0)
        {
            break MISSING_BLOCK_LABEL_363;
        }
        obj = ((Resources) (obj2)).getString(searchableinfo.getVoiceLanguageModeId());
_L12:
        if (searchableinfo.getVoicePromptTextId() == 0) goto _L4; else goto _L3
_L3:
        obj1 = ((Resources) (obj2)).getString(searchableinfo.getVoicePromptTextId());
_L11:
        if (searchableinfo.getVoiceLanguageId() == 0) goto _L6; else goto _L5
_L5:
        obj2 = ((Resources) (obj2)).getString(searchableinfo.getVoiceLanguageId());
_L10:
        if (searchableinfo.getVoiceMaxResults() != 0)
        {
            i1 = searchableinfo.getVoiceMaxResults();
        }
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", ((String) (obj)));
        intent.putExtra("android.speech.extra.PROMPT", ((String) (obj1)));
        intent.putExtra("android.speech.extra.LANGUAGE", ((String) (obj2)));
        intent.putExtra("android.speech.extra.MAX_RESULTS", i1);
        if (componentname != null) goto _L8; else goto _L7
_L7:
        obj = obj3;
_L9:
        intent.putExtra("calling_package", ((String) (obj)));
        intent.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", pendingintent);
        intent.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        searchview.getContext().startActivity(intent);
        return;
_L1:
        PendingIntent pendingintent;
        Bundle bundle;
        Intent intent;
        int i1;
        try
        {
            ((Intent) (obj1)).putExtra("calling_package", ((String) (obj)));
            searchview.getContext().startActivity(((Intent) (obj1)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SearchView searchview)
        {
            Log.w("SearchView", "Could not find voice search activity");
        }
        return;
_L8:
        obj = componentname.flattenToShortString();
        if (true) goto _L9; else goto _L6
_L6:
        obj2 = null;
          goto _L10
_L4:
        obj1 = null;
          goto _L11
        obj = "free_form";
          goto _L12
    }

    static SearchAutoComplete m(SearchView searchview)
    {
        return searchview.r;
    }

    private void m()
    {
        a.a(r);
        a.b(r);
    }

    static void n(SearchView searchview)
    {
        searchview.m();
    }

    static SearchableInfo o(SearchView searchview)
    {
        return searchview.E;
    }

    public final void a()
    {
        if (C)
        {
            return;
        } else
        {
            C = true;
            D = r.getImeOptions();
            r.setImeOptions(D | 0x2000000);
            r.setText("");
            setIconified(false);
            return;
        }
    }

    final void a(CharSequence charsequence)
    {
        c(charsequence);
    }

    public final void b()
    {
        clearFocus();
        a(true);
        r.setImeOptions(D);
        C = false;
    }

    final void c()
    {
        a(i);
        h();
        if (r.hasFocus())
        {
            m();
        }
    }

    public void clearFocus()
    {
        x = true;
        c(false);
        super.clearFocus();
        r.clearFocus();
        x = false;
    }

    protected void onDetachedFromWindow()
    {
        removeCallbacks(H);
        post(I);
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (E == null)
        {
            return false;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
        int l1;
        if (i)
        {
            super.onMeasure(i1, j1);
            return;
        }
        l1 = android.view.View.MeasureSpec.getMode(i1);
        k1 = android.view.View.MeasureSpec.getSize(i1);
        l1;
        JVM INSTR lookupswitch 3: default 60
    //                   -2147483648: 75
    //                   0: 127
    //                   1073741824: 106;
           goto _L1 _L2 _L3 _L4
_L1:
        i1 = k1;
_L6:
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000), j1);
        return;
_L2:
        if (y > 0)
        {
            i1 = Math.min(y, k1);
        } else
        {
            i1 = Math.min(d(), k1);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = k1;
        if (y > 0)
        {
            i1 = Math.min(y, k1);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (y > 0)
        {
            i1 = y;
        } else
        {
            i1 = d();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        h();
    }

    public boolean requestFocus(int i1, Rect rect)
    {
        while (x || !isFocusable()) 
        {
            return false;
        }
        if (!i)
        {
            boolean flag = r.requestFocus(i1, rect);
            if (flag)
            {
                a(false);
            }
            return flag;
        } else
        {
            return super.requestFocus(i1, rect);
        }
    }

    public void setAppSearchData(Bundle bundle)
    {
        F = bundle;
    }

    public void setIconified(boolean flag)
    {
        if (flag)
        {
            k();
            return;
        } else
        {
            l();
            return;
        }
    }

    public void setIconifiedByDefault(boolean flag)
    {
        if (h == flag)
        {
            return;
        } else
        {
            h = flag;
            a(flag);
            i();
            return;
        }
    }

    public void setImeOptions(int i1)
    {
        r.setImeOptions(i1);
    }

    public void setInputType(int i1)
    {
        r.setInputType(i1);
    }

    public void setMaxWidth(int i1)
    {
        y = i1;
        requestLayout();
    }

    public void setOnCloseListener(n n1)
    {
        d = n1;
    }

    public void setOnQueryTextFocusChangeListener(android.view.View.OnFocusChangeListener onfocuschangelistener)
    {
        e = onfocuschangelistener;
    }

    public void setOnQueryTextListener(o o1)
    {
        c = o1;
    }

    public void setOnSearchClickListener(android.view.View.OnClickListener onclicklistener)
    {
        g = onclicklistener;
    }

    public void setOnSuggestionListener(p p1)
    {
        f = p1;
    }

    public void setQuery(CharSequence charsequence, boolean flag)
    {
        r.setText(charsequence);
        if (charsequence != null)
        {
            r.setSelection(r.length());
            B = charsequence;
        }
        if (flag && !TextUtils.isEmpty(charsequence))
        {
            j();
        }
    }

    public void setQueryHint(CharSequence charsequence)
    {
        v = charsequence;
        i();
    }

    public void setQueryRefinementEnabled(boolean flag)
    {
        w = flag;
        if (j instanceof q)
        {
            q q1 = (q)j;
            byte byte0;
            if (flag)
            {
                byte0 = 2;
            } else
            {
                byte0 = 1;
            }
            q1.a(byte0);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableinfo)
    {
        boolean flag;
        flag = true;
        E = searchableinfo;
        if (E != null)
        {
            r.setThreshold(E.getSuggestThreshold());
            r.setImeOptions(E.getImeOptions());
            int j1 = E.getInputType();
            int i1 = j1;
            if ((j1 & 0xf) == 1)
            {
                j1 &= 0xfffeffff;
                i1 = j1;
                if (E.getSuggestAuthority() != null)
                {
                    i1 = j1 | 0x10000 | 0x80000;
                }
            }
            r.setInputType(i1);
            if (j != null)
            {
                j.a(null);
            }
            if (E.getSuggestAuthority() != null)
            {
                j = new q(getContext(), this, E, L);
                r.setAdapter(j);
                searchableinfo = (q)j;
                byte byte0;
                if (w)
                {
                    byte0 = 2;
                } else
                {
                    byte0 = 1;
                }
                searchableinfo.a(byte0);
            }
            i();
        }
        if (E == null || !E.getVoiceSearchEnabled()) goto _L2; else goto _L1
_L1:
        if (E.getVoiceSearchLaunchWebSearch())
        {
            searchableinfo = J;
        } else
        if (E.getVoiceSearchLaunchRecognizer())
        {
            searchableinfo = K;
        } else
        {
            searchableinfo = null;
        }
        if (searchableinfo == null) goto _L2; else goto _L3
_L3:
        if (getContext().getPackageManager().resolveActivity(searchableinfo, 0x10000) == null)
        {
            flag = false;
        }
_L5:
        z = flag;
        if (z)
        {
            r.setPrivateImeOptions("nm");
        }
        a(i);
        return;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void setSubmitButtonEnabled(boolean flag)
    {
        u = flag;
        a(i);
    }

    public void setSuggestionsAdapter(c c1)
    {
        j = c1;
        r.setAdapter(j);
    }


    private class SearchAutoComplete extends AutoCompleteTextView
    {

        private int a;
        private SearchView b;

        static boolean a(SearchAutoComplete searchautocomplete)
        {
            return TextUtils.getTrimmedLength(searchautocomplete.getText()) == 0;
        }

        final void a(SearchView searchview)
        {
            b = searchview;
        }

        public boolean enoughToFilter()
        {
            return a <= 0 || super.enoughToFilter();
        }

        protected void onFocusChanged(boolean flag, int i1, Rect rect)
        {
            super.onFocusChanged(flag, i1, rect);
            b.c();
        }

        public boolean onKeyPreIme(int i1, KeyEvent keyevent)
        {
            if (i1 == 4)
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
                        b.clearFocus();
                        SearchView.a(b, false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i1, keyevent);
        }

        public void onWindowFocusChanged(boolean flag)
        {
            super.onWindowFocusChanged(flag);
            if (flag && b.hasFocus() && getVisibility() == 0)
            {
                ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(this, 0);
                if (SearchView.a(getContext()))
                {
                    SearchView.a.a(this, true);
                }
            }
        }

        public void performCompletion()
        {
        }

        protected void replaceText(CharSequence charsequence)
        {
        }

        public void setThreshold(int i1)
        {
            super.setThreshold(i1);
            a = i1;
        }

        public SearchAutoComplete(Context context)
        {
            super(context);
            a = getThreshold();
        }

        public SearchAutoComplete(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            a = getThreshold();
        }

        public SearchAutoComplete(Context context, AttributeSet attributeset, int i1)
        {
            super(context, attributeset, i1);
            a = getThreshold();
        }
    }

}
