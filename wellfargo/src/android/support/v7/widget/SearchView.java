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
import android.support.v4.view.KeyEventCompat;
import android.support.v4.widget.CursorAdapter;
import android.support.v7.a.b;
import android.support.v7.a.e;
import android.support.v7.a.g;
import android.support.v7.a.i;
import android.support.v7.a.l;
import android.support.v7.c.c;
import android.support.v7.internal.widget.bd;
import android.support.v7.internal.widget.bf;
import android.support.v7.internal.widget.bl;
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
import android.widget.ImageView;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v7.widget:
//            z, ba, ao, as, 
//            at, ax, ay, az, 
//            ap, aq, ar, au, 
//            be, bd, bc, av, 
//            aw, bb

public class SearchView extends z
    implements c
{

    static final ba a = new ba();
    private static final boolean c;
    private CursorAdapter A;
    private boolean B;
    private CharSequence C;
    private boolean D;
    private boolean E;
    private int F;
    private boolean G;
    private CharSequence H;
    private CharSequence I;
    private boolean J;
    private int K;
    private SearchableInfo L;
    private Bundle M;
    private final bd N;
    private Runnable O;
    private final Runnable P;
    private Runnable Q;
    private final WeakHashMap R;
    private final android.view.View.OnClickListener S;
    private final android.widget.TextView.OnEditorActionListener T;
    private final android.widget.AdapterView.OnItemClickListener U;
    private final android.widget.AdapterView.OnItemSelectedListener V;
    private TextWatcher W;
    android.view.View.OnKeyListener b;
    private final SearchAutoComplete d;
    private final View e;
    private final View f;
    private final View g;
    private final ImageView h;
    private final ImageView i;
    private final ImageView j;
    private final ImageView k;
    private final View l;
    private final ImageView m;
    private final Drawable n;
    private final int o;
    private final int p;
    private final Intent q;
    private final Intent r;
    private final CharSequence s;
    private bc t;
    private bb u;
    private android.view.View.OnFocusChangeListener v;
    private android.support.v7.widget.bd w;
    private android.view.View.OnClickListener x;
    private boolean y;
    private boolean z;

    public SearchView(Context context)
    {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        O = new ao(this);
        P = new as(this);
        Q = new at(this);
        R = new WeakHashMap();
        S = new ax(this);
        b = new ay(this);
        T = new az(this);
        U = new ap(this);
        V = new aq(this);
        W = new ar(this);
        attributeset = bf.a(context, attributeset, l.SearchView, i1, 0);
        N = attributeset.c();
        LayoutInflater.from(context).inflate(attributeset.f(l.SearchView_layout, i.abc_search_view), this, true);
        d = (SearchAutoComplete)findViewById(g.search_src_text);
        d.setSearchView(this);
        e = findViewById(g.search_edit_frame);
        f = findViewById(g.search_plate);
        g = findViewById(g.submit_area);
        h = (ImageView)findViewById(g.search_button);
        i = (ImageView)findViewById(g.search_go_btn);
        j = (ImageView)findViewById(g.search_close_btn);
        k = (ImageView)findViewById(g.search_voice_btn);
        m = (ImageView)findViewById(g.search_mag_icon);
        f.setBackgroundDrawable(attributeset.a(l.SearchView_queryBackground));
        g.setBackgroundDrawable(attributeset.a(l.SearchView_submitBackground));
        h.setImageDrawable(attributeset.a(l.SearchView_searchIcon));
        i.setImageDrawable(attributeset.a(l.SearchView_goIcon));
        j.setImageDrawable(attributeset.a(l.SearchView_closeIcon));
        k.setImageDrawable(attributeset.a(l.SearchView_voiceIcon));
        m.setImageDrawable(attributeset.a(l.SearchView_searchIcon));
        n = attributeset.a(l.SearchView_searchHintIcon);
        o = attributeset.f(l.SearchView_suggestionRowLayout, i.abc_search_dropdown_item_icons_2line);
        p = attributeset.f(l.SearchView_commitIcon, 0);
        h.setOnClickListener(S);
        j.setOnClickListener(S);
        i.setOnClickListener(S);
        k.setOnClickListener(S);
        d.setOnClickListener(S);
        d.addTextChangedListener(W);
        d.setOnEditorActionListener(T);
        d.setOnItemClickListener(U);
        d.setOnItemSelectedListener(V);
        d.setOnKeyListener(b);
        d.setOnFocusChangeListener(new au(this));
        setIconifiedByDefault(attributeset.a(l.SearchView_iconifiedByDefault, true));
        i1 = attributeset.d(l.SearchView_android_maxWidth, -1);
        if (i1 != -1)
        {
            setMaxWidth(i1);
        }
        s = attributeset.c(l.SearchView_defaultQueryHint);
        C = attributeset.c(l.SearchView_queryHint);
        i1 = attributeset.a(l.SearchView_android_imeOptions, -1);
        if (i1 != -1)
        {
            setImeOptions(i1);
        }
        i1 = attributeset.a(l.SearchView_android_inputType, -1);
        if (i1 != -1)
        {
            setInputType(i1);
        }
        setFocusable(attributeset.a(l.SearchView_android_focusable, true));
        attributeset.b();
        q = new Intent("android.speech.action.WEB_SEARCH");
        q.addFlags(0x10000000);
        q.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        r = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        r.addFlags(0x10000000);
        l = findViewById(d.getDropDownAnchor());
        if (l != null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                e();
            } else
            {
                f();
            }
        }
        a(y);
        n();
    }

    private Intent a(Intent intent, SearchableInfo searchableinfo)
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

    private Intent a(Cursor cursor, int i1, String s1)
    {
        Object obj;
        Object obj1;
        Object obj2;
        String s2;
        try
        {
            obj1 = be.a(cursor, "suggest_intent_action");
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
            Log.w("SearchView", (new StringBuilder()).append("Search suggestions cursor at row ").append(i1).append(" returned exception.").toString(), s1);
            return null;
        }
        obj = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        obj = obj1;
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            obj = L.getSuggestIntentAction();
        }
          goto _L2
_L7:
        obj2 = be.a(cursor, "suggest_intent_data");
        obj = obj2;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        obj = obj2;
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        obj = L.getSuggestIntentData();
        obj2 = obj;
        if (obj == null) goto _L4; else goto _L3
_L3:
        s2 = be.a(cursor, "suggest_intent_data_id");
        obj2 = obj;
        if (s2 == null) goto _L4; else goto _L5
_L5:
        obj2 = (new StringBuilder()).append(((String) (obj))).append("/").append(Uri.encode(s2)).toString();
          goto _L4
_L6:
        obj2 = be.a(cursor, "suggest_intent_query");
        return a(((String) (obj1)), ((Uri) (obj)), be.a(cursor, "suggest_intent_extra_data"), ((String) (obj2)), i1, s1);
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
        s1.putExtra("user_query", I);
        if (s3 != null)
        {
            s1.putExtra("query", s3);
        }
        if (s2 != null)
        {
            s1.putExtra("intent_extra_data_key", s2);
        }
        if (M != null)
        {
            s1.putExtra("app_data", M);
        }
        if (i1 != 0)
        {
            s1.putExtra("action_key", i1);
            s1.putExtra("action_msg", s4);
        }
        if (c)
        {
            s1.setComponent(L.getSearchActivity());
        }
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
            Log.e("SearchView", (new StringBuilder()).append("Failed launch activity: ").append(intent).toString(), runtimeexception);
        }
    }

    static void a(SearchView searchview)
    {
        searchview.m();
    }

    static void a(SearchView searchview, int i1, String s1, String s2)
    {
        searchview.a(i1, s1, s2);
    }

    static void a(SearchView searchview, CharSequence charsequence)
    {
        searchview.c(charsequence);
    }

    static void a(SearchView searchview, boolean flag)
    {
        searchview.setImeVisibility(flag);
    }

    private void a(boolean flag)
    {
        boolean flag2 = true;
        byte byte0 = 8;
        z = flag;
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
        if (!TextUtils.isEmpty(d.getText()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        h.setVisibility(i1);
        b(flag1);
        obj = e;
        if (flag)
        {
            i1 = 8;
        } else
        {
            i1 = 0;
        }
        ((View) (obj)).setVisibility(i1);
        obj = m;
        if (y)
        {
            i1 = byte0;
        } else
        {
            i1 = 0;
        }
        ((ImageView) (obj)).setVisibility(i1);
        k();
        if (!flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        c(flag);
        i();
    }

    private boolean a(int i1)
    {
        if (w == null || !w.a(i1))
        {
            e(i1);
            return true;
        } else
        {
            return false;
        }
    }

    private boolean a(int i1, int j1, String s1)
    {
        boolean flag = false;
        if (w == null || !w.b(i1))
        {
            b(i1, 0, null);
            setImeVisibility(false);
            q();
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
        return searchview.a(i1);
    }

    static boolean a(SearchView searchview, int i1, int j1, String s1)
    {
        return searchview.a(i1, j1, s1);
    }

    static boolean a(SearchView searchview, View view, int i1, KeyEvent keyevent)
    {
        return searchview.a(view, i1, keyevent);
    }

    private boolean a(View view, int i1, KeyEvent keyevent)
    {
        if (L != null && A != null && keyevent.getAction() == 0 && KeyEventCompat.hasNoModifiers(keyevent))
        {
            if (i1 == 66 || i1 == 84 || i1 == 61)
            {
                return a(d.getListSelection(), 0, ((String) (null)));
            }
            if (i1 == 21 || i1 == 22)
            {
                if (i1 == 21)
                {
                    i1 = 0;
                } else
                {
                    i1 = d.length();
                }
                d.setSelection(i1);
                d.setListSelection(0);
                d.clearListSelection();
                a.a(d, true);
                return true;
            }
            if (i1 == 19 && d.getListSelection() == 0)
            {
                return false;
            }
        }
        return false;
    }

    private Intent b(Intent intent, SearchableInfo searchableinfo)
    {
        Object obj2 = null;
        ComponentName componentname = searchableinfo.getSearchActivity();
        Object obj = new Intent("android.intent.action.SEARCH");
        ((Intent) (obj)).setComponent(componentname);
        PendingIntent pendingintent = PendingIntent.getActivity(getContext(), 0, ((Intent) (obj)), 0x40000000);
        Bundle bundle = new Bundle();
        if (M != null)
        {
            bundle.putParcelable("app_data", M);
        }
        Intent intent1 = new Intent(intent);
        intent = "free_form";
        Object obj1;
        int i1;
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
                i1 = searchableinfo.getVoiceMaxResults();
            } else
            {
                i1 = 1;
            }
        } else
        {
            obj1 = null;
            obj = null;
            intent = "free_form";
            i1 = 1;
        }
        intent1.putExtra("android.speech.extra.LANGUAGE_MODEL", intent);
        intent1.putExtra("android.speech.extra.PROMPT", ((String) (obj)));
        intent1.putExtra("android.speech.extra.LANGUAGE", ((String) (obj1)));
        intent1.putExtra("android.speech.extra.MAX_RESULTS", i1);
        if (componentname == null)
        {
            intent = obj2;
        } else
        {
            intent = componentname.flattenToShortString();
        }
        intent1.putExtra("calling_package", intent);
        intent1.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", pendingintent);
        intent1.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent1;
    }

    static CursorAdapter b(SearchView searchview)
    {
        return searchview.A;
    }

    private CharSequence b(CharSequence charsequence)
    {
        if (!y || n == null)
        {
            return charsequence;
        } else
        {
            int i1 = (int)((double)d.getTextSize() * 1.25D);
            n.setBounds(0, 0, i1, i1);
            SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder("   ");
            spannablestringbuilder.setSpan(new ImageSpan(n), 1, 2, 33);
            spannablestringbuilder.append(charsequence);
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
            if (!B)
            {
                break label0;
            }
            byte0 = byte1;
            if (!h())
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
                if (G)
                {
                    break label0;
                }
            }
            byte0 = 0;
        }
        i.setVisibility(byte0);
    }

    private boolean b(int i1, int j1, String s1)
    {
        Cursor cursor = A.getCursor();
        if (cursor != null && cursor.moveToPosition(i1))
        {
            a(a(cursor, j1, s1));
            return true;
        } else
        {
            return false;
        }
    }

    static android.view.View.OnFocusChangeListener c(SearchView searchview)
    {
        return searchview.v;
    }

    private void c(CharSequence charsequence)
    {
        boolean flag1 = true;
        android.text.Editable editable = d.getText();
        I = editable;
        boolean flag;
        if (!TextUtils.isEmpty(editable))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b(flag);
        if (!flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        c(flag);
        k();
        i();
        if (t != null && !TextUtils.equals(charsequence, H))
        {
            t.b(charsequence.toString());
        }
        H = charsequence.toString();
    }

    private void c(boolean flag)
    {
        int i1;
        if (G && !c() && flag)
        {
            i1 = 0;
            i.setVisibility(8);
        } else
        {
            i1 = 8;
        }
        k.setVisibility(i1);
    }

    static void d(SearchView searchview)
    {
        searchview.u();
    }

    static ImageView e(SearchView searchview)
    {
        return searchview.h;
    }

    private void e()
    {
        l.addOnLayoutChangeListener(new av(this));
    }

    private void e(int i1)
    {
        android.text.Editable editable = d.getText();
        Object obj = A.getCursor();
        if (obj == null)
        {
            return;
        }
        if (((Cursor) (obj)).moveToPosition(i1))
        {
            obj = A.convertToString(((Cursor) (obj)));
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

    private void f()
    {
        l.getViewTreeObserver().addOnGlobalLayoutListener(new aw(this));
    }

    static void f(SearchView searchview)
    {
        searchview.s();
    }

    static ImageView g(SearchView searchview)
    {
        return searchview.j;
    }

    private boolean g()
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (L == null) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (!L.getVoiceSearchEnabled()) goto _L2; else goto _L3
_L3:
        Intent intent = null;
        if (!L.getVoiceSearchLaunchWebSearch()) goto _L5; else goto _L4
_L4:
        intent = q;
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
        if (L.getVoiceSearchLaunchRecognizer())
        {
            intent = r;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    private int getPreferredWidth()
    {
        return getContext().getResources().getDimensionPixelSize(e.abc_search_view_preferred_width);
    }

    static void h(SearchView searchview)
    {
        searchview.r();
    }

    private boolean h()
    {
        return (B || G) && !c();
    }

    static ImageView i(SearchView searchview)
    {
        return searchview.i;
    }

    private void i()
    {
        byte byte0;
label0:
        {
            byte byte1 = 8;
            byte0 = byte1;
            if (!h())
            {
                break label0;
            }
            if (i.getVisibility() != 0)
            {
                byte0 = byte1;
                if (k.getVisibility() != 0)
                {
                    break label0;
                }
            }
            byte0 = 0;
        }
        g.setVisibility(byte0);
    }

    static void j(SearchView searchview)
    {
        searchview.p();
    }

    static ImageView k(SearchView searchview)
    {
        return searchview.k;
    }

    private void k()
    {
        boolean flag2 = true;
        boolean flag1 = false;
        ImageView imageview;
        Drawable drawable;
        boolean flag;
        int i1;
        if (!TextUtils.isEmpty(d.getText()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i1 = ((flag2) ? 1 : 0);
        if (!flag)
        {
            if (y && !J)
            {
                i1 = ((flag2) ? 1 : 0);
            } else
            {
                i1 = 0;
            }
        }
        imageview = j;
        if (i1 != 0)
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        imageview.setVisibility(i1);
        drawable = j.getDrawable();
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

    private void l()
    {
        post(P);
    }

    static void l(SearchView searchview)
    {
        searchview.t();
    }

    static SearchAutoComplete m(SearchView searchview)
    {
        return searchview.d;
    }

    private void m()
    {
        int ai[];
        Drawable drawable;
        if (d.hasFocus())
        {
            ai = FOCUSED_STATE_SET;
        } else
        {
            ai = EMPTY_STATE_SET;
        }
        drawable = f.getBackground();
        if (drawable != null)
        {
            drawable.setState(ai);
        }
        drawable = g.getBackground();
        if (drawable != null)
        {
            drawable.setState(ai);
        }
        invalidate();
    }

    private void n()
    {
        CharSequence charsequence = getQueryHint();
        SearchAutoComplete searchautocomplete = d;
        Object obj = charsequence;
        if (charsequence == null)
        {
            obj = "";
        }
        searchautocomplete.setHint(b(((CharSequence) (obj))));
    }

    static void n(SearchView searchview)
    {
        searchview.v();
    }

    static SearchableInfo o(SearchView searchview)
    {
        return searchview.L;
    }

    private void o()
    {
        boolean flag = true;
        d.setThreshold(L.getSuggestThreshold());
        d.setImeOptions(L.getImeOptions());
        int j1 = L.getInputType();
        int i1 = j1;
        if ((j1 & 0xf) == 1)
        {
            j1 &= 0xfffeffff;
            i1 = j1;
            if (L.getSuggestAuthority() != null)
            {
                i1 = j1 | 0x10000 | 0x80000;
            }
        }
        d.setInputType(i1);
        if (A != null)
        {
            A.changeCursor(null);
        }
        if (L.getSuggestAuthority() != null)
        {
            A = new be(getContext(), this, L, R);
            d.setAdapter(A);
            be be1 = (be)A;
            byte byte0 = flag;
            if (D)
            {
                byte0 = 2;
            }
            be1.a(byte0);
        }
    }

    private void p()
    {
        android.text.Editable editable = d.getText();
        if (editable != null && TextUtils.getTrimmedLength(editable) > 0 && (t == null || !t.a(editable.toString())))
        {
            if (L != null)
            {
                a(0, ((String) (null)), editable.toString());
            }
            setImeVisibility(false);
            q();
        }
    }

    private void q()
    {
        d.dismissDropDown();
    }

    private void r()
    {
        if (TextUtils.isEmpty(d.getText()))
        {
            if (y && (u == null || !u.a()))
            {
                clearFocus();
                a(true);
            }
            return;
        } else
        {
            d.setText("");
            d.requestFocus();
            setImeVisibility(true);
            return;
        }
    }

    private void s()
    {
        a(false);
        d.requestFocus();
        setImeVisibility(true);
        if (x != null)
        {
            x.onClick(this);
        }
    }

    private void setImeVisibility(boolean flag)
    {
        if (flag)
        {
            post(O);
        } else
        {
            removeCallbacks(O);
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
        d.setText(charsequence);
        SearchAutoComplete searchautocomplete = d;
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

    private void t()
    {
        if (L != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        obj = L;
        try
        {
            if (((SearchableInfo) (obj)).getVoiceSearchLaunchWebSearch())
            {
                obj = a(q, ((SearchableInfo) (obj)));
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
        obj = b(r, ((SearchableInfo) (obj)));
        getContext().startActivity(((Intent) (obj)));
        return;
    }

    private void u()
    {
        if (l.getWidth() > 1)
        {
            Resources resources = getContext().getResources();
            int k1 = f.getPaddingLeft();
            Rect rect = new Rect();
            boolean flag = bl.a(this);
            int i1;
            int j1;
            int l1;
            int i2;
            if (y)
            {
                i1 = resources.getDimensionPixelSize(e.abc_dropdownitem_icon_width);
                i1 = resources.getDimensionPixelSize(e.abc_dropdownitem_text_padding_left) + i1;
            } else
            {
                i1 = 0;
            }
            d.getDropDownBackground().getPadding(rect);
            if (flag)
            {
                j1 = -rect.left;
            } else
            {
                j1 = k1 - (rect.left + i1);
            }
            d.setDropDownHorizontalOffset(j1);
            j1 = l.getWidth();
            l1 = rect.left;
            i2 = rect.right;
            d.setDropDownWidth((i1 + (j1 + l1 + i2)) - k1);
        }
    }

    private void v()
    {
        a.a(d);
        a.b(d);
    }

    public void a()
    {
        if (J)
        {
            return;
        } else
        {
            J = true;
            K = d.getImeOptions();
            d.setImeOptions(K | 0x2000000);
            d.setText("");
            setIconified(false);
            return;
        }
    }

    void a(CharSequence charsequence)
    {
        setQuery(charsequence);
    }

    public void a(CharSequence charsequence, boolean flag)
    {
        d.setText(charsequence);
        if (charsequence != null)
        {
            d.setSelection(d.length());
            I = charsequence;
        }
        if (flag && !TextUtils.isEmpty(charsequence))
        {
            p();
        }
    }

    public void b()
    {
        a("", false);
        clearFocus();
        a(true);
        d.setImeOptions(K);
        J = false;
    }

    public boolean c()
    {
        return z;
    }

    public void clearFocus()
    {
        E = true;
        setImeVisibility(false);
        super.clearFocus();
        d.clearFocus();
        E = false;
    }

    void d()
    {
        a(c());
        l();
        if (d.hasFocus())
        {
            v();
        }
    }

    public int getImeOptions()
    {
        return d.getImeOptions();
    }

    public int getInputType()
    {
        return d.getInputType();
    }

    public int getMaxWidth()
    {
        return F;
    }

    public CharSequence getQuery()
    {
        return d.getText();
    }

    public CharSequence getQueryHint()
    {
        if (C != null)
        {
            return C;
        }
        if (c && L != null && L.getHintId() != 0)
        {
            return getContext().getText(L.getHintId());
        } else
        {
            return s;
        }
    }

    int getSuggestionCommitIconResId()
    {
        return p;
    }

    int getSuggestionRowLayout()
    {
        return o;
    }

    public CursorAdapter getSuggestionsAdapter()
    {
        return A;
    }

    protected void onDetachedFromWindow()
    {
        removeCallbacks(P);
        post(Q);
        super.onDetachedFromWindow();
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
        int l1;
        if (c())
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
        if (F > 0)
        {
            i1 = Math.min(F, k1);
        } else
        {
            i1 = Math.min(getPreferredWidth(), k1);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = k1;
        if (F > 0)
        {
            i1 = Math.min(F, k1);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (F > 0)
        {
            i1 = F;
        } else
        {
            i1 = getPreferredWidth();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        l();
    }

    public boolean requestFocus(int i1, Rect rect)
    {
        while (E || !isFocusable()) 
        {
            return false;
        }
        if (!c())
        {
            boolean flag = d.requestFocus(i1, rect);
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
        M = bundle;
    }

    public void setIconified(boolean flag)
    {
        if (flag)
        {
            r();
            return;
        } else
        {
            s();
            return;
        }
    }

    public void setIconifiedByDefault(boolean flag)
    {
        if (y == flag)
        {
            return;
        } else
        {
            y = flag;
            a(flag);
            n();
            return;
        }
    }

    public void setImeOptions(int i1)
    {
        d.setImeOptions(i1);
    }

    public void setInputType(int i1)
    {
        d.setInputType(i1);
    }

    public void setMaxWidth(int i1)
    {
        F = i1;
        requestLayout();
    }

    public void setOnCloseListener(bb bb1)
    {
        u = bb1;
    }

    public void setOnQueryTextFocusChangeListener(android.view.View.OnFocusChangeListener onfocuschangelistener)
    {
        v = onfocuschangelistener;
    }

    public void setOnQueryTextListener(bc bc1)
    {
        t = bc1;
    }

    public void setOnSearchClickListener(android.view.View.OnClickListener onclicklistener)
    {
        x = onclicklistener;
    }

    public void setOnSuggestionListener(android.support.v7.widget.bd bd1)
    {
        w = bd1;
    }

    public void setQueryHint(CharSequence charsequence)
    {
        C = charsequence;
        n();
    }

    public void setQueryRefinementEnabled(boolean flag)
    {
        D = flag;
        if (A instanceof be)
        {
            be be1 = (be)A;
            byte byte0;
            if (flag)
            {
                byte0 = 2;
            } else
            {
                byte0 = 1;
            }
            be1.a(byte0);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableinfo)
    {
        L = searchableinfo;
        if (L != null)
        {
            if (c)
            {
                o();
            }
            n();
        }
        boolean flag;
        if (c && g())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        G = flag;
        if (G)
        {
            d.setPrivateImeOptions("nm");
        }
        a(c());
    }

    public void setSubmitButtonEnabled(boolean flag)
    {
        B = flag;
        a(c());
    }

    public void setSuggestionsAdapter(CursorAdapter cursoradapter)
    {
        A = cursoradapter;
        d.setAdapter(A);
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
        c = flag;
    }

    private class SearchAutoComplete extends p
    {

        private int a;
        private SearchView b;

        private boolean a()
        {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        static boolean a(SearchAutoComplete searchautocomplete)
        {
            return searchautocomplete.a();
        }

        public boolean enoughToFilter()
        {
            return a <= 0 || super.enoughToFilter();
        }

        protected void onFocusChanged(boolean flag, int i1, Rect rect)
        {
            super.onFocusChanged(flag, i1, rect);
            b.d();
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

        void setSearchView(SearchView searchview)
        {
            b = searchview;
        }

        public void setThreshold(int i1)
        {
            super.setThreshold(i1);
            a = i1;
        }

        public SearchAutoComplete(Context context)
        {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeset)
        {
            this(context, attributeset, b.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeset, int i1)
        {
            super(context, attributeset, i1);
            a = getThreshold();
        }
    }

}
