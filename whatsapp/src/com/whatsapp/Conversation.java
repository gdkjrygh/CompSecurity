// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.WallpaperManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.StaleDataException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.AsyncPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Parcelable;
import android.os.PowerManager;
import android.telephony.PhoneNumberUtils;
import android.text.ClipboardManager;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.format.DateUtils;
import android.text.method.TextKeyListener;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.SubMenu;
import com.whatsapp.camera.CameraActivity;
import com.whatsapp.contact.ContactProvider;
import com.whatsapp.gallerypicker.ImagePreview;
import com.whatsapp.notification.AndroidWear;
import com.whatsapp.notification.a1;
import com.whatsapp.notification.l;
import com.whatsapp.notification.p;
import com.whatsapp.preference.WaFontListPreference;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.bg;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.WhatsAppLibLoader;
import com.whatsapp.util.a5;
import com.whatsapp.util.aj;
import com.whatsapp.util.bz;
import com.whatsapp.util.c;
import com.whatsapp.util.c1;
import com.whatsapp.util.m;
import com.whatsapp.util.x;
import com.whatsapp.util.y;
import com.whatsapp.wallpaper.CropImage;
import com.whatsapp.wallpaper.WallPaperView;
import com.whatsapp.wallpaper.d;
import de.greenrobot.event.g;
import g;
import j;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import l;
import o;

// Referenced classes of package com.whatsapp:
//            DialogToastListActivity, wd, es, asa, 
//            App, uz, ao, afl, 
//            ao2, auj, oi, yo, 
//            tp, afj, zs, f5, 
//            add, qg, lw, s, 
//            aoz, je, MediaData, ContactPicker, 
//            a9o, cq, og, ConversationRowDivider, 
//            ConversationRowText, ConversationRowVoiceNote, ConversationRowAudio, ConversationRowImage, 
//            ConversationRowVideo, ConversationRowLocation, ConversationRowContact, ConversationRowCall, 
//            dx, hf, ConversationContentLayout, xa, 
//            _k, asw, sh, m7, 
//            iz, lc, a3z, p5, 
//            ConversationTextEntry, ui, MessageDetailsActivity, k, 
//            SmsDefaultAppWarning, ak8, u5, Voip, 
//            w5, VideoPreviewActivity, k8, au2, 
//            rb, mk, tz, a1g, 
//            abl, au3, aso, akr, 
//            a3m, a9n, at6, RecordAudio, 
//            ViewSharedContactActivity, qk, Main, aks, 
//            a9y, yg, mq, pj, 
//            gu, a8w, r8, ob, 
//            el, as8, hx, akc, 
//            ali, a_z, v5, ms, 
//            nd, y9, b3, x4, 
//            eq, ad4, Conversations, a88, 
//            w1, ib, m4, x, 
//            all, w_, al6, ml, 
//            cy, vm, is, j9, 
//            ca, m6, a4, a3l, 
//            o8, a1y, auw, p, 
//            rz, abm, pl, zj, 
//            a1l, ContactInfo, ListChatInfo, GroupChatInfo, 
//            au0, w, eh, MediaGallery, 
//            ChangeNumber, a2, lj, a_w, 
//            jq, ao7, MediaView, za, 
//            as, adk, r3, ConversationRow

public class Conversation extends DialogToastListActivity
    implements wd, es
{

    static boolean a0;
    public static Display aC;
    public static boolean aJ;
    public static HashMap aR;
    private static boolean aS;
    private static AtomicReference ab;
    public static boolean ae;
    protected static a ar;
    public static boolean au;
    static ArrayList av;
    private static final String cb[];
    public static String o;
    static HashMap r;
    public String A;
    private boolean B;
    private View C;
    za D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private TextView I;
    private ImageButton J;
    private String K;
    private WallPaperView L;
    private int M;
    boolean N;
    private TextView O;
    private boolean P;
    private ConversationTextEntry Q;
    private TextView R;
    private ImageButton S;
    private String T;
    public s U;
    private Cursor V;
    private boolean W;
    private ActionMode X;
    private boolean Y;
    public HashMap Z;
    private boolean a1;
    final android.widget.TextView.OnEditorActionListener a2 = new oi(this);
    private int a3;
    private as a4;
    final android.widget.AbsListView.OnScrollListener a5 = new tp(this);
    private final adk a6 = new add(this);
    private View a7;
    private ImageView a8;
    private HashMap a9;
    private a1g aA;
    private final r3 aB = new uz(this);
    public og aD;
    private boolean aE;
    String aF;
    private ArrayList aG;
    private boolean aH;
    private HashSet aI;
    public ListView aK;
    private Runnable aL;
    private MenuItem aM;
    private Handler aN;
    private _k aO;
    private final TextWatcher aP = new afj(this);
    com.actionbarsherlock.app.ActionBar.OnMenuVisibilityListener aQ;
    private ArrayList aT;
    private Runnable aU;
    boolean aV;
    private final DataSetObserver aW = new f5(this);
    private View aX;
    private TextView aY;
    private String aZ;
    private boolean a_;
    private MenuItem aa;
    private cq ac;
    private ActionMode ad;
    private boolean af;
    boolean ag;
    private boolean ah;
    private ConversationContentLayout ai;
    private boolean aj;
    private rb ak;
    private boolean al;
    public boolean am;
    private Boolean an;
    private int ao;
    final android.view.View.OnClickListener ap = new zs(this);
    private com.actionbarsherlock.view.ActionMode.Callback aq;
    private ak8 as;
    private View at;
    private View aw;
    private boolean ax;
    boolean ay;
    private String az;
    private ViewGroup ba;
    private String bb;
    private com.actionbarsherlock.view.ActionMode.Callback bc;
    private int bd;
    private Handler i;
    private MenuItem j;
    private boolean k;
    private int l;
    private int m;
    private ImageButton n;
    private ArrayList p;
    private ali q;
    private View s;
    private Handler t;
    private Handler u;
    private View v;
    final InputMethodManager w;
    private int x;
    private ImageButton y;
    private WallpaperManager z;

    public Conversation()
    {
        w = (InputMethodManager)App.au.getSystemService(cb[191]);
        p = new ArrayList();
        a9 = null;
        aT = null;
        aI = null;
        H = false;
        al = false;
        B = true;
        F = false;
        af = false;
        l = 0;
        bd = 0;
        aG = new ArrayList();
        M = 0;
        a4 = new ao(this);
        a1 = false;
        aj = true;
        W = false;
        bb = null;
        ah = true;
        am = true;
        i = new afl(this);
        aN = new ao2(this);
        aU = new auj(this);
        N = false;
        u = new Handler();
        aL = new yo(this);
        aE = false;
        an = null;
        aF = null;
        aQ = new qg(this);
        D = new lw(this);
        E = false;
        a3 = 0;
        K = null;
    }

    static void A(Conversation conversation)
    {
        conversation.E();
    }

    private boolean A()
    {
        Object obj = U.getCursor();
        if (obj != null)
        {
            boolean flag;
            try
            {
                flag = ((Cursor) (obj)).moveToFirst();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (flag)
            {
                do
                {
                    c4 c4_1 = App.ah.a(((Cursor) (obj)), A);
                    if (c4_1.y.b)
                    {
                        int i1;
                        try
                        {
                            i1 = c4_1.M;
                        }
                        // Misplaced declaration of an exception variable
                        catch (Object obj)
                        {
                            throw obj;
                        }
                        if (i1 == 6)
                        {
                            continue;
                        }
                    }
                    return false;
                } while (((Cursor) (obj)).moveToNext());
            }
        }
        return true;
    }

    static ImageButton B(Conversation conversation)
    {
        return conversation.J;
    }

    public static asa B()
    {
        return (asa)ab.get();
    }

    private void C()
    {
        aK.post(new je(this));
    }

    static void C(Conversation conversation)
    {
        conversation.t();
    }

    static String D(Conversation conversation)
    {
        return conversation.bb;
    }

    private void D()
    {
        int i1;
        i1 = App.am;
        HashMap hashmap;
        try
        {
            hashmap = Z;
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
        if (hashmap == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        if (!Z.isEmpty())
        {
            break MISSING_BLOCK_LABEL_39;
        }
        Log.e(cb[4]);
        return;
        Iterator iterator;
        boolean flag;
        iterator = Z.values().iterator();
        flag = true;
_L4:
        c4 c4_1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        c4_1 = (c4)iterator.next();
        if (!(c4_1.B instanceof MediaData)) goto _L2; else goto _L1
_L1:
        Object obj = (MediaData)c4_1.B;
_L5:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        boolean flag1 = ((MediaData) (obj)).transferred;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        ActivityNotFoundException activitynotfoundexception2;
        byte byte0;
        try
        {
            byte0 = c4_1.w;
        }
        catch (ActivityNotFoundException activitynotfoundexception3)
        {
            try
            {
                throw activitynotfoundexception3;
            }
            catch (ActivityNotFoundException activitynotfoundexception4)
            {
                throw activitynotfoundexception4;
            }
        }
        if (byte0 == 4)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        if (c4_1.w == 5)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        flag1 = c4_1.y.b;
        if (flag1)
        {
            Log.w(cb[5]);
            App.b(this, 0x7f0e024d, 0);
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_271;
            }
            flag = false;
        }
        try
        {
            byte0 = c4_1.w;
        }
        catch (ActivityNotFoundException activitynotfoundexception5)
        {
            throw activitynotfoundexception5;
        }
        if (byte0 != 8)
        {
            continue; /* Loop/switch isn't completed */
        }
        Log.w(cb[7]);
        App.b(this, 0x7f0e024c, 0);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_271;
        }
        flag = false;
        if (i1 == 0) goto _L4; else goto _L3
_L3:
        if (flag)
        {
            obj = new Intent(this, com/whatsapp/ContactPicker);
            ((Intent) (obj)).putExtra(cb[6], true);
            startActivityForResult(((Intent) (obj)), 2);
            a0 = false;
            return;
        } else
        {
            return;
        }
        obj;
        throw obj;
_L2:
        obj = null;
          goto _L5
        activitynotfoundexception2;
        throw activitynotfoundexception2;
        flag = false;
          goto _L3
    }

    static View E(Conversation conversation)
    {
        return conversation.C;
    }

    private void E()
    {
        a_ = false;
        showDialog(107);
        com.whatsapp.util.x.a(new a9o(this));
    }

    private void F()
    {
        try
        {
            if (ac.isShowing())
            {
                ac.dismiss();
            }
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
    }

    static void F(Conversation conversation)
    {
        conversation.z();
    }

    static HashSet G(Conversation conversation)
    {
        return conversation.aI;
    }

    private boolean G()
    {
        return getSharedPreferences(cb[200], 0).getBoolean(cb[201], false);
    }

    static ActionMode H(Conversation conversation)
    {
        return conversation.ad;
    }

    private void H()
    {
        Button button = (Button)a7.findViewById(0x7f0b0154);
        int i1;
        boolean flag;
        try
        {
            flag = App.C(aD.a);
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        if (flag)
        {
            i1 = 0x7f0e0453;
        } else
        {
            i1 = 0x7f0e005b;
        }
        button.setText(i1);
    }

    static boolean I(Conversation conversation)
    {
        return conversation.a_;
    }

    private static void J(Conversation conversation)
    {
        asa asa1 = (asa)ab.get();
        try
        {
            if (com.whatsapp.asa.a(asa1) == conversation)
            {
                ab.compareAndSet(asa1, new asa(conversation, false));
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Conversation conversation)
        {
            throw conversation;
        }
    }

    static ConversationContentLayout K(Conversation conversation)
    {
        return conversation.ai;
    }

    static Boolean L(Conversation conversation)
    {
        return conversation.an;
    }

    static void M(Conversation conversation)
    {
        conversation.x();
    }

    static Handler N(Conversation conversation)
    {
        return conversation.u;
    }

    static TextView O(Conversation conversation)
    {
        return conversation.aY;
    }

    static cq P(Conversation conversation)
    {
        return conversation.ac;
    }

    static View Q(Conversation conversation)
    {
        return conversation.s;
    }

    static void R(Conversation conversation)
    {
        conversation.p();
    }

    static a1g S(Conversation conversation)
    {
        return conversation.aA;
    }

    static void T(Conversation conversation)
    {
        conversation.k();
    }

    static boolean U(Conversation conversation)
    {
        return conversation.F;
    }

    static boolean V(Conversation conversation)
    {
        return conversation.G;
    }

    static r3 W(Conversation conversation)
    {
        return conversation.aB;
    }

    static int X(Conversation conversation)
    {
        return conversation.M;
    }

    static boolean Y(Conversation conversation)
    {
        return conversation.P;
    }

    static void Z(Conversation conversation)
    {
        conversation.n();
    }

    static int a(Conversation conversation, int i1)
    {
        conversation.bd = i1;
        return i1;
    }

    private static int a(c4 c4_1)
    {
        int i1 = c4_1.w;
        i1;
        JVM INSTR tableswitch 0 8: default 56
    //                   0 91
    //                   1 198
    //                   2 146
    //                   3 218
    //                   4 258
    //                   5 238
    //                   6 56
    //                   7 56
    //                   8 278;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L1 _L1 _L8
_L1:
        i1 = c4_1.M;
        if (i1 != -1) goto _L10; else goto _L9
_L9:
        i1 = c4_1.w;
        if (i1 != -1) goto _L10; else goto _L11
_L11:
        boolean flag;
        try
        {
            flag = c4_1.y.b;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        if (!flag) goto _L13; else goto _L12
_L12:
        return 6;
_L2:
        i1 = c4_1.M;
        if (i1 != 6) goto _L15; else goto _L14
_L14:
        try
        {
            flag = c4_1.y.b;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        if (flag) goto _L12; else goto _L16
_L16:
        return 15;
        c4_1;
        try
        {
            throw c4_1;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1) { }
        throw c4_1;
_L15:
        boolean flag1;
        try
        {
            flag1 = c4_1.y.b;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        return !flag1 ? 9 : 0;
_L4:
        try
        {
            i1 = c4_1.n;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            try
            {
                throw c4_1;
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1)
            {
                throw c4_1;
            }
        }
        if (i1 != 1) goto _L18; else goto _L17
_L17:
        return !c4_1.y.b ? 16 : 7;
_L18:
        boolean flag2;
        try
        {
            flag2 = c4_1.y.b;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        return !flag2 ? 11 : 2;
_L3:
        boolean flag3;
        try
        {
            flag3 = c4_1.y.b;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        return !flag3 ? 10 : 1;
_L5:
        boolean flag4;
        try
        {
            flag4 = c4_1.y.b;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        return !flag4 ? 12 : 3;
_L7:
        boolean flag5;
        try
        {
            flag5 = c4_1.y.b;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        return !flag5 ? 13 : 4;
_L6:
        boolean flag6;
        try
        {
            flag6 = c4_1.y.b;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        return !flag6 ? 14 : 5;
_L8:
        boolean flag7;
        try
        {
            flag7 = c4_1.y.b;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        return !flag7 ? 17 : 8;
        c4_1;
        try
        {
            throw c4_1;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1) { }
        throw c4_1;
_L13:
        return 15;
_L10:
        return -1;
    }

    public static Intent a(Context context, og og1)
    {
        return (new Intent(null, og1.r(), context, com/whatsapp/Conversation)).addFlags(0x14000000);
    }

    public static Intent a(og og1)
    {
        return (new Intent(App.au.getApplicationContext(), com/whatsapp/Conversation)).putExtra(cb[98], og1.a).addFlags(0x14000000);
    }

    static View a(Conversation conversation, View view)
    {
        conversation.C = view;
        return view;
    }

    static ActionMode a(Conversation conversation, ActionMode actionmode)
    {
        conversation.ad = actionmode;
        return actionmode;
    }

    public static ConversationRow a(Context context, c4 c4_1)
    {
        int i1;
        try
        {
            i1 = c4_1.w;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        i1;
        JVM INSTR tableswitch 0 8: default 56
    //                   0 86
    //                   1 156
    //                   2 123
    //                   3 166
    //                   4 186
    //                   5 176
    //                   6 56
    //                   7 56
    //                   8 196;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L1 _L1 _L8
_L1:
        try
        {
            i1 = c4_1.M;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        if (i1 != -1) goto _L10; else goto _L9
_L9:
        if (c4_1.w != -1) goto _L10; else goto _L11
_L11:
        context = new ConversationRowDivider(context, c4_1);
        return context;
_L2:
        if (c4_1.M != 6) goto _L13; else goto _L12
_L12:
        context = new ConversationRowDivider(context, c4_1);
        return context;
_L13:
        return new ConversationRowText(context, c4_1);
_L4:
        if (c4_1.n != 1) goto _L15; else goto _L14
_L14:
        context = new ConversationRowVoiceNote(context, c4_1);
        return context;
        context;
        throw context;
_L15:
        return new ConversationRowAudio(context, c4_1);
_L3:
        return new ConversationRowImage(context, c4_1);
_L5:
        return new ConversationRowVideo(context, c4_1);
_L7:
        return new ConversationRowLocation(context, c4_1);
_L6:
        return new ConversationRowContact(context, c4_1);
_L8:
        return new ConversationRowCall(context, c4_1);
_L10:
        return null;
    }

    static _k a(Conversation conversation, _k _pk)
    {
        conversation.aO = _pk;
        return _pk;
    }

    static Boolean a(Conversation conversation, Boolean boolean1)
    {
        conversation.an = boolean1;
        return boolean1;
    }

    static void a(Activity activity, dx dx1, og og1, boolean flag)
    {
        dx1.a(0x7f0e0354, 0x7f0e0353);
        com.whatsapp.util.x.a(new hf(og1, flag, new Handler(), dx1, activity));
    }

    private void a(Cursor cursor)
    {
        boolean flag;
        if (cursor != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Log.b(flag);
        V = cursor;
    }

    private void a(Drawable drawable)
    {
        if (drawable == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        L.setDrawable(drawable);
        ai.setBackgroundResource(0);
        aX.setVisibility(0);
        at.setBackgroundColor(0xc0f4f4f4);
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        L.a();
        ai.setBackgroundResource(0x7f09001a);
        aX.setVisibility(0);
        at.setBackgroundColor(-1);
        return;
        drawable;
        throw drawable;
    }

    private void a(Uri uri)
    {
label0:
        {
            Object obj;
            Intent intent;
            int i1;
label1:
            {
                i1 = App.am;
                if (uri == null)
                {
                    break label0;
                }
                intent = new Intent(this, com/whatsapp/gallerypicker/ImagePreview);
                if (aD.k())
                {
                    obj = getString(0x7f0e01ae, new Object[] {
                        aD.a(this)
                    });
                    if (i1 == 0)
                    {
                        break label1;
                    }
                }
                obj = getString(0x7f0e037d, new Object[] {
                    aD.a(this)
                });
            }
            intent.putExtra(cb[147], ((String) (obj)));
            intent.putExtra(cb[149], 0);
            obj = new ArrayList();
            try
            {
                ((ArrayList) (obj)).add(uri);
                intent.putExtra(cb[150], ((java.io.Serializable) (obj)));
                startActivityForResult(intent, 22);
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_168;
            }
        }
        Log.e(cb[148]);
        App.b(getBaseContext(), 0x7f0e03d4, 0);
    }

    private void a(Uri uri, int i1, int j1, int k1)
    {
        int l1 = App.am;
        Drawable drawable;
        boolean flag;
        try
        {
            flag = B;
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw uri;
        }
        if (flag)
        {
            if (uri == null)
            {
                drawable = com.whatsapp.wallpaper.d.a(this, true, i1, null, j1, k1);
                if (l1 == 0)
                {
                    break MISSING_BLOCK_LABEL_103;
                }
            }
            drawable = com.whatsapp.wallpaper.d.a(this, false, -1, uri, 0, 0);
            if (l1 == 0)
            {
                break MISSING_BLOCK_LABEL_103;
            }
        }
        if (uri == null)
        {
            try
            {
                com.whatsapp.wallpaper.d.a(this, aD.a, true, i1, null);
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
            if (l1 == 0)
            {
                break MISSING_BLOCK_LABEL_90;
            }
        }
        com.whatsapp.wallpaper.d.a(this, aD.a, false, 0, uri);
        drawable = com.whatsapp.wallpaper.d.a(this, aD.a);
        a(drawable);
        c1.a(this, uri);
        return;
    }

    static void a(Conversation conversation)
    {
        conversation.o();
    }

    static void a(Conversation conversation, Cursor cursor)
    {
        conversation.a(cursor);
    }

    static void a(Conversation conversation, c4 c4_1)
    {
        conversation.e(c4_1);
    }

    static void a(Conversation conversation, String s1)
    {
        conversation.j(s1);
    }

    static void a(Conversation conversation, String s1, boolean flag)
    {
        conversation.a(s1, flag);
    }

    private void a(String s1, int i1)
    {
        String s2 = getString(0x7f0e002d);
        String s3 = getString(0x7f0e002c);
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle(getResources().getString(0x7f0e0090));
        s1 = new xa(this, new int[] {
            12, 13
        }, s1, i1);
        builder.setItems(new String[] {
            s2, s3
        }, s1);
        a(((Dialog) (builder.create())));
    }

    private void a(String s1, boolean flag)
    {
        Intent intent;
        int i1;
        i1 = App.am;
        intent = new Intent(cb[84], android.provider.ContactsContract.Contacts.CONTENT_URI);
        ComponentName componentname;
        intent.putExtra(cb[85], s1);
        intent.setComponent(intent.resolveActivity(getPackageManager()));
        componentname = intent.getComponent();
        if (componentname == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        if (flag)
        {
            try
            {
                startActivityForResult(intent, 11);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_86;
            }
        }
        K = s1;
        startActivityForResult(intent, 10);
        try
        {
            a0 = false;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        Log.w(cb[86]);
        App.J();
        return;
        s1;
        try
        {
            throw s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        throw s1;
    }

    private void a(ArrayList arraylist)
    {
        int i1 = App.am;
        arraylist = arraylist.iterator();
        do
        {
            if (!arraylist.hasNext())
            {
                break;
            }
            Uri uri = (Uri)arraylist.next();
            c1.a(A, uri);
        } while (i1 == 0);
_L2:
        return;
        arraylist;
        String s1;
        Log.e((new StringBuilder()).append(cb[176]).append(arraylist.toString()).toString());
        s1 = arraylist.getMessage();
        if (s1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag = arraylist.getMessage().contains(cb[179]);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            com.whatsapp.App.a(App.au, 0x7f0e015f, 0);
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            throw arraylist;
        }
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        App.b(App.au, 0x7f0e03d4, 0);
        return;
        arraylist;
        try
        {
            throw arraylist;
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist) { }
        throw arraylist;
        arraylist;
        Log.e((new StringBuilder()).append(cb[177]).append(arraylist.toString()).toString());
        com.whatsapp.App.a(App.au, 0x7f0e0159, 0);
        return;
        arraylist;
        Log.e((new StringBuilder()).append(cb[175]).append(arraylist.toString()).toString());
        com.whatsapp.App.a(App.au, 0x7f0e0163, 0);
        return;
        arraylist;
        Log.e((new StringBuilder()).append(cb[178]).append(arraylist.toString()).toString());
        com.whatsapp.App.a(App.au, 0x7f0e02a4, 0);
        return;
    }

    private void a(boolean flag)
    {
        if (!TextUtils.isEmpty(o))
        {
            break MISSING_BLOCK_LABEL_17;
        }
        o = null;
_L1:
        return;
        ActivityNotFoundException activitynotfoundexception;
        activitynotfoundexception;
        throw activitynotfoundexception;
        T = o;
        h();
        int i1 = aK.getFirstVisiblePosition();
        c4 c4_1 = (c4)U.getItem(i1);
        if (c4_1 != null)
        {
            String s1;
            try
            {
                s1 = c4_1.y.a;
            }
            catch (ActivityNotFoundException activitynotfoundexception1)
            {
                throw activitynotfoundexception1;
            }
            if (s1 == null)
            {
                c4_1 = (c4)U.getItem(i1 + 1);
            }
            if (c4_1 != null)
            {
                try
                {
                    if (aO != null)
                    {
                        aO.cancel(true);
                    }
                }
                catch (ActivityNotFoundException activitynotfoundexception2)
                {
                    throw activitynotfoundexception2;
                }
                aO = new _k(this, o, flag, c4_1);
                com.whatsapp.asw.a(aO, new Void[0]);
                return;
            }
        }
          goto _L1
    }

    private boolean a(int i1, String s1, int j1)
    {
        int k1;
        boolean flag;
        flag = true;
        k1 = App.am;
        i1;
        JVM INSTR tableswitch 12 13: default 32
    //                   12 38
    //                   13 85;
           goto _L1 _L2 _L3
_L1:
        flag = false;
_L8:
        return flag;
_L2:
        j1;
        JVM INSTR tableswitch 101 102: default 60
    //                   101 62
    //                   102 73;
           goto _L4 _L5 _L6
_L6:
        break; /* Loop/switch isn't completed */
_L4:
        return true;
_L5:
        try
        {
            a(s1, false);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (k1 == 0) goto _L8; else goto _L7
_L7:
        b(s1, 102);
        return true;
_L3:
        j1;
        JVM INSTR tableswitch 101 102: default 108
    //                   101 110
    //                   102 121;
           goto _L9 _L10 _L11
_L11:
        break; /* Loop/switch isn't completed */
_L9:
        return true;
_L10:
        try
        {
            b(s1, false);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (k1 == 0) goto _L8; else goto _L12
_L12:
        c(s1, 102);
        return true;
    }

    static boolean a(Conversation conversation, int i1, String s1, int j1)
    {
        return conversation.a(i1, s1, j1);
    }

    static boolean a(Conversation conversation, boolean flag)
    {
        conversation.al = flag;
        return flag;
    }

    private static void aa(Conversation conversation)
    {
        ab.set(new asa(conversation, true));
    }

    static ArrayList ab(Conversation conversation)
    {
        return conversation.aG;
    }

    static ImageButton ac(Conversation conversation)
    {
        return conversation.S;
    }

    static int ad(Conversation conversation)
    {
        return conversation.bd;
    }

    static ali ae(Conversation conversation)
    {
        return conversation.q;
    }

    static void af(Conversation conversation)
    {
        conversation.F();
    }

    static void ag(Conversation conversation)
    {
        conversation.w();
    }

    static Runnable ah(Conversation conversation)
    {
        return conversation.aU;
    }

    static String ai(Conversation conversation)
    {
        return conversation.T;
    }

    static boolean aj(Conversation conversation)
    {
        return conversation.k;
    }

    static boolean ak(Conversation conversation)
    {
        return conversation.al;
    }

    static int b(Conversation conversation, int i1)
    {
        conversation.M = i1;
        return i1;
    }

    public static Animation b(boolean flag)
    {
        Object obj;
        AnimationSet animationset = new AnimationSet(true);
        if (flag)
        {
            try
            {
                obj = new AlphaAnimation(0.0F, 1.0F);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        } else
        {
            obj = new AlphaAnimation(1.0F, 0.0F);
        }
        ((Animation) (obj)).setDuration(100L);
        animationset.addAnimation(((Animation) (obj)));
        if (flag)
        {
            float f1;
            try
            {
                flag = App.aR();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (flag)
            {
                f1 = 1.0F;
            } else
            {
                f1 = 0.0F;
            }
            obj = new ScaleAnimation(0.0F, 1.0F, 1.0F, 1.0F, 1, f1, 1, 0.5F);
        } else
        {
            float f2;
            try
            {
                flag = App.aR();
            }
            catch (ActivityNotFoundException activitynotfoundexception)
            {
                throw activitynotfoundexception;
            }
            if (flag)
            {
                f2 = 1.0F;
            } else
            {
                f2 = 0.0F;
            }
            obj = new ScaleAnimation(1.0F, 0.0F, 1.0F, 1.0F, 1, f2, 1, 0.5F);
        }
        ((ScaleAnimation) (obj)).setDuration(100L);
        animationset.addAnimation(((Animation) (obj)));
        animationset.setDuration(100L);
        return animationset;
        obj;
        throw obj;
    }

    static ImageView b(Conversation conversation)
    {
        return conversation.a8;
    }

    static ActionMode b(Conversation conversation, ActionMode actionmode)
    {
        conversation.X = actionmode;
        return actionmode;
    }

    static String b(Conversation conversation, String s1)
    {
        conversation.T = s1;
        return s1;
    }

    static void b(Conversation conversation, c4 c4_1)
    {
        conversation.i(c4_1);
    }

    static void b(Conversation conversation, String s1, boolean flag)
    {
        conversation.b(s1, flag);
    }

    private void b(String s1, int i1)
    {
        Intent intent = new Intent(cb[97], android.provider.ContactsContract.Contacts.CONTENT_URI);
        i1;
        JVM INSTR tableswitch 102 102: default 36
    //                   102 86;
           goto _L1 _L2
_L1:
        try
        {
            intent.setComponent(intent.resolveActivity(getPackageManager()));
            s1 = intent.getComponent();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            try
            {
                throw s1;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        }
        if (s1 == null) goto _L4; else goto _L3
_L3:
        startActivity(intent);
        a0 = false;
        if (App.am == 0) goto _L5; else goto _L4
_L4:
        Log.w(cb[96]);
        App.J();
_L5:
        return;
_L2:
        try
        {
            intent.putExtra(cb[95], s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    private void b(String s1, boolean flag)
    {
        Intent intent = new Intent(cb[1]);
        intent.setType(cb[3]);
        intent.putExtra(cb[2], s1);
        intent.putExtra(cb[0], 2);
        intent.setFlags(0x80000);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        int i1;
        startActivityForResult(intent, 13);
        i1 = App.am;
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        K = s1;
        startActivityForResult(intent, 12);
        try
        {
            a0 = false;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            showDialog(12);
        }
        break MISSING_BLOCK_LABEL_104;
        s1;
        try
        {
            throw s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        throw s1;
    }

    static boolean b(Conversation conversation, boolean flag)
    {
        conversation.H = flag;
        return flag;
    }

    static int c(Conversation conversation, int i1)
    {
        conversation.m = i1;
        return i1;
    }

    private int c(boolean flag)
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        return 100;
_L2:
        int i1;
        try
        {
            if (bd <= 90)
            {
                continue; /* Loop/switch isn't completed */
            }
            Log.e((new StringBuilder()).append(cb[259]).append(bd + 10).toString());
            i1 = bd;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        return i1 + 10;
        if (a3 <= 0) goto _L1; else goto _L3
_L3:
        int j1 = a3;
        return j1;
        ActivityNotFoundException activitynotfoundexception1;
        activitynotfoundexception1;
        throw activitynotfoundexception1;
    }

    static ImageButton c(Conversation conversation)
    {
        return conversation.y;
    }

    static String c(Conversation conversation, String s1)
    {
        conversation.aZ = s1;
        return s1;
    }

    static void c(Conversation conversation, c4 c4_1)
    {
        conversation.k(c4_1);
    }

    private void c(String s1, int i1)
    {
        Intent intent = new Intent(cb[180]);
        try
        {
            intent.setType(cb[182]);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        switch (i1)
        {
        default:
            intent.setFlags(0x80000);
            startActivity(intent);
            a0 = false;
            return;

        case 102: // 'f'
            break;
        }
        intent.putExtra(cb[181], s1);
    }

    static boolean c(Conversation conversation, boolean flag)
    {
        conversation.a1 = flag;
        return flag;
    }

    static TextView d(Conversation conversation)
    {
        return conversation.I;
    }

    static void d(Conversation conversation, c4 c4_1)
    {
        conversation.g(c4_1);
    }

    static void d(Conversation conversation, String s1)
    {
        conversation.g(s1);
    }

    private void d(c4 c4_1)
    {
        aK.post(new sh(this, c4_1));
    }

    private void d(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = getSharedPreferences(cb[169], 0).edit();
        try
        {
            editor.putBoolean(cb[170], flag);
            if (!editor.commit())
            {
                Log.e(cb[171]);
            }
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
    }

    static boolean d(Conversation conversation, boolean flag)
    {
        conversation.ah = flag;
        return flag;
    }

    static void e(Conversation conversation)
    {
        conversation.l();
    }

    static void e(Conversation conversation, c4 c4_1)
    {
        conversation.d(c4_1);
    }

    private void e(c4 c4_1)
    {
        MediaData mediadata = (MediaData)c4_1.B;
        Object obj = mediadata.file;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        int i1;
        boolean flag;
        try
        {
            Log.w(cb[94]);
            obj = getBaseContext();
            flag = com.whatsapp.App.m();
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        if (flag)
        {
            i1 = 0x7f0e019e;
        } else
        {
            i1 = 0x7f0e019f;
        }
        App.b(((Context) (obj)), i1, 0);
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        com.whatsapp.App.a(this, mediadata.file, c4_1.w);
        return;
        c4_1;
        throw c4_1;
        c4_1;
        throw c4_1;
    }

    private boolean e()
    {
        return ac.isShowing();
    }

    static boolean e(Conversation conversation, boolean flag)
    {
        conversation.F = flag;
        return flag;
    }

    private boolean e(boolean flag)
    {
        String s1;
        try
        {
            aF = com.whatsapp.m7.a(this, flag);
            if (aF != null)
            {
                showDialog(116);
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        try
        {
            s1 = aF;
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
        return s1 != null;
    }

    static int f(c4 c4_1)
    {
        return a(c4_1);
    }

    static MenuItem f(Conversation conversation)
    {
        return conversation.aM;
    }

    private void f()
    {
        Drawable drawable = null;
        int j1 = App.am;
        ViewGroup viewgroup = (ViewGroup)com.whatsapp.iz.a(getLayoutInflater(), 0x7f03003c, null, false);
        Object obj;
        CharSequence charsequence;
        Object obj1;
        int i1;
        boolean flag;
        if (R != null)
        {
            obj = R.getText();
        } else
        {
            obj = null;
        }
        if (I != null)
        {
            charsequence = I.getText();
        } else
        {
            charsequence = null;
        }
        if (a8 != null)
        {
            drawable = a8.getDrawable();
        }
        ba = (ViewGroup)viewgroup.findViewById(0x7f0b0153);
        R = (TextView)ba.findViewById(0x7f0b010c);
        I = (TextView)ba.findViewById(0x7f0b010d);
        a8 = (ImageView)viewgroup.findViewById(0x7f0b0151);
        if (App.aR())
        {
            break MISSING_BLOCK_LABEL_188;
        }
        obj1 = (ImageView)viewgroup.findViewById(0x7f0b0005);
        ((ImageView) (obj1)).setImageResource(0x7f020023);
        i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 >= 11)
        {
            try
            {
                if (android.os.Build.VERSION.SDK_INT < 16)
                {
                    ba.setLayoutTransition(null);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        try
        {
            if (android.os.Build.VERSION.SDK_INT >= 17)
            {
                ((android.widget.LinearLayout.LayoutParams)I.getLayoutParams()).bottomMargin = 0;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        ba.setClickable(true);
        flag = k;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        flag = G;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_296;
        }
        try
        {
            obj1 = I;
            flag = k;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (flag)
        {
            i1 = 0x7f0e0437;
        } else
        {
            i1 = 0x7f0e0438;
        }
        try
        {
            ((TextView) (obj1)).setText(getString(i1));
            I.setHorizontalFadingEdgeEnabled(false);
            I.setEllipsize(android.text.TextUtils.TruncateAt.END);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_322;
        }
        I.setHorizontalFadingEdgeEnabled(true);
        I.setEllipsize(android.text.TextUtils.TruncateAt.MARQUEE);
        I.setMarqueeRepeatLimit(1);
        if (obj != null)
        {
            try
            {
                R.setText(((CharSequence) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (drawable != null)
        {
            try
            {
                a8.setImageDrawable(drawable);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        flag = TextUtils.isEmpty(charsequence);
        if (!flag)
        {
            try
            {
                I.setVisibility(0);
                I.setText(charsequence);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (j1 == 0)
            {
                break MISSING_BLOCK_LABEL_387;
            }
        }
        I.setVisibility(8);
        viewgroup.findViewById(0x7f0b014f).setOnClickListener(new lc(this));
        ba.setOnClickListener(new a3z(this));
        getSupportActionBar().setDisplayOptions(16);
        getSupportActionBar().setCustomView(viewgroup);
        return;
        obj;
        throw obj;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
        obj;
        throw obj;
    }

    static void f(Conversation conversation, c4 c4_1)
    {
        conversation.h(c4_1);
    }

    static void f(Conversation conversation, boolean flag)
    {
        conversation.a(flag);
    }

    static int g(Conversation conversation, boolean flag)
    {
        return conversation.c(flag);
    }

    private void g()
    {
        v.setVisibility(0);
        O.setText("");
    }

    static void g(Conversation conversation)
    {
        conversation.C();
    }

    private void g(c4 c4_1)
    {
        int i1 = App.am;
        if (bg.a(c4_1.M, 2) < 0) goto _L2; else goto _L1
_L1:
        App.b(getBaseContext(), 0x7f0e0190, 0);
_L4:
        return;
        c4_1;
        throw c4_1;
_L2:
        MediaData mediadata;
        mediadata = (MediaData)c4_1.B;
        if (mediadata == null)
        {
            break; /* Loop/switch isn't completed */
        }
        p5 p5_1 = mediadata.uploader;
        if (p5_1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        mediadata.uploader.f();
        if (i1 == 0) goto _L4; else goto _L3
_L3:
        try
        {
            Log.e((new StringBuilder()).append(cb[102]).append(c4_1.w).append(cb[104]).append(c4_1.M).append(cb[105]).append(mediadata.transferring).append(cb[107]).append(mediadata.transferred).append(cb[109]).append(c4_1.y).toString());
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        if (i1 == 0) goto _L4; else goto _L5
_L5:
        Log.e((new StringBuilder()).append(cb[106]).append(c4_1.w).append(cb[108]).append(c4_1.M).append(cb[103]).append(c4_1.y).toString());
        return;
        c4_1;
        try
        {
            throw c4_1;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1) { }
        throw c4_1;
    }

    private void g(String s1)
    {
        s1 = (new StringBuilder()).append(cb[183]).append(s1).toString();
        s1 = new Intent(cb[184], Uri.parse(s1));
        try
        {
            startActivity(s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            App.b(this, 0x7f0e0022, 0);
        }
    }

    static View h(Conversation conversation)
    {
        return conversation.aX;
    }

    private void h()
    {
        w.hideSoftInputFromWindow(Q.getWindowToken(), 0);
    }

    private void h(c4 c4_1)
    {
        MediaData mediadata;
        int i1;
        i1 = App.am;
        if (c4_1 == null)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        mediadata = (MediaData)c4_1.B;
        if (mediadata == null)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        ui ui1 = mediadata.downloader;
        if (ui1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        mediadata.downloader.b();
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        try
        {
            Log.e((new StringBuilder()).append(cb[209]).append(c4_1.w).append(cb[205]).append(c4_1.M).append(cb[203]).append(mediadata.transferring).append(cb[204]).append(mediadata.transferred).append(cb[202]).append(c4_1.y).toString());
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        Log.e((new StringBuilder()).append(cb[210]).append(c4_1.w).append(cb[206]).append(c4_1.M).append(cb[207]).append(c4_1.y).toString());
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        Log.e(cb[208]);
        return;
        c4_1;
        try
        {
            throw c4_1;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1) { }
        throw c4_1;
        c4_1;
        throw c4_1;
    }

    public static void h(String s1)
    {
        Conversation conversation;
        conversation = com.whatsapp.asa.a((asa)ab.get());
        if (conversation == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        conversation.bb = s1;
        return;
        s1;
        throw s1;
    }

    static boolean h(Conversation conversation, boolean flag)
    {
        conversation.W = flag;
        return flag;
    }

    static View i(Conversation conversation)
    {
        return conversation.at;
    }

    public static void i()
    {
        Object obj = (asa)ab.get();
        if (!((asa) (obj)).a()) goto _L2; else goto _L1
_L1:
        obj = ((asa) (obj)).b();
_L4:
        if (obj != null)
        {
            Cursor cursor = App.ah.a(((Conversation) (obj)).A, ((Conversation) (obj)).c(false), ((Conversation) (obj)).aB);
            ((Conversation) (obj)).a(cursor);
            ((Conversation) (obj)).U.changeCursor(cursor);
            ((Conversation) (obj)).U.getCursor().requery();
        }
        return;
_L2:
        obj = com.whatsapp.asa.a(((asa) (obj)));
        if (obj != null)
        {
            boolean flag;
            try
            {
                flag = ((Conversation) (obj)).isFinishing();
            }
            catch (ActivityNotFoundException activitynotfoundexception)
            {
                throw activitynotfoundexception;
            }
            if (!flag)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void i(c4 c4_1)
    {
        Intent intent = new Intent(this, com/whatsapp/MessageDetailsActivity);
        intent.putExtra(MessageDetailsActivity.r, c4_1.y.c);
        intent.putExtra(MessageDetailsActivity.k, c4_1.y.a);
        startActivity(intent);
    }

    static boolean i(Conversation conversation, boolean flag)
    {
        conversation.E = flag;
        return flag;
    }

    private boolean i(String s1)
    {
        bz bz1;
        int j1;
        j1 = App.am;
        bz1 = new bz(cb[139]);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        bd = 0;
        A = s1;
        Log.i((new StringBuilder()).append(cb[113]).append(A).toString());
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        Object obj;
        A = getIntent().getStringExtra(cb[114]);
        obj = A;
        Object obj4;
        Object obj5;
        int i1;
        boolean flag;
        if (obj == null)
        {
            try
            {
                A = getIntent().getStringExtra(cb[132]);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        }
        i1 = 1;
        if (A != null)
        {
            break MISSING_BLOCK_LABEL_528;
        }
        obj = getIntent();
        if (((Intent) (obj)).getData() == null)
        {
            break MISSING_BLOCK_LABEL_511;
        }
        obj4 = ((Intent) (obj)).getData().getScheme();
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_511;
        }
        flag = ((Intent) (obj)).getData().getScheme().equals(cb[130]);
        if (!flag)
        {
            boolean flag1;
            try
            {
                flag1 = ((Intent) (obj)).getData().getScheme().equals(cb[143]);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            if (!flag1)
            {
                break MISSING_BLOCK_LABEL_511;
            }
        }
        obj5 = getIntent().getData().toString();
        if (obj5 == null)
        {
            return false;
        }
        break MISSING_BLOCK_LABEL_232;
        s1;
        try
        {
            throw s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        throw s1;
        s1;
        try
        {
            throw s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        throw s1;
label0:
        {
            String as1[] = ((String) (obj5)).split(":");
            if (as1 == null)
            {
                break MISSING_BLOCK_LABEL_492;
            }
            Object obj1;
            boolean flag2;
            try
            {
                i1 = as1.length;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            if (i1 != 2)
            {
                break MISSING_BLOCK_LABEL_492;
            }
            Log.i((new StringBuilder()).append(cb[145]).append(as1[1]).toString());
            obj4 = PhoneNumberUtils.stripSeparators(URLDecoder.decode(as1[1]));
            obj1 = obj4;
            try
            {
                if (((String) (obj4)).length() <= 0)
                {
                    break label0;
                }
                flag2 = Character.isDigit(((String) (obj4)).charAt(0));
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            obj1 = obj4;
            if (!flag2)
            {
                obj1 = ((String) (obj4)).substring(1);
            }
        }
        obj1 = (new StringBuilder()).append(((String) (obj1))).append(cb[133]).toString();
        obj1 = App.az.i(((String) (obj1)));
        if (((ArrayList) (obj1)).size() <= 0)
        {
            break MISSING_BLOCK_LABEL_442;
        }
        flag2 = ((og)((ArrayList) (obj1)).get(0)).t;
        if (flag2)
        {
            try
            {
                aD = (og)((ArrayList) (obj1)).get(0);
                A = aD.a;
                Log.i((new StringBuilder()).append(cb[136]).append(A).toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            if (j1 == 0)
            {
                break MISSING_BLOCK_LABEL_487;
            }
        }
        s1 = new Intent(this, com/whatsapp/SmsDefaultAppWarning);
        s1.setData(Uri.parse(((String) (obj5))));
        startActivity(s1);
        finish();
        return false;
        s1;
        throw s1;
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_506;
        }
        try
        {
            Log.e(cb[115]);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        return false;
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_525;
        }
        try
        {
            Log.e(cb[120]);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        return false;
        i1 = 0;
        try
        {
            as.a(A);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_555;
        }
        aD = com.whatsapp.u5.d(A);
        Object obj6;
        byte byte0;
label1:
        {
            try
            {
                k = aD.k();
                G = aD.d();
                aa(this);
                if (aD != null)
                {
                    break label1;
                }
                Log.e((new StringBuilder()).append(cb[137]).append(A).toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            return false;
        }
        l = aD.c;
        a9 = new HashMap();
        aT = new ArrayList();
        aI = new HashSet();
        al = true;
        U = new s(this, this, V, false);
        U.registerDataSetObserver(aW);
        aK.setAdapter(U);
        com.whatsapp.App.a(aD, false, true);
        com.whatsapp.notification.a1.c().b();
        if (AndroidWear.b())
        {
            Object obj2 = com.whatsapp.u5.d().iterator();
            do
            {
                if (!((Iterator) (obj2)).hasNext())
                {
                    break;
                }
                obj4 = (String)((Iterator) (obj2)).next();
                boolean flag3;
                try
                {
                    if (App.az.e(((String) (obj4))).c > 0)
                    {
                        com.whatsapp.notification.a1.c().b(((String) (obj4)));
                    }
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    throw s1;
                }
            } while (j1 == 0);
        }
        try
        {
            a1 = false;
            if (!aE)
            {
                App.ah.a(a6);
                aE = true;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        obj4 = getIntent();
        if (!((Intent) (obj4)).getBooleanExtra(cb[128], false)) goto _L2; else goto _L1
_L1:
        flag3 = aH;
        if (flag3) goto _L2; else goto _L3
_L3:
        flag3 = ae;
        if (!flag3) goto _L2; else goto _L4
_L4:
        try
        {
            ((Intent) (obj4)).putExtra(cb[117], false);
            ae = false;
            ax = true;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (s1 != null) goto _L2; else goto _L5
_L5:
        byte0 = ((Intent) (obj4)).getExtras().getByte(cb[124]);
        obj2 = ((Intent) (obj4)).getParcelableArrayListExtra(cb[129]);
        if (obj2 == null) goto _L7; else goto _L6
_L6:
        obj5 = new ArrayList();
        obj2 = ((ArrayList) (obj2)).iterator();
_L16:
        if (!((Iterator) (obj2)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj6 = (Uri)((Iterator) (obj2)).next();
        if (byte0 >= 0) goto _L9; else goto _L8
_L8:
        i1 = c1.c(((Uri) (obj6)));
_L45:
        Log.i((new StringBuilder()).append(cb[134]).append(i1).append(cb[121]).append(obj6).toString());
        i1;
        JVM INSTR tableswitch 1 4: default 1032
    //                   1 1662
    //                   2 1535
    //                   3 1557
    //                   4 1675;
           goto _L10 _L11 _L12 _L13 _L14
_L10:
        break; /* Loop/switch isn't completed */
_L14:
        break; /* Loop/switch isn't completed */
_L11:
        break; /* Loop/switch isn't completed */
_L13:
        break; /* Loop/switch isn't completed */
_L40:
        finish();
_L35:
        if (j1 == 0) goto _L16; else goto _L15
_L15:
        Object obj3;
        File file;
        String s2;
        boolean flag4;
        try
        {
            flag3 = ((ArrayList) (obj5)).isEmpty();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            try
            {
                throw s1;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        }
        if (flag3)
        {
            break MISSING_BLOCK_LABEL_1202;
        }
        if (!((Intent) (obj4)).getBooleanExtra(cb[125], false)) goto _L18; else goto _L17
_L17:
        a(((ArrayList) (obj5)));
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_1202;
        }
_L18:
        obj6 = new Intent(this, com/whatsapp/gallerypicker/ImagePreview);
        if (!aD.k()) goto _L20; else goto _L19
_L19:
        obj2 = getString(0x7f0e01ae, new Object[] {
            aD.a(this)
        });
        if (j1 == 0) goto _L21; else goto _L20
_L20:
        obj2 = getString(0x7f0e037d, new Object[] {
            aD.a(this)
        });
_L21:
        ((Intent) (obj6)).putExtra(cb[141], ((String) (obj2)));
        ((Intent) (obj6)).putExtra(cb[126], 0);
        ((Intent) (obj6)).putExtra(cb[140], ((java.io.Serializable) (obj5)));
        startActivityForResult(((Intent) (obj6)), 14);
        if (j1 == 0) goto _L2; else goto _L7
_L7:
        if (byte0 != 4) goto _L23; else goto _L22
_L22:
        try
        {
            com.whatsapp.App.a(A, ((Intent) (obj4)).getStringExtra(cb[116]), ((Intent) (obj4)).getStringExtra(cb[119]));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (j1 == 0) goto _L2; else goto _L23
_L23:
        obj2 = ((Intent) (obj4)).getStringExtra(cb[142]);
        if (obj2 == null) goto _L2; else goto _L24
_L24:
        i1 = ((String) (obj2)).length();
        if (i1 <= 0) goto _L2; else goto _L25
_L25:
        flag3 = ((Intent) (obj4)).getBooleanExtra(cb[127], false);
        if (!flag3) goto _L27; else goto _L26
_L26:
        try
        {
            aR.put(aD.a, obj2);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (j1 == 0) goto _L2; else goto _L27
_L27:
        com.whatsapp.App.a(aD, ((String) (obj2)));
_L2:
        obj2 = (String)aR.get(aD.a);
        flag3 = TextUtils.isEmpty(((CharSequence) (obj2)));
        if (flag3) goto _L29; else goto _L28
_L28:
        try
        {
            Q.setText(com.whatsapp.util.c.b(((String) (obj2)), getBaseContext()));
            S.setVisibility(8);
            if (App.a8())
            {
                J.setVisibility(8);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        y.setVisibility(0);
        if (j1 == 0) goto _L30; else goto _L29
_L29:
        try
        {
            Q.setText(null);
            S.setVisibility(0);
            if (App.a8())
            {
                J.setVisibility(0);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        y.setVisibility(8);
_L30:
        try
        {
            f();
            w.hideSoftInputFromWindow(Q.getWindowToken(), 0);
            Q.requestFocus();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_1484;
        }
        o();
        U.notifyDataSetChanged();
        w();
        flag3 = Voip.h();
        if (!flag3) goto _L32; else goto _L31
_L31:
        try
        {
            g();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (j1 == 0) goto _L33; else goto _L32
_L32:
        v.setVisibility(8);
_L33:
        bz1.a();
        return true;
        s1;
        try
        {
            throw s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        throw s1;
_L12:
        c1.a(this, this, A, c1.a(((Uri) (obj6))), (byte)2, true);
        if (j1 == 0) goto _L35; else goto _L34
_L34:
        file = c1.a(((Uri) (obj6)));
        s2 = ((Uri) (obj6)).getQueryParameter(cb[118]);
        if (!((Intent) (obj4)).getBooleanExtra(cb[122], false))
        {
            break; /* Loop/switch isn't completed */
        }
        c1.a(this, this, A, file, (byte)3, 0, true, s2);
        if (j1 == 0) goto _L35; else goto _L36
_L36:
        flag4 = com.whatsapp.w5.c(file);
        if (!flag4)
        {
            break; /* Loop/switch isn't completed */
        }
        com.whatsapp.VideoPreviewActivity.a(this, aD, file);
        if (j1 == 0) goto _L35; else goto _L37
_L37:
        c1.a(this, this, A, file, (byte)3, 0, true, s2);
        if (j1 == 0) goto _L35; else goto _L38
_L38:
        ((ArrayList) (obj5)).add(obj6);
        if (j1 == 0) goto _L35; else goto _L39
_L39:
        com.whatsapp.App.a(A, ((Intent) (obj4)).getStringExtra(cb[123]), ((Intent) (obj4)).getStringExtra(cb[131]));
        if (j1 == 0) goto _L35; else goto _L40
        obj3;
        throw obj3;
        obj3;
        obj6 = ((IOException) (obj3)).getMessage();
        if (obj6 == null) goto _L42; else goto _L41
_L41:
        flag4 = ((IOException) (obj3)).getMessage().contains(cb[135]);
        if (!flag4) goto _L42; else goto _L43
_L43:
        try
        {
            com.whatsapp.App.a(this, App.au.getString(0x7f0e015f));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (j1 == 0) goto _L44; else goto _L42
_L42:
        App.b(getBaseContext(), 0x7f0e03d4, 0);
_L44:
        Log.e((new StringBuilder()).append(cb[144]).append(((IOException) (obj3)).toString()).toString());
          goto _L15
        obj3;
        throw obj3;
        obj3;
        throw obj3;
        obj3;
        throw obj3;
        obj3;
        throw obj3;
        obj3;
        throw obj3;
        obj3;
        throw obj3;
        obj3;
        throw obj3;
        obj3;
        Log.e((new StringBuilder()).append(cb[138]).append(((OutOfMemoryError) (obj3)).toString()).toString());
        com.whatsapp.App.a(this, App.au.getString(0x7f0e0163));
          goto _L15
        s1;
        try
        {
            throw s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        throw s1;
        s1;
        try
        {
            throw s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        throw s1;
        s1;
        throw s1;
        s1;
        throw s1;
        s1;
        throw s1;
_L9:
        i1 = byte0;
          goto _L45
    }

    public static void j()
    {
label0:
        {
            Object obj = (asa)ab.get();
            int i1;
            try
            {
                if (!((asa) (obj)).a())
                {
                    break label0;
                }
                ((asa) (obj)).b().finish();
                i1 = App.am;
            }
            catch (ActivityNotFoundException activitynotfoundexception)
            {
                throw activitynotfoundexception;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_52;
            }
        }
        obj = com.whatsapp.asa.a(((asa) (obj)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        if (!((Conversation) (obj)).isFinishing())
        {
            ((Conversation) (obj)).finish();
        }
        return;
        ActivityNotFoundException activitynotfoundexception1;
        activitynotfoundexception1;
        throw activitynotfoundexception1;
    }

    static void j(Conversation conversation)
    {
        conversation.D();
    }

    private void j(c4 c4_1)
    {
        Handler handler = new Handler();
        handler.post(new k8(this, c4_1, handler));
    }

    private void j(String s1)
    {
        int l1 = App.am;
        if (!k) goto _L2; else goto _L1
_L1:
        int i1;
        int k1 = aK.getFirstVisiblePosition();
        int j1 = aK.getLastVisiblePosition();
        i1 = k1;
        if (k1 > 0)
        {
            i1 = k1 - 1;
        }
        c4 c4_1;
        String s2;
        boolean flag;
        int i2;
        boolean flag1;
        try
        {
            k1 = aK.getCount();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (j1 + 1 < k1)
        {
            j1++;
        }
        if (s1 == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (isFinishing()) goto _L2; else goto _L3
_L3:
        flag1 = ((asa)ab.get()).a();
        if (!flag1) goto _L2; else goto _L4
_L4:
        if (i1 > j1) goto _L6; else goto _L5
_L5:
        c4_1 = (c4)U.getItem(i1);
        if (c4_1 == null)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        try
        {
            flag1 = c4_1.y.b;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            try
            {
                throw s1;
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
            try
            {
                throw s1;
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
            try
            {
                throw s1;
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
            try
            {
                throw s1;
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
            try
            {
                throw s1;
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
            try
            {
                throw s1;
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
            try
            {
                throw s1;
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
            try
            {
                throw s1;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        }
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        s2 = c4_1.G;
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        flag1 = c4_1.G.equals(s1);
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        flag1 = c4_1.y.b;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        i2 = c4_1.M;
        if (i2 != 6)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        s2 = c4_1.G;
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        if (!c4_1.G.equals(s1))
        {
            break MISSING_BLOCK_LABEL_230;
        }
        aI.add(c4_1);
        if (l1 == 0) goto _L7; else goto _L6
_L6:
        try
        {
            U.notifyDataSetChanged();
            bb = null;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (s1 != null) goto _L2; else goto _L8
_L8:
        af = false;
_L2:
        return;
        s1;
        throw s1;
_L7:
        i1++;
        if (true) goto _L4; else goto _L9
_L9:
    }

    static boolean j(Conversation conversation, boolean flag)
    {
        conversation.aj = flag;
        return flag;
    }

    static int k(Conversation conversation)
    {
        return conversation.l;
    }

    private void k()
    {
        HashMap hashmap;
        try
        {
            hashmap = Z;
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
        if (hashmap == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        if (!Z.isEmpty())
        {
            break MISSING_BLOCK_LABEL_35;
        }
        Log.e(cb[83]);
        return;
        showDialog(13);
        return;
    }

    private void k(c4 c4_1)
    {
        int i1 = App.am;
        if (aT.size() != 0) goto _L2; else goto _L1
_L1:
        int j1 = U.getCursor().getCount();
        if (j1 <= 0)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        boolean flag = al;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        flag = U.getItem(j1 - 1).equals(c4_1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        Log.i((new StringBuilder()).append(cb[172]).append(Log.a(c4_1)).toString());
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        if (j1 <= 1)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        flag = al;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        flag = U.getItem(j1 - 2).equals(c4_1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        Log.i((new StringBuilder()).append(cb[173]).append(Log.a(c4_1)).toString());
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        aT.add(c4_1);
_L3:
        return;
        StaleDataException staledataexception;
        staledataexception;
        try
        {
            throw staledataexception;
        }
        catch (StaleDataException staledataexception1)
        {
            try
            {
                throw staledataexception1;
            }
            catch (StaleDataException staledataexception2)
            {
                try
                {
                    throw staledataexception2;
                }
                catch (StaleDataException staledataexception3)
                {
                    try
                    {
                        throw staledataexception3;
                    }
                    catch (StaleDataException staledataexception4)
                    {
                        try
                        {
                            throw staledataexception4;
                        }
                        catch (StaleDataException staledataexception5)
                        {
                            try
                            {
                                throw staledataexception5;
                            }
                            catch (StaleDataException staledataexception6)
                            {
                                try
                                {
                                    throw staledataexception6;
                                }
                                catch (StaleDataException staledataexception7)
                                {
                                    try
                                    {
                                        throw staledataexception7;
                                    }
                                    catch (StaleDataException staledataexception8)
                                    {
                                        try
                                        {
                                            Log.i((new StringBuilder()).append(cb[174]).append(staledataexception8.toString()).toString());
                                            aT.add(c4_1);
                                        }
                                        // Misplaced declaration of an exception variable
                                        catch (c4 c4_1)
                                        {
                                            throw c4_1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i1 == 0) goto _L3; else goto _L2
_L2:
        aT.add(c4_1);
        return;
    }

    static boolean k(Conversation conversation, boolean flag)
    {
        conversation.a_ = flag;
        return flag;
    }

    static ArrayList l(Conversation conversation)
    {
        return conversation.aT;
    }

    private void l()
    {
        Object obj = Environment.getExternalStorageState();
        try
        {
            if (!((String) (obj)).equals(cb[199]))
            {
                showDialog(15);
                return;
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        try
        {
            if (App.A() < (long)(au2.q * 1024 * 1024))
            {
                a(0x7f0e015f);
                return;
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
        try
        {
            if (App.C(A))
            {
                showDialog(106);
                return;
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception2)
        {
            throw activitynotfoundexception2;
        }
        activitynotfoundexception2 = new Intent(this, com/whatsapp/camera/CameraActivity);
        activitynotfoundexception2.putExtra(cb[198], A);
        startActivity(activitynotfoundexception2);
    }

    static boolean l(Conversation conversation, boolean flag)
    {
        conversation.P = flag;
        return flag;
    }

    static ActionMode m(Conversation conversation)
    {
        return conversation.X;
    }

    static boolean m(Conversation conversation, boolean flag)
    {
        conversation.Y = flag;
        return flag;
    }

    private void n()
    {
        try
        {
            if (!w.isFullscreenMode())
            {
                w.toggleSoftInput(2, 0);
            }
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
    }

    static boolean n(Conversation conversation)
    {
        return conversation.H;
    }

    private void o()
    {
        boolean flag = true;
        int i1 = App.am;
        Object obj;
        boolean flag1;
        try
        {
            aD = com.whatsapp.u5.d(aD.a);
            R.setText(com.whatsapp.util.c.b(aD.a(this), getBaseContext(), R.getPaint()));
            I.setVisibility(0);
            obj = ak;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        if (obj != null)
        {
            flag = false;
        }
        try
        {
            if (ak != null)
            {
                ak.a();
                ak = null;
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
        p();
        flag1 = k;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        flag1 = G;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        ak = new rb(this, aD.a, flag);
        com.whatsapp.asw.a(ak, new Void[0]);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        obj = aD.z;
        ActivityNotFoundException activitynotfoundexception2;
        if (obj != null)
        {
            try
            {
                if (a7 != null)
                {
                    aK.removeHeaderView(a7);
                    a7 = null;
                    U.notifyDataSetChanged();
                }
            }
            // Misplaced declaration of an exception variable
            catch (ActivityNotFoundException activitynotfoundexception2)
            {
                throw activitynotfoundexception2;
            }
        }
        flag = k;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_261;
        }
        flag = com.whatsapp.mk.c(aD.a);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_261;
        }
        findViewById(0x7f0b0161).setVisibility(8);
        findViewById(0x7f0b0160).setVisibility(0);
        obj = j;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_302;
        }
        j.setVisible(false);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_302;
        }
        try
        {
            findViewById(0x7f0b0161).setVisibility(0);
            findViewById(0x7f0b0160).setVisibility(8);
            if (j != null)
            {
                j.setVisible(true);
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception3)
        {
            throw activitynotfoundexception3;
        }
        com.whatsapp.asw.a(new tz(this, null), new Void[0]);
        return;
        activitynotfoundexception2;
        throw activitynotfoundexception2;
        activitynotfoundexception2;
        throw activitynotfoundexception2;
        activitynotfoundexception2;
        throw activitynotfoundexception2;
        activitynotfoundexception2;
        throw activitynotfoundexception2;
        activitynotfoundexception2;
        throw activitynotfoundexception2;
        activitynotfoundexception2;
        throw activitynotfoundexception2;
        activitynotfoundexception2;
        throw activitynotfoundexception2;
        activitynotfoundexception2;
        throw activitynotfoundexception2;
    }

    static boolean o(Conversation conversation)
    {
        return conversation.e();
    }

    static View p(Conversation conversation)
    {
        return conversation.aw;
    }

    private void p()
    {
        int i1 = App.am;
        String s1;
        boolean flag;
        try
        {
            if (!k)
            {
                break MISSING_BLOCK_LABEL_94;
            }
            flag = au2.k;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        s1 = aD.w();
        flag = TextUtils.isEmpty(s1);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        I.setText(s1);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        try
        {
            if (aZ != null)
            {
                I.setText(aZ);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        s1 = aZ;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        ActivityNotFoundException activitynotfoundexception1;
        try
        {
            I.setText(aZ);
        }
        catch (ActivityNotFoundException activitynotfoundexception2)
        {
            throw activitynotfoundexception2;
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        flag = G;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        s1 = aD.v();
        flag = TextUtils.isEmpty(s1);
        if (!flag)
        {
            ActivityNotFoundException activitynotfoundexception3;
            try
            {
                I.setVisibility(0);
                I.setText((new StringBuilder()).append(s1).append(" ").toString());
                I.requestLayout();
            }
            catch (ActivityNotFoundException activitynotfoundexception4)
            {
                throw activitynotfoundexception4;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_175;
            }
        }
        I.setVisibility(8);
        return;
        activitynotfoundexception1;
        throw activitynotfoundexception1;
        activitynotfoundexception1;
        throw activitynotfoundexception1;
        activitynotfoundexception1;
        throw activitynotfoundexception1;
        activitynotfoundexception3;
        throw activitynotfoundexception3;
    }

    private void q()
    {
        Cursor cursor;
        int j1;
        int j2;
        j1 = 0;
        j2 = App.am;
        cursor = U.getCursor();
        if (cursor == null) goto _L2; else goto _L1
_L1:
        c4 c4_1;
        int i1;
        int k1;
        int l1;
        boolean flag;
        try
        {
            flag = cursor.moveToFirst();
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        if (!flag) goto _L2; else goto _L3
_L3:
        k1 = 0;
_L5:
        c4_1 = App.ah.a(cursor, A);
        i1 = k1;
        if (!c4_1.y.b)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        l1 = c4_1.M;
        i1 = k1;
        if (l1 == 6)
        {
            ActivityNotFoundException activitynotfoundexception1;
            int i2;
            int k2;
            boolean flag1;
            try
            {
                flag1 = com.whatsapp.mk.a(c4_1);
            }
            catch (ActivityNotFoundException activitynotfoundexception2)
            {
                throw activitynotfoundexception2;
            }
            i1 = k1;
            if (!flag1)
            {
                i1 = k1 + 1;
            }
        }
        i2 = j1 + 1;
        j1 = i1;
        try
        {
            if (!cursor.moveToNext())
            {
                break MISSING_BLOCK_LABEL_139;
            }
            k2 = bd;
        }
        catch (ActivityNotFoundException activitynotfoundexception3)
        {
            throw activitynotfoundexception3;
        }
        j1 = i2;
        k1 = i1;
        if (i2 < k2 + i1) goto _L5; else goto _L4
_L4:
        j1 = i1;
_L7:
        i1 = cursor.getCount();
        k1 = bd;
        if (k1 + j1 >= i1)
        {
            ActivityNotFoundException activitynotfoundexception4;
            try
            {
                if (bd + j1 > i1)
                {
                    Log.e((new StringBuilder()).append(cb[194]).append(bd).append(cb[195]).append(j1).append(cb[193]).append(i1).append(cb[192]).append(l).toString());
                }
            }
            catch (ActivityNotFoundException activitynotfoundexception5)
            {
                throw activitynotfoundexception5;
            }
            try
            {
                bd = 0;
            }
            catch (ActivityNotFoundException activitynotfoundexception6)
            {
                throw activitynotfoundexception6;
            }
            if (j2 == 0)
            {
                break MISSING_BLOCK_LABEL_269;
            }
        }
        bd = bd + j1;
        return;
        activitynotfoundexception1;
        throw activitynotfoundexception1;
        activitynotfoundexception4;
        throw activitynotfoundexception4;
_L2:
        j1 = 0;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static void q(Conversation conversation)
    {
        asa asa1 = (asa)ab.get();
        try
        {
            if (com.whatsapp.asa.a(asa1) == conversation)
            {
                ab.compareAndSet(asa1, new asa(null, false));
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Conversation conversation)
        {
            throw conversation;
        }
    }

    static Runnable r(Conversation conversation)
    {
        return conversation.aL;
    }

    private void r()
    {
label0:
        {
            ai.removeCallbacks(aU);
            View view = findViewById(0x7f0b0166);
            int ai1[] = new int[2];
            view.getLocationOnScreen(ai1);
            Display display = getWindowManager().getDefaultDisplay();
            if ((float)(display.getHeight() - (ai1[1] + view.getHeight())) > 128F * aA.g)
            {
                int i1 = display.getHeight();
                int k1 = ai1[1];
                k1 = i1 - (view.getHeight() + k1);
                Log.i((new StringBuilder()).append(cb[257]).append(k1).toString());
                i1 = k1;
                if (k1 == 0)
                {
                    i1 = (display.getHeight() * 2) / 5;
                }
                Math.max(i1, aA.w * 4);
                h();
                ac.a(true);
                ac.a(findViewById(0x7f0b0166), n, y, Q);
                ai.setFreezeHeight();
                if (App.am == 0)
                {
                    break label0;
                }
            }
            int l1 = ac.a();
            Log.i((new StringBuilder()).append(cb[258]).append(l1).toString());
            int j1 = l1;
            if (l1 == 0)
            {
                j1 = (display.getHeight() * 2) / 5;
            }
            j1 = Math.max(j1, aA.w * 4);
            aK.setTranscriptMode(2);
            aK.setFastScrollEnabled(false);
            i.sendEmptyMessageDelayed(0, 1000L);
            ac.a(false);
            ac.a(findViewById(0x7f0b0166), n, y, Q);
            ai.setFreezeHeight(ai.getHeight() - j1);
        }
    }

    static void s(Conversation conversation)
    {
        conversation.r();
    }

    static int t(Conversation conversation)
    {
        return conversation.m;
    }

    private void t()
    {
        int i1 = App.am;
        boolean flag;
        if (Z == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        flag = Z.isEmpty();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        NullPointerException nullpointerexception;
        try
        {
            Log.e(cb[93]);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        nullpointerexception;
        throw nullpointerexception;
        StringBuilder stringbuilder;
        ArrayList arraylist;
        Iterator iterator;
        stringbuilder = new StringBuilder();
        arraylist = u();
        iterator = arraylist.iterator();
_L2:
        c4 c4_1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        c4_1 = (c4)iterator.next();
        int j1;
        if (c4_1.w != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        j1 = stringbuilder.length();
        if (j1 != 0)
        {
            try
            {
                stringbuilder.append('\n');
            }
            // Misplaced declaration of an exception variable
            catch (StringBuilder stringbuilder)
            {
                throw stringbuilder;
            }
        }
        if (arraylist.size() <= 1)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        stringbuilder.append('[').append(DateUtils.formatDateTime(this, c4_1.I, 0xa0011)).append(cb[92]);
        flag = c4_1.y.b;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        stringbuilder.append(com.whatsapp.App.x(this));
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        boolean flag1;
        try
        {
            flag1 = aD.k();
        }
        // Misplaced declaration of an exception variable
        catch (StringBuilder stringbuilder)
        {
            throw stringbuilder;
        }
        if (flag1)
        {
            og og1 = App.az.e(c4_1.G);
            ClipboardManager clipboardmanager;
            try
            {
                stringbuilder.append(og1.a(this));
            }
            // Misplaced declaration of an exception variable
            catch (StringBuilder stringbuilder)
            {
                throw stringbuilder;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_230;
            }
        }
        stringbuilder.append(aD.a(this));
        stringbuilder.append(cb[89]);
        stringbuilder.append(c4_1.e());
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        clipboardmanager = (ClipboardManager)getSystemService(cb[91]);
        clipboardmanager.setText(stringbuilder.toString());
        if (arraylist.size() != 1)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        App.b(this, 0x7f0e0250, 0);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_378;
        }
        try
        {
            App.b(this, String.format(App.j.a(0x7f0d0014, arraylist.size()), new Object[] {
                Integer.valueOf(arraylist.size())
            }), 0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (StringBuilder stringbuilder)
        {
            try
            {
                throw stringbuilder;
            }
            // Misplaced declaration of an exception variable
            catch (StringBuilder stringbuilder)
            {
                Log.e(cb[90]);
            }
        }
        App.b(this, 0x7f0e047e, 0);
        return;
        stringbuilder;
        throw stringbuilder;
        stringbuilder;
        throw stringbuilder;
        stringbuilder;
        throw stringbuilder;
        stringbuilder;
        throw stringbuilder;
    }

    private ArrayList u()
    {
        ArrayList arraylist = new ArrayList(Z.values());
        Collections.sort(arraylist, new au3(this));
        return arraylist;
    }

    static HashMap u(Conversation conversation)
    {
        return conversation.a9;
    }

    static ak8 v(Conversation conversation)
    {
        return conversation.as;
    }

    private void v()
    {
        boolean flag;
        try
        {
            flag = e(true);
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        return;
_L2:
        try
        {
            if (App.C(aD.a))
            {
                showDialog(106);
                return;
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
        String s1 = (new StringBuilder(Q.getText())).toString().trim();
        ActivityNotFoundException activitynotfoundexception2;
        int i1;
        int j1;
        int k1;
        boolean flag1;
        try
        {
            if (s1.length() > 0)
            {
                com.whatsapp.App.a(aD, com.whatsapp.util.c.a(s1));
                Q.setText("");
                TextKeyListener.clear(Q.getText());
                F();
                aK.setFastScrollEnabled(false);
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception3)
        {
            throw activitynotfoundexception3;
        }
        flag1 = w.isFullscreenMode();
        if (flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = Q.getHeight();
        j1 = aK.getHeight();
        k1 = getWindow().getDecorView().getHeight();
        if ((i1 + j1) * 4 >= k1)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = getResources().getConfiguration().orientation;
        if (i1 != 2) goto _L1; else goto _L3
_L3:
        try
        {
            w.hideSoftInputFromWindow(Q.getWindowToken(), 0);
            if (ac.isShowing())
            {
                ac.dismiss();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (ActivityNotFoundException activitynotfoundexception2)
        {
            throw activitynotfoundexception2;
        }
        if (true) goto _L1; else goto _L4
_L4:
        ActivityNotFoundException activitynotfoundexception4;
        activitynotfoundexception4;
        throw activitynotfoundexception4;
        activitynotfoundexception4;
        throw activitynotfoundexception4;
        activitynotfoundexception4;
        throw activitynotfoundexception4;
    }

    static ConversationTextEntry w(Conversation conversation)
    {
        return conversation.Q;
    }

    private void w()
    {
        boolean flag;
        try
        {
            if (F)
            {
                P = false;
                E = false;
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        try
        {
            flag = E;
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
        if (flag)
        {
            return;
        } else
        {
            ah = true;
            aK.post(new aso(this));
            return;
        }
    }

    private void x()
    {
        int i1 = App.am;
        boolean flag = ax;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        w();
        ax = false;
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        int j1 = android.os.Build.VERSION.SDK_INT;
        if (j1 < 8)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        int k1;
        j1 = aK.getLastVisiblePosition();
        k1 = aK.getCount();
        if (j1 < k1 - 2)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        w();
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        ActivityNotFoundException activitynotfoundexception;
        try
        {
            aK.smoothScrollBy((int)getResources().getDimension(0x7f0a002f), 100);
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        w();
        return;
        activitynotfoundexception;
        throw activitynotfoundexception;
        activitynotfoundexception;
        throw activitynotfoundexception;
        activitynotfoundexception;
        throw activitynotfoundexception;
        activitynotfoundexception;
        throw activitynotfoundexception;
        activitynotfoundexception;
        throw activitynotfoundexception;
    }

    static void x(Conversation conversation)
    {
        conversation.v();
    }

    public static void y()
    {
        aS = true;
    }

    static boolean y(Conversation conversation)
    {
        return conversation.aj;
    }

    private void z()
    {
        try
        {
            if (ad != null)
            {
                ad.finish();
            }
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
    }

    static void z(Conversation conversation)
    {
        conversation.h();
    }

    public SubMenu a(Menu menu, int i1, int j1, int k1)
    {
        menu = menu.addSubMenu(0, i1, 0, j1);
        menu.clearHeader();
        menu.getItem().setIcon(k1);
        return menu;
    }

    public void a()
    {
        boolean flag = isFinishing();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        flag = ((asa)ab.get()).a();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ActivityNotFoundException activitynotfoundexception;
        try
        {
            j(((String) (null)));
            if (aD.k())
            {
                U.notifyDataSetChanged();
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
        o();
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        af = true;
        return;
        activitynotfoundexception;
        throw activitynotfoundexception;
        activitynotfoundexception;
        throw activitynotfoundexception;
        ActivityNotFoundException activitynotfoundexception2;
        activitynotfoundexception2;
        throw activitynotfoundexception2;
    }

    public void a(Dialog dialog)
    {
        int i1 = App.am;
        try
        {
            if (p.contains(dialog))
            {
                Log.e(cb[112]);
                dialog.show();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Dialog dialog)
        {
            throw dialog;
        }
        ArrayList arraylist = new ArrayList();
        Iterator iterator = p.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Dialog dialog1 = (Dialog)iterator.next();
            try
            {
                if (!dialog1.isShowing())
                {
                    arraylist.add(dialog1);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Dialog dialog)
            {
                throw dialog;
            }
        } while (i1 == 0);
        p.removeAll(arraylist);
        p.add(dialog);
        dialog.show();
    }

    public void a(c4 c4_1)
    {
        v.setVisibility(8);
    }

    public void a(String s1)
    {
        try
        {
            if (s1.equals(A))
            {
                o();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
    }

    public void a(String s1, long l1)
    {
        try
        {
            if (v.getVisibility() != 0)
            {
                v.setVisibility(0);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        O.setText(DateUtils.formatElapsedTime(l1 / 1000L));
    }

    public void a(Collection collection)
    {
        try
        {
            if (a7 != null)
            {
                H();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            throw collection;
        }
    }

    boolean a(int i1, String s1, c4 c4_1)
    {
        int j1;
        boolean flag1;
        flag1 = true;
        j1 = App.am;
        i1;
        JVM INSTR tableswitch 0 16: default 92
    //                   0 113
    //                   1 107
    //                   2 98
    //                   3 119
    //                   4 140
    //                   5 147
    //                   6 133
    //                   7 154
    //                   8 241
    //                   9 298
    //                   10 307
    //                   11 92
    //                   12 92
    //                   13 92
    //                   14 316
    //                   15 126
    //                   16 415;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L1 _L1 _L1 _L13 _L14 _L15
_L1:
        boolean flag = false;
_L22:
        return flag;
_L4:
        try
        {
            t();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        return true;
_L3:
        D();
        return true;
_L2:
        k();
        return true;
_L5:
        j(c4_1);
        return true;
_L14:
        i(c4_1);
        return true;
_L8:
        e(c4_1);
        return true;
_L6:
        g(c4_1);
        return true;
_L7:
        h(c4_1);
        return true;
_L9:
        az = c4_1.G.substring(0, c4_1.G.indexOf("@"));
        if (az != null) goto _L17; else goto _L16
_L16:
        Log.w(cb[232]);
        App.b(this, 0x7f0e01aa, 0);
        return true;
        s1;
        throw s1;
_L17:
        a((new StringBuilder()).append("+").append(az).toString(), true);
        W = true;
        return true;
_L10:
        az = c4_1.G.substring(0, c4_1.G.indexOf("@"));
        b((new StringBuilder()).append("+").append(az).toString(), true);
        W = true;
        return true;
_L11:
        a(s1, 102);
        return true;
_L12:
        a(s1, 101);
        return true;
_L13:
        if (c4_1.G == null)
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = App.az.e(c4_1.G);
        if (s1 == null) goto _L19; else goto _L18
_L18:
        startActivity(a(((og) (s1))));
        finish();
        if (j1 == 0) goto _L20; else goto _L19
_L19:
        try
        {
            Log.e((new StringBuilder()).append(cb[235]).append(c4_1.G).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
_L20:
        flag = flag1;
        if (j1 == 0) goto _L22; else goto _L21
_L21:
        try
        {
            Log.e(cb[236]);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        return true;
        s1;
        throw s1;
_L15:
        Object obj;
        try
        {
            if (!App.aq())
            {
                break; /* Loop/switch isn't completed */
            }
            obj = c4_1.G;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = App.az.e(c4_1.G);
        if (obj == null) goto _L24; else goto _L23
_L23:
        App.b(((og) (obj)), this);
        if (j1 == 0) goto _L25; else goto _L24
_L24:
        try
        {
            Log.e((new StringBuilder()).append(cb[230]).append(c4_1.G).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
_L25:
        flag = flag1;
        if (j1 == 0) goto _L22; else goto _L26
_L26:
        try
        {
            Log.e(cb[237]);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        flag = flag1;
        if (j1 == 0) goto _L22; else goto _L27
_L27:
        s1 = new Intent(cb[233], Uri.parse((new StringBuilder()).append(cb[234]).append(s1).toString()));
        try
        {
            startActivity(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Log.w(cb[231]);
            App.aO();
            return true;
        }
        return true;
        s1;
        throw s1;
    }

    public MenuItem b(Menu menu, int i1, int j1, int k1)
    {
        menu = menu.add(0, i1, 0, j1);
        menu.setIcon(k1);
        return menu;
    }

    public void b(c4 c4_1)
    {
    }

    public void b(String s1)
    {
        try
        {
            if (s1.equals(A))
            {
                p();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
    }

    public void c(c4 c4_1)
    {
        akr.t();
    }

    public void c(String s1)
    {
        try
        {
            if (s1.equals(A))
            {
                o();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
    }

    public boolean c()
    {
        return as.a();
    }

    public void d(String s1)
    {
        try
        {
            if (s1.equals(A))
            {
                findViewById(0x7f0b0152).setVisibility(8);
                a8.setVisibility(0);
                o();
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        aK.post(new a3m(this, s1));
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        try
        {
            flag = al;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        if (flag)
        {
            boolean flag1;
            try
            {
                flag1 = akr.i();
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                throw motionevent;
            }
            if (!flag1)
            {
                boolean flag2;
                try
                {
                    flag2 = super.dispatchTouchEvent(motionevent);
                }
                // Misplaced declaration of an exception variable
                catch (MotionEvent motionevent)
                {
                    Log.e((new StringBuilder()).append(cb[111]).append(motionevent.toString()).toString());
                    App.b(this, 0x7f0e0022, 0);
                    return false;
                }
                // Misplaced declaration of an exception variable
                catch (MotionEvent motionevent)
                {
                    Log.e((new StringBuilder()).append(cb[110]).append(motionevent.toString()).toString());
                    return false;
                }
                return flag2;
            }
        }
        return false;
    }

    public void e(String s1)
    {
        a9n a9n1 = (a9n)de.greenrobot.event.g.a().a(com/whatsapp/a9n);
        boolean flag;
        try
        {
            flag = a9n1.a();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            try
            {
                throw s1;
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
            try
            {
                throw s1;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        a1 = true;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        if (s1.equals(A))
        {
            break MISSING_BLOCK_LABEL_47;
        }
        aj = false;
    }

    public boolean m()
    {
        ActionMode actionmode;
        try
        {
            actionmode = ad;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        if (actionmode != null)
        {
            return false;
        }
        try
        {
            if (X != null)
            {
                X.finish();
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
        try
        {
            Log.i(cb[146]);
            if (aq == null)
            {
                aq = new at6(this);
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception2)
        {
            throw activitynotfoundexception2;
        }
        U.notifyDataSetChanged();
        ad = startActionMode(aq);
        return true;
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        int k1;
        k1 = App.am;
        if (j1 != 0 || intent == null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        boolean flag = intent.getBooleanExtra(cb[70], false);
        if (flag)
        {
            try
            {
                Log.e(cb[42]);
                com.whatsapp.App.a(this, App.au.getString(0x7f0e0163));
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
        }
        try
        {
            if (intent.getBooleanExtra(cb[78], false))
            {
                Log.e(cb[41]);
                com.whatsapp.App.a(this, App.au.getString(0x7f0e015f));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        try
        {
            if (intent.getBooleanExtra(cb[82], false))
            {
                Log.e(cb[26]);
                com.whatsapp.App.a(this, App.au.getString(0x7f0e015a));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (j1 == -1 || i1 != 14) goto _L2; else goto _L1
_L1:
        finish();
_L94:
        return;
        intent;
        throw intent;
        intent;
        throw intent;
_L2:
        i1;
        JVM INSTR tableswitch 2 24: default 264
    //                   2 269
    //                   3 264
    //                   4 1482
    //                   5 1058
    //                   6 264
    //                   7 1736
    //                   8 1721
    //                   9 264
    //                   10 678
    //                   11 428
    //                   12 759
    //                   13 570
    //                   14 853
    //                   15 264
    //                   16 264
    //                   17 2180
    //                   18 2095
    //                   19 3424
    //                   20 3500
    //                   21 853
    //                   22 853
    //                   23 809
    //                   24 1294;
           goto _L3 _L4 _L3 _L5 _L6 _L3 _L7 _L8 _L3 _L9 _L10 _L11 _L12 _L13 _L3 _L3 _L14 _L15 _L16 _L17 _L13 _L13 _L18 _L19
_L3:
        a0 = true;
        return;
_L4:
        if (j1 != -1) goto _L3; else goto _L20
_L20:
        Object obj;
        try
        {
            obj = Z;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (obj == null) goto _L22; else goto _L21
_L21:
        obj = intent.getStringExtra(cb[15]);
        obj = App.az.e(((String) (obj)));
        if (obj == null) goto _L24; else goto _L23
_L23:
        Iterator iterator = u().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.whatsapp.App.a((c4)iterator.next(), ((og) (obj)));
        } while (k1 == 0);
        if (A.equals(((og) (obj)).a))
        {
            break MISSING_BLOCK_LABEL_397;
        }
        startActivity(a(((og) (obj))));
        if (k1 == 0)
        {
            break MISSING_BLOCK_LABEL_397;
        }
_L24:
        try
        {
            Log.w(cb[67]);
            App.b(this, 0x7f0e0210, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (k1 == 0)
        {
            break MISSING_BLOCK_LABEL_419;
        }
_L22:
        try
        {
            Log.w(cb[32]);
            App.b(this, 0x7f0e0255, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        z();
        if (k1 == 0) goto _L3; else goto _L10
_L10:
        if (j1 != -1) goto _L26; else goto _L25
_L25:
        try
        {
            flag = W;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (!flag) goto _L28; else goto _L27
_L27:
        obj = new og((new StringBuilder()).append(az).append(cb[62]).toString());
        App.az.h(((og) (obj)));
        h(((og) (obj)).a);
        U.notifyDataSetChanged();
        if (k1 == 0) goto _L3; else goto _L28
_L28:
        if (intent == null) goto _L30; else goto _L29
_L29:
        obj = intent.getData();
        if (obj == null) goto _L30; else goto _L31
_L31:
        App.az.a(intent.getData(), aD);
        if (k1 == 0) goto _L3; else goto _L30
_L30:
        App.az.h(aD);
        if (k1 == 0) goto _L3; else goto _L26
_L26:
        Log.i(cb[23]);
        if (k1 == 0) goto _L3; else goto _L12
_L12:
        if (j1 != -1) goto _L33; else goto _L32
_L32:
        try
        {
            flag = W;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (!flag) goto _L35; else goto _L34
_L34:
        obj = new og((new StringBuilder()).append(az).append(cb[49]).toString());
        App.az.h(((og) (obj)));
        h(((og) (obj)).a);
        U.notifyDataSetChanged();
        if (k1 == 0) goto _L3; else goto _L35
_L35:
        App.az.h(aD);
        if (k1 == 0) goto _L3; else goto _L33
_L33:
        Log.i(cb[59]);
        if (k1 == 0) goto _L3; else goto _L9
_L9:
        if (j1 != -1) goto _L37; else goto _L36
_L36:
        obj = K;
        if (obj != null)
        {
            try
            {
                App.az.a(K);
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
        }
        if (a7 == null)
        {
            break MISSING_BLOCK_LABEL_749;
        }
        aK.removeHeaderView(a7);
        a7 = null;
        U.notifyDataSetChanged();
        if (k1 == 0)
        {
            break MISSING_BLOCK_LABEL_749;
        }
_L37:
        try
        {
            Log.i(cb[56]);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        K = null;
        if (k1 == 0) goto _L3; else goto _L11
_L11:
        if (j1 != -1) goto _L39; else goto _L38
_L38:
        obj = K;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_799;
        }
        App.az.a(K);
        if (k1 == 0)
        {
            break MISSING_BLOCK_LABEL_799;
        }
_L39:
        try
        {
            Log.i(cb[43]);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        try
        {
            K = null;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (k1 == 0) goto _L3; else goto _L18
_L18:
        if (j1 != -1) goto _L41; else goto _L40
_L40:
        obj = Uri.fromFile(c1.c(this));
        IOException ioexception;
        Object obj1;
        Object obj3;
        String s1;
        boolean flag1;
        boolean flag3;
        try
        {
            c1.a(this, ((Uri) (obj)));
            a(((Uri) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
        }
        if (k1 == 0) goto _L3; else goto _L41
_L41:
        if (j1 != 0) goto _L3; else goto _L42
_L42:
        c1.b(this);
        if (k1 == 0) goto _L3; else goto _L13
_L13:
        if (intent == null) goto _L3; else goto _L43
_L43:
        if (!intent.getBooleanExtra(cb[9], false)) goto _L45; else goto _L44
_L44:
        if (j1 != -1) goto _L47; else goto _L46
_L46:
        obj = intent.getData();
        if (obj == null) goto _L49; else goto _L48
_L48:
        flag1 = ((Uri) (obj)).toString().startsWith(android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString());
        if (flag1) goto _L51; else goto _L50
_L50:
        flag1 = ((Uri) (obj)).toString().startsWith(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString());
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_954;
        }
_L51:
        try
        {
            Log.w(cb[77]);
            App.b(getBaseContext(), 0x7f0e03d4, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (k1 == 0)
        {
            break MISSING_BLOCK_LABEL_1006;
        }
        obj = c1.a(((Uri) (obj)));
        if (!com.whatsapp.w5.c(((File) (obj))))
        {
            break MISSING_BLOCK_LABEL_984;
        }
        com.whatsapp.VideoPreviewActivity.a(this, aD, ((File) (obj)));
        if (k1 == 0)
        {
            break MISSING_BLOCK_LABEL_1006;
        }
        c1.a(this, this, aD.a, ((File) (obj)), (byte)3, true);
        ax = true;
_L95:
        if (k1 == 0) goto _L52; else goto _L47
_L47:
        if (j1 != 1) goto _L52; else goto _L53
_L53:
        ax = true;
        c1.a(this, this, aD.a, new File(intent.getStringExtra(cb[10])), (byte)3, true);
_L52:
        if (k1 == 0) goto _L3; else goto _L6
_L6:
        if (j1 != -1) goto _L3; else goto _L54
_L54:
        obj = intent.getData();
        if (obj != null) goto _L56; else goto _L55
_L55:
        Log.w(cb[50]);
        App.b(getBaseContext(), 0x7f0e03d4, 0);
        if (k1 == 0) goto _L3; else goto _L56
_L56:
        obj = c1.a(((Uri) (obj)));
        obj1 = Build.MANUFACTURER.replace(' ', '_');
        if (!((String) (obj1)).equalsIgnoreCase(cb[45]))
        {
            break MISSING_BLOCK_LABEL_1236;
        }
        flag1 = intent.getBooleanExtra(cb[73], true);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_1236;
        }
        obj1 = new Intent(this, com/whatsapp/RecordAudio);
        ((Intent) (obj1)).putExtra(cb[55], true);
        ((Intent) (obj1)).putExtra(cb[44], true);
        ((Intent) (obj1)).putExtra(cb[60], aD.a);
        ((Intent) (obj1)).putExtra(cb[34], ((File) (obj)).getAbsolutePath());
        startActivity(((Intent) (obj1)));
        if (k1 == 0)
        {
            break MISSING_BLOCK_LABEL_1263;
        }
        c1.a(this, this, aD.a, ((File) (obj)), (byte)2, intent.getBooleanExtra(cb[27], true));
        ax = true;
          goto _L3
_L103:
        if (k1 == 0) goto _L3; else goto _L19
_L19:
        if (j1 != -1) goto _L58; else goto _L57
_L57:
        ioexception = new MediaData();
        try
        {
            ioexception.file = new File(intent.getStringExtra(cb[72]));
            ioexception.trimFrom = intent.getLongExtra(cb[29], 0L);
            ioexception.trimTo = intent.getLongExtra(cb[18], 0L);
            com.whatsapp.App.a(A, c1.a(((MediaData) (ioexception)).file.getAbsolutePath(), ((MediaData) (ioexception)).trimFrom * 1000L), ioexception, (byte)3, 0, intent.getStringExtra(cb[79]), null);
            ax = true;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
        }
        if (k1 == 0) goto _L3; else goto _L58
_L58:
        if (j1 != 1) goto _L3; else goto _L59
_L59:
        ax = true;
        c1.a(this, this, aD.a, new File(intent.getStringExtra(cb[22])), (byte)3, true);
          goto _L3
        ioexception;
        try
        {
            Log.a(ioexception);
            App.b(getBaseContext(), 0x7f0e03d4, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (k1 == 0) goto _L3; else goto _L5
_L5:
        if (j1 != -1) goto _L61; else goto _L60
_L60:
        flag1 = false;
        ioexception = null;
        if (intent == null) goto _L63; else goto _L62
_L62:
        obj1 = intent.getData();
        if (obj1 == null) goto _L63; else goto _L64
_L64:
        ioexception = intent.getData();
        flag1 = true;
_L106:
        if (ioexception != null) goto _L66; else goto _L65
_L65:
        Log.w(cb[48]);
        App.b(getBaseContext(), 0x7f0e03d4, 0);
        if (k1 == 0) goto _L3; else goto _L66
_L66:
        flag3 = ioexception.toString().startsWith(android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString());
        if (flag3) goto _L68; else goto _L67
_L67:
        flag3 = ioexception.toString().startsWith(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString());
        if (!flag3) goto _L69; else goto _L68
_L68:
        Log.w(cb[53]);
        App.b(getBaseContext(), 0x7f0e03d4, 0);
        if (k1 == 0) goto _L3; else goto _L69
_L69:
        ioexception = c1.a(ioexception);
        if (!com.whatsapp.w5.c(ioexception)) goto _L71; else goto _L70
_L70:
        com.whatsapp.VideoPreviewActivity.a(this, aD, ioexception);
        if (k1 == 0) goto _L3; else goto _L71
_L71:
        ax = true;
        c1.a(this, this, aD.a, ioexception, (byte)3, flag1);
          goto _L3
_L107:
        try
        {
            throw ioexception;
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            try
            {
                throw ioexception;
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception) { }
        }
        try
        {
            Log.a(ioexception);
            App.b(getBaseContext(), 0x7f0e03d4, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
        }
        if (k1 == 0) goto _L3; else goto _L61
_L61:
        if (j1 != 0) goto _L3; else goto _L72
_L72:
        i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 < 18) goto _L3; else goto _L73
_L73:
        c1.b(this);
        if (k1 == 0) goto _L3; else goto _L8
_L8:
        if (j1 != -1) goto _L3; else goto _L74
_L74:
        ax = true;
        if (k1 == 0) goto _L3; else goto _L7
_L7:
        if (j1 != -1) goto _L3; else goto _L75
_L75:
        ioexception = intent.getData();
        obj1 = cb[61];
        obj3 = cb[14];
        s1 = cb[25];
        obj3 = com.whatsapp.App.d.query(ioexception, new String[] {
            obj1, obj3, s1
        }, null, null, null);
        obj1 = new g(this);
        Object obj2;
        FileNotFoundException filenotfoundexception;
        boolean flag2;
        if (((Cursor) (obj3)).moveToNext())
        {
            ioexception = ((Cursor) (obj3)).getString(((Cursor) (obj3)).getColumnIndex(cb[52]));
            try
            {
                ((g) (obj1)).f.a = ((Cursor) (obj3)).getString(((Cursor) (obj3)).getColumnIndex(cb[80]));
                ((g) (obj1)).h(ioexception);
                if (Integer.parseInt(((Cursor) (obj3)).getString(((Cursor) (obj3)).getColumnIndex(cb[16]))) > 0)
                {
                    ((g) (obj1)).d(ioexception);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
            ((g) (obj1)).a(ioexception);
            ((g) (obj1)).b(ioexception);
            ((g) (obj1)).g(ioexception);
            ((g) (obj1)).f(ioexception);
            ((g) (obj1)).c(ioexception);
            ((g) (obj1)).e(ioexception);
        } else
        {
            ioexception = null;
        }
        ((Cursor) (obj3)).close();
        obj3 = new o();
        try
        {
            obj2 = ((o) (obj3)).a(this, ((g) (obj1)), 2);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            Log.a(((Throwable) (obj2)));
            App.b(this, 0x7f0e0280, 0);
            obj2 = null;
        }
        if (obj2 != null) goto _L77; else goto _L76
_L76:
        try
        {
            Log.e(cb[17]);
            App.b(this, 0x7f0e044d, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (k1 == 0) goto _L78; else goto _L77
_L77:
        obj3 = new Intent(this, com/whatsapp/ViewSharedContactActivity);
        ((Intent) (obj3)).putExtra(cb[20], true);
        ((Intent) (obj3)).putExtra(cb[12], aD.a);
        ((Intent) (obj3)).putExtra(cb[8], ((String) (obj2)));
        ((Intent) (obj3)).putExtra(cb[51], ioexception);
        startActivityForResult(((Intent) (obj3)), 8);
_L78:
        if (k1 == 0) goto _L3; else goto _L15
_L15:
        if (j1 != -1) goto _L80; else goto _L79
_L79:
        if (intent == null) goto _L3; else goto _L81
_L81:
        try
        {
            ioexception = intent.getData();
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
        }
        if (ioexception == null) goto _L3; else goto _L82
_L82:
        L.a();
        a(intent.getData(), -1, 0, 0);
        if (k1 == 0) goto _L3; else goto _L80
_L80:
        if (intent == null) goto _L3; else goto _L83
_L83:
        flag1 = intent.getBooleanExtra(cb[64], true);
        if (!flag1) goto _L3; else goto _L84
_L84:
        Log.e(cb[65]);
        showDialog(7);
        if (k1 == 0) goto _L3; else goto _L14
_L14:
        if (j1 != -1 || intent == null) goto _L86; else goto _L85
_L85:
        obj2 = com.whatsapp.wallpaper.d.e(this);
        if (intent.getData() == null) goto _L88; else goto _L87
_L87:
        Log.i((new StringBuilder()).append(cb[76]).append(intent.getData().toString()).toString());
        ioexception = com.whatsapp.App.d.query(intent.getData(), null, null, null, null);
        if (ioexception == null) goto _L90; else goto _L89
_L89:
        ioexception.moveToFirst();
        i1 = ioexception.getColumnIndex(cb[66]);
        if (i1 < 0) goto _L90; else goto _L91
_L91:
        flag1 = ioexception.getString(i1).equals(cb[54]);
        if (!flag1) goto _L90; else goto _L92
_L92:
        obj3 = new android.graphics.BitmapFactory.Options();
        obj3.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(com.whatsapp.App.d.openInputStream(intent.getData()), null, ((android.graphics.BitmapFactory.Options) (obj3)));
        if (((android.graphics.BitmapFactory.Options) (obj3)).outWidth != ((Point) (obj2)).x || ((android.graphics.BitmapFactory.Options) (obj3)).outHeight != ((Point) (obj2)).y) goto _L90; else goto _L93
_L93:
        a(intent.getData(), -1, 0, 0);
        if (ioexception != null)
        {
            ioexception.close();
            return;
        }
          goto _L94
        intent;
        throw intent;
        intent;
        throw intent;
        intent;
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        throw intent;
        intent;
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        throw intent;
        intent;
        throw intent;
        intent;
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        throw intent;
        intent;
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        throw intent;
        ioexception;
        try
        {
            throw ioexception;
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception) { }
        try
        {
            throw ioexception;
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            Log.a(ioexception);
        }
        App.b(getBaseContext(), 0x7f0e03d4, 0);
        if (k1 == 0) goto _L95; else goto _L49
_L49:
        ioexception = new MediaData();
        ioexception.file = new File(intent.getStringExtra(cb[63]));
        ioexception.trimFrom = intent.getLongExtra(cb[57], 0L);
        ioexception.trimTo = intent.getLongExtra(cb[39], 0L);
        com.whatsapp.App.a(A, c1.a(((MediaData) (ioexception)).file.getAbsolutePath(), ((MediaData) (ioexception)).trimFrom * 1000L), ioexception, (byte)3, 0, intent.getStringExtra(cb[40]), null);
        ax = true;
          goto _L95
        intent;
        throw intent;
        ioexception;
        try
        {
            Log.a(ioexception);
            App.b(getBaseContext(), 0x7f0e03d4, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (k1 == 0) goto _L52; else goto _L45
_L45:
        if (j1 != -1) goto _L97; else goto _L96
_L96:
        ioexception = intent.getData();
        if (ioexception == null) goto _L99; else goto _L98
_L98:
        try
        {
            a(ioexception);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (k1 == 0) goto _L100; else goto _L99
_L99:
        ioexception = intent.getParcelableArrayListExtra(cb[37]);
        if (ioexception == null) goto _L102; else goto _L101
_L101:
        a(ioexception);
        if (k1 == 0) goto _L100; else goto _L102
_L102:
        try
        {
            Log.e(cb[68]);
            App.b(getBaseContext(), 0x7f0e03d4, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
_L100:
        if (k1 == 0) goto _L52; else goto _L97
_L97:
        try
        {
            Log.e(cb[58]);
            App.b(getBaseContext(), 0x7f0e03d4, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
          goto _L52
        intent;
        throw intent;
        ioexception;
        try
        {
            throw ioexception;
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            try
            {
                App.b(getBaseContext(), 0x7f0e03d4, 0);
                Log.a(ioexception);
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
        }
          goto _L103
        ioexception;
        throw ioexception;
        ioexception;
        throw ioexception;
        ioexception;
        throw ioexception;
_L63:
        obj2 = c1.c(this);
        if (!((File) (obj2)).exists()) goto _L105; else goto _L104
_L104:
        ioexception = Uri.fromFile(((File) (obj2)));
        c1.a(this, ioexception);
          goto _L106
_L105:
        Log.e((new StringBuilder()).append(cb[71]).append(obj2).toString());
          goto _L106
        ioexception;
        try
        {
            throw ioexception;
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception) { }
        try
        {
            throw ioexception;
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception) { }
        try
        {
            throw ioexception;
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception) { }
        throw ioexception;
        ioexception;
          goto _L107
        intent;
        throw intent;
        intent;
        if (ioexception != null)
        {
            try
            {
                ioexception.close();
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
        }
        throw intent;
        filenotfoundexception;
        Log.a(filenotfoundexception);
_L90:
        if (ioexception != null)
        {
            try
            {
                ioexception.close();
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
        }
        Log.i((new StringBuilder()).append(cb[33]).append(((Point) (obj2)).x).append(cb[35]).append(((Point) (obj2)).y).toString());
        ioexception = new Intent(this, com/whatsapp/wallpaper/CropImage);
        ioexception.putExtra(cb[47], ((Point) (obj2)).x);
        ioexception.putExtra(cb[11], ((Point) (obj2)).y);
        ioexception.putExtra(cb[46], 1);
        ioexception.putExtra(cb[81], true);
        ioexception.putExtra(cb[28], true);
        ioexception.setData(intent.getData());
        ioexception.putExtra(cb[36], com.whatsapp.wallpaper.d.a());
        ioexception.putExtra(cb[19], android.graphics.Bitmap.CompressFormat.JPEG.toString());
        startActivityForResult(ioexception, 18);
        if (k1 == 0) goto _L86; else goto _L88
_L88:
        L.a();
        i1 = intent.getIntExtra(cb[75], 0);
        if (i1 == 0) goto _L109; else goto _L108
_L108:
        Log.i((new StringBuilder()).append(cb[69]).append(i1).append(cb[74]).append(((Point) (obj2)).x).append(",").append(((Point) (obj2)).y).append("]").toString());
        a(((Uri) (null)), i1, ((Point) (obj2)).x, ((Point) (obj2)).y);
        if (k1 == 0) goto _L86; else goto _L109
_L109:
        flag2 = intent.getBooleanExtra(cb[13], false);
        if (!flag2) goto _L111; else goto _L110
_L110:
        com.whatsapp.wallpaper.d.b(this);
        a(((Drawable) (null)));
        Log.i(cb[21]);
        if (k1 == 0) goto _L86; else goto _L111
_L111:
        flag2 = intent.getBooleanExtra(cb[24], false);
        if (!flag2) goto _L113; else goto _L112
_L112:
        try
        {
            com.whatsapp.wallpaper.d.d(this);
            a(com.whatsapp.wallpaper.d.f(this));
            Log.i(cb[38]);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (k1 == 0) goto _L86; else goto _L113
_L113:
        App.b(getBaseContext(), getString(0x7f0e016e), 0);
        Log.e((new StringBuilder()).append(cb[30]).append(intent.toString()).toString());
_L86:
        try
        {
            w();
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
        }
        if (k1 == 0) goto _L3; else goto _L16
_L16:
        if (j1 != -1) goto _L3; else goto _L114
_L114:
        if (intent == null) goto _L116; else goto _L115
_L115:
        flag2 = intent.getBooleanExtra(cb[31], false);
        if (!flag2) goto _L116; else goto _L117
_L117:
        findViewById(0x7f0b0152).setVisibility(0);
        a8.setVisibility(4);
        com.whatsapp.qk.a(aD, this);
        if (k1 == 0) goto _L3; else goto _L116
_L116:
        com.whatsapp.qk.a(intent, aD, this, 20, this);
        if (k1 == 0) goto _L3; else goto _L17
_L17:
        com.whatsapp.qk.c().delete();
        if (j1 != -1) goto _L3; else goto _L118
_L118:
        if (!qk.b(aD, this)) goto _L3; else goto _L119
_L119:
        findViewById(0x7f0b0152).setVisibility(0);
        a8.setVisibility(4);
          goto _L3
        intent;
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        throw intent;
          goto _L94
    }

    public void onBackPressed()
    {
        try
        {
            a0 = true;
            if (isTaskRoot())
            {
                startActivity(new Intent(this, com.whatsapp.Main.g()));
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        super.onBackPressed();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        int i1;
        i1 = App.am;
        super.onConfigurationChanged(configuration);
        f();
        if (!w.isFullscreenMode())
        {
            break MISSING_BLOCK_LABEL_57;
        }
        int j1 = configuration.orientation;
        if (j1 != 1)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        aK.setTranscriptMode(2);
        i.sendEmptyMessageDelayed(0, 1000L);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        boolean flag = ah;
        if (flag)
        {
            int k1;
            try
            {
                aK.setTranscriptMode(2);
                i.sendEmptyMessageDelayed(1, 1000L);
            }
            // Misplaced declaration of an exception variable
            catch (Configuration configuration)
            {
                throw configuration;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_103;
            }
        }
        aK.setSelection(m);
        k1 = configuration.orientation;
        if (k1 == 1)
        {
            try
            {
                aA.a(Q);
            }
            // Misplaced declaration of an exception variable
            catch (Configuration configuration)
            {
                throw configuration;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_136;
            }
        }
        Q.setMaxLines(2);
        try
        {
            if (ac.isShowing())
            {
                ac.a(configuration);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Configuration configuration)
        {
            throw configuration;
        }
        configuration;
        try
        {
            throw configuration;
        }
        // Misplaced declaration of an exception variable
        catch (Configuration configuration) { }
        try
        {
            throw configuration;
        }
        // Misplaced declaration of an exception variable
        catch (Configuration configuration) { }
        throw configuration;
        configuration;
        throw configuration;
    }

    public void onCreate(Bundle bundle)
    {
        bz bz1;
        int i1;
        i1 = App.am;
        Log.i(cb[212]);
        App.aT();
        bz1 = new bz(cb[227]);
        boolean flag;
        try
        {
            if (App.u == 3)
            {
                com.whatsapp.util.a5.c(this);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        try
        {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            super.onCreate(bundle);
            getSupportActionBar().addOnMenuVisibilityListener(aQ);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        if (bundle != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            aH = flag;
            if (!aH)
            {
                ConversationRowVoiceNote.b();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        try
        {
            if (!WhatsAppLibLoader.a(null))
            {
                Log.i(cb[228]);
                finish();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        App.Me me;
        int j1;
        try
        {
            me = App.Z;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            try
            {
                throw bundle;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
        }
        if (me == null)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        if (!App.ah.y())
        {
            break MISSING_BLOCK_LABEL_168;
        }
        j1 = App.f(this);
        if (j1 == 3)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        Log.i(cb[220]);
        App.q(cb[224]);
        startActivity(new Intent(this, com/whatsapp/Main));
        finish();
        return;
label0:
        {
            String s1 = getIntent().getStringExtra(cb[226]);
            Object obj = s1;
            boolean flag1;
            try
            {
                if (!TextUtils.isEmpty(s1))
                {
                    break label0;
                }
                flag1 = ContactProvider.a(getIntent().getData());
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
            obj = s1;
            if (flag1)
            {
                og og1 = App.az.a(getIntent().getData());
                obj = s1;
                if (og1 != null)
                {
                    obj = og1.a;
                    getIntent().putExtra(cb[214], ((String) (obj)));
                }
            }
        }
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            break MISSING_BLOCK_LABEL_448;
        }
        obj = App.az.e(((String) (obj)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_351;
        }
        flag1 = ((og) (obj)).k();
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_342;
        }
        flag1 = ((og) (obj)).p();
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_448;
        }
        s1 = ((og) (obj)).n;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_448;
        }
        if (obj != null)
        {
            try
            {
                com.whatsapp.App.a(((og) (obj)), false, true);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
        }
        obj = getIntent().getStringExtra(cb[215]);
        if (obj != null)
        {
            try
            {
                Log.w(cb[219]);
                App.b(this, getString(0x7f0e01df, new Object[] {
                    obj
                }), 1);
                startActivity(new Intent(this, com.whatsapp.Main.g()));
                finish();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
        }
        break MISSING_BLOCK_LABEL_448;
        bundle;
        try
        {
            throw bundle;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle) { }
        try
        {
            throw bundle;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle) { }
        throw bundle;
label1:
        {
            Object obj1;
            try
            {
                if (getIntent().getBooleanExtra(cb[216], false))
                {
                    com.whatsapp.notification.l.d().c();
                }
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
            aV = true;
            setContentView(0x7f03003b);
            as = new aks(this, this, this);
            v = findViewById(0x7f0b014d);
            v.setOnClickListener(new a9y(this));
            O = (TextView)findViewById(0x7f0b014e);
            ai = (ConversationContentLayout)findViewById(0x7f0b0143);
            at = findViewById(0x7f0b0161);
            at.setBackgroundColor(-1);
            aX = findViewById(0x7f0b0146);
            aC = getWindowManager().getDefaultDisplay();
            aA = com.whatsapp.a1g.a();
            aY = (TextView)findViewById(0x7f0b0147);
            if (B)
            {
                obj1 = com.whatsapp.wallpaper.d.f(this);
                if (i1 == 0)
                {
                    break label1;
                }
            }
            obj1 = com.whatsapp.wallpaper.d.a(this, aD.a);
        }
        L = (WallPaperView)findViewById(0x7f0b0145);
        L.setOnSizeChangedListener(new yg(this));
        a(((Drawable) (obj1)));
        obj1 = cb[225];
        obj1 = App.au.getSharedPreferences(((String) (obj1)), 0);
        aJ = ((SharedPreferences) (obj1)).getBoolean(cb[213], true);
        au = ((SharedPreferences) (obj1)).getBoolean(cb[229], true);
        aK = getListView();
        aK.setDividerHeight(0);
        Q = (ConversationTextEntry)findViewById(0x7f0b0168);
        y = (ImageButton)findViewById(0x7f0b0164);
        y.setImageDrawable(new m(getResources().getDrawable(0x7f020641)));
        n = (ImageButton)findViewById(0x7f0b0167);
        S = (ImageButton)findViewById(0x7f0b0165);
        J = (ImageButton)findViewById(0x7f0b0169);
        J.setOnClickListener(new mq(this));
        J.setOnLongClickListener(new pj(this));
        obj1 = (LayoutInflater)getBaseContext().getSystemService(cb[211]);
        try
        {
            a7 = com.whatsapp.iz.a(((LayoutInflater) (obj1)), 0x7f03003d, aK, false);
            aK.addHeaderView(a7);
            a7.findViewById(0x7f0b0154).setOnClickListener(new gu(this));
            a7.findViewById(0x7f0b0155).setOnClickListener(new a8w(this));
            C = com.whatsapp.iz.a(((LayoutInflater) (obj1)), 0x7f030042, aK, false);
            aK.addHeaderView(C);
            C.findViewById(0x7f0b0174).setOnClickListener(new r8(this));
            if (!i(((String) (null))))
            {
                Log.e(cb[221]);
                finish();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        aK.setScrollbarFadingEnabled(true);
        aK.setOnScrollListener(a5);
        aK.setOnTouchListener(new ob(this));
        registerForContextMenu(aK);
        Q.setScrollbarFadingEnabled(true);
        Q.addTextChangedListener(aP);
        Q.setOnEditorActionListener(a2);
        Q.setOnClickListener(ap);
        Q.setInputEnterSend(aJ);
        com.whatsapp.iz.a(Q);
        Q.setOnKeyListener(new el(this));
        y.setOnClickListener(new as8(this));
        Object obj2 = Q.getText().toString();
        ImageButton imagebutton;
        int k1;
        boolean flag2;
        try
        {
            imagebutton = y;
            k1 = ((String) (obj2)).trim().length();
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        if (k1 > 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        try
        {
            imagebutton.setEnabled(flag2);
            n.setOnClickListener(new hx(this));
            ac = new cq(this);
            ac.a(D);
            ac.setOnDismissListener(new akc(this));
            q = new ali(this);
            q.getContentView().findViewById(0x7f0b00ae).setOnClickListener(new a_z(this));
            q.getContentView().findViewById(0x7f0b00ae).setOnLongClickListener(new v5(this));
            q.getContentView().findViewById(0x7f0b00af).setOnClickListener(new ms(this));
            q.getContentView().findViewById(0x7f0b00b0).setOnClickListener(new nd(this));
            q.getContentView().findViewById(0x7f0b00b1).setOnClickListener(new y9(this));
            q.getContentView().findViewById(0x7f0b00b2).setOnClickListener(new b3(this));
            q.getContentView().findViewById(0x7f0b00b3).setOnClickListener(new x4(this));
            aA.a(Q);
            s = findViewById(0x7f0b014b);
            if (s != null)
            {
                s.setVisibility(8);
                s.setOnClickListener(new eq(this));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        try
        {
            aw = findViewById(0x7f0b014a);
            if (aw != null)
            {
                aw.setVisibility(8);
                aw.setOnClickListener(new ad4(this));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        com.whatsapp.util.y.a(A);
        App.b(this);
        com.whatsapp.App.a(this);
        flag2 = App.au.aa();
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_1579;
        }
        Log.w(cb[222]);
        com.whatsapp.Conversations.a(this, 113);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_1632;
        }
        flag2 = App.aU();
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_1610;
        }
        Log.w(cb[218]);
        com.whatsapp.Conversations.a(this, 114);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_1632;
        }
        try
        {
            if (App.a3())
            {
                Log.w(cb[217]);
                showDialog(115);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        if (bundle != null)
        {
            bundle = bundle.getParcelableArrayList(cb[223]);
            if (bundle != null)
            {
                Z = new HashMap();
                bundle = bundle.iterator();
                do
                {
                    if (!bundle.hasNext())
                    {
                        break;
                    }
                    obj2 = (a88)(Parcelable)bundle.next();
                    Z.put(((a88) (obj2)).a, App.ah.a(((a88) (obj2)).a));
                } while (i1 == 0);
                m();
                s();
            }
        }
        bz1.a();
        com.whatsapp.util.x.a(new w1(this));
        return;
        bundle;
        try
        {
            throw bundle;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle) { }
        try
        {
            throw bundle;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle) { }
        try
        {
            throw bundle;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle) { }
        throw bundle;
    }

    public Dialog onCreateDialog(int i1)
    {
label0:
        {
            try
            {
                if (!c())
                {
                    break label0;
                }
                as.a(i1);
            }
            catch (ActivityNotFoundException activitynotfoundexception)
            {
                throw activitynotfoundexception;
            }
            return null;
        }
        i1;
        JVM INSTR lookupswitch 26: default 240
    //                   0: 246
    //                   1: 287
    //                   2: 328
    //                   7: 847
    //                   8: 889
    //                   9: 931
    //                   10: 987
    //                   11: 1033
    //                   12: 1104
    //                   13: 1146
    //                   15: 1255
    //                   101: 377
    //                   102: 425
    //                   103: 610
    //                   104: 680
    //                   106: 750
    //                   107: 815
    //                   111: 495
    //                   112: 562
    //                   115: 1089
    //                   116: 368
    //                   117: 1383
    //                   118: 1398
    //                   119: 1367
    //                   120: 1352
    //                   121: 1337;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27
_L1:
        return super.onCreateDialog(i1);
_L2:
        ib ib1 = new ib(this);
        return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e0120).setPositiveButton(0x7f0e02ba, ib1).setNeutralButton(0x7f0e007b, null).create();
_L3:
        m4 m4_1 = new m4(this);
        return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e005c).setPositiveButton(0x7f0e02ba, m4_1).setNeutralButton(0x7f0e007b, null).create();
_L4:
        com.whatsapp.x x1 = new com.whatsapp.x(this);
        return (new android.app.AlertDialog.Builder(this)).setTitle(0x7f0e01a9).setMessage(0x7f0e01a8).setPositiveButton(0x7f0e02ba, x1).create();
_L22:
        return com.whatsapp.all.a(this, aF);
_L13:
        Log.w(cb[251]);
        return (new android.app.AlertDialog.Builder(this)).setTitle(0x7f0e013c).setMessage(0x7f0e044c).setNeutralButton(0x7f0e02ba, new w_(this)).create();
_L14:
        android.app.AlertDialog.Builder builder;
        boolean flag;
        try
        {
            Log.w(cb[250]);
            builder = (new android.app.AlertDialog.Builder(this)).setTitle(0x7f0e013c);
            flag = com.whatsapp.App.m();
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
        if (flag)
        {
            i1 = 0x7f0e020d;
        } else
        {
            i1 = 0x7f0e020e;
        }
        return builder.setMessage(i1).setNeutralButton(0x7f0e02ba, new al6(this)).create();
_L19:
        Log.w(cb[241]);
        return (new android.app.AlertDialog.Builder(this)).setTitle(0x7f0e013c).setMessage(getString(0x7f0e044a, new Object[] {
            aD.a(this)
        })).setNeutralButton(0x7f0e02ba, new ml(this)).create();
_L20:
        Log.w(cb[240]);
        return (new android.app.AlertDialog.Builder(this)).setTitle(0x7f0e013c).setMessage(0x7f0e0212).setNeutralButton(0x7f0e02ba, new cy(this)).create();
_L15:
        android.app.AlertDialog.Builder builder1;
        boolean flag1;
        try
        {
            Log.w(cb[238]);
            builder1 = (new android.app.AlertDialog.Builder(this)).setTitle(0x7f0e013c);
            flag1 = com.whatsapp.App.m();
        }
        catch (ActivityNotFoundException activitynotfoundexception2)
        {
            throw activitynotfoundexception2;
        }
        if (flag1)
        {
            i1 = 0x7f0e00eb;
        } else
        {
            i1 = 0x7f0e00ec;
        }
        return builder1.setMessage(i1).setNeutralButton(0x7f0e02ba, new vm(this)).create();
_L16:
        android.app.AlertDialog.Builder builder2;
        boolean flag2;
        try
        {
            Log.w(cb[244]);
            builder2 = (new android.app.AlertDialog.Builder(this)).setTitle(0x7f0e013c);
            flag2 = com.whatsapp.App.m();
        }
        catch (ActivityNotFoundException activitynotfoundexception3)
        {
            throw activitynotfoundexception3;
        }
        if (flag2)
        {
            i1 = 0x7f0e00ed;
        } else
        {
            i1 = 0x7f0e00ee;
        }
        return builder2.setMessage(i1).setNeutralButton(0x7f0e02ba, new is(this)).create();
_L17:
        return (new android.app.AlertDialog.Builder(this)).setMessage(getString(0x7f0e007e, new Object[] {
            aD.a(this)
        })).setPositiveButton(0x7f0e0453, new j9(this)).setNegativeButton(0x7f0e007b, new ca(this)).create();
_L18:
        ProgressDialog progressdialog = new ProgressDialog(this);
        progressdialog.setMessage(getString(0x7f0e0353));
        progressdialog.setIndeterminate(true);
        progressdialog.setCancelable(false);
        return progressdialog;
_L5:
        Log.w(cb[255]);
        return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e0163).setNeutralButton(0x7f0e02ba, new m6(this)).create();
_L6:
        Log.e(cb[246]);
        return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e0159).setNeutralButton(0x7f0e02ba, new a4(this)).create();
_L7:
        Log.i(cb[239]);
        return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e006e).setPositiveButton(0x7f0e006c, new a3l(this)).setNegativeButton(0x7f0e007b, new o8(this)).create();
_L8:
        return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e0146).setPositiveButton(0x7f0e0053, new a1y(this)).setNeutralButton(0x7f0e04b4, new auw(this)).create();
_L9:
        Log.i(cb[252]);
        return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e0027).setPositiveButton(0x7f0e029e, new com.whatsapp.p(this)).setNegativeButton(0x7f0e0175, new rz(this)).create();
_L21:
        Log.i(cb[253]);
        return com.whatsapp.m7.a(this);
_L10:
        Log.w(cb[243]);
        return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e0022).setNeutralButton(0x7f0e02ba, new abm(this)).create();
_L11:
        HashMap hashmap;
        try
        {
            hashmap = Z;
        }
        catch (ActivityNotFoundException activitynotfoundexception4)
        {
            try
            {
                throw activitynotfoundexception4;
            }
            catch (ActivityNotFoundException activitynotfoundexception5)
            {
                throw activitynotfoundexception5;
            }
        }
        if (hashmap == null) goto _L29; else goto _L28
_L28:
        if (!Z.isEmpty()) goto _L30; else goto _L29
_L29:
        Log.e(cb[242]);
        return super.onCreateDialog(i1);
_L30:
        Log.i((new StringBuilder()).append(cb[249]).append(Z.size()).toString());
        HashMap hashmap1 = Z;
        return com.whatsapp.zj.a(this, Z.values(), aD.a, 13, new pl(this, hashmap1));
_L12:
        android.app.AlertDialog.Builder builder3;
        boolean flag3;
        try
        {
            builder3 = new android.app.AlertDialog.Builder(this);
            flag3 = com.whatsapp.App.m();
        }
        catch (ActivityNotFoundException activitynotfoundexception6)
        {
            throw activitynotfoundexception6;
        }
        if (flag3)
        {
            i1 = 0x7f0e030c;
        } else
        {
            i1 = 0x7f0e030d;
        }
        try
        {
            builder3 = builder3.setTitle(i1);
            flag3 = com.whatsapp.App.m();
        }
        catch (ActivityNotFoundException activitynotfoundexception7)
        {
            throw activitynotfoundexception7;
        }
        if (flag3)
        {
            i1 = 0x7f0e030a;
        } else
        {
            i1 = 0x7f0e030b;
        }
        return builder3.setMessage(i1).setNeutralButton(0x7f0e02ba, new a1l(this)).create();
_L27:
        Log.w(cb[248]);
        return com.whatsapp.all.a(this);
_L26:
        Log.w(cb[256]);
        return all.e(this);
_L25:
        Log.w(cb[245]);
        return com.whatsapp.all.a(this, false);
_L23:
        Log.w(cb[247]);
        return com.whatsapp.all.c(this);
_L24:
        Log.w(cb[254]);
        return all.f(this);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        int i1 = App.am;
        og og1;
        Log.i(cb[261]);
        og1 = aD;
        if (og1 == null)
        {
            break MISSING_BLOCK_LABEL_712;
        }
        boolean flag = k;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_222;
        }
        j = b(menu, 15, 0x7f0e004f, 0x7f0204fe);
        b(menu, 9, 0x7f0e01dc, 0x7f020543);
        aM = b(menu, 12, 0x7f0e0480, 0x7f020544);
        b(menu, 14, 0x7f0e0366, 0x7f02054e);
        flag = com.whatsapp.notification.p.b(this, A);
        if (!flag)
        {
            Object obj;
            boolean flag1;
            try
            {
                b(menu, 10, 0x7f0e0242, 0x7f020546);
            }
            // Misplaced declaration of an exception variable
            catch (Menu menu)
            {
                throw menu;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_143;
            }
        }
        b(menu, 10, 0x7f0e0243, 0x7f020547);
        b(menu, 11, 0x7f0e049c, 0x7f020554);
        obj = a(menu, 3, 0x7f0e0263, 0x7f020545);
        try
        {
            b(((Menu) (obj)), 7, 0x7f0e011f, 0x7f02053f);
            b(((Menu) (obj)), 8, 0x7f0e0144, 0x7f020550);
            if (!com.whatsapp.App.a())
            {
                b(((Menu) (obj)), 6, 0x7f0e002f, 0x7f020551);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Menu menu)
        {
            throw menu;
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_626;
        }
        try
        {
            flag1 = G;
        }
        // Misplaced declaration of an exception variable
        catch (Menu menu)
        {
            throw menu;
        }
        if (flag1)
        {
            j = b(menu, 15, 0x7f0e004f, 0x7f0204fe);
            b(menu, 9, 0x7f0e021d, 0x7f020543);
            aM = b(menu, 12, 0x7f0e0482, 0x7f020544);
            b(menu, 14, 0x7f0e0366, 0x7f02054e);
            b(menu, 11, 0x7f0e049c, 0x7f020554);
            obj = a(menu, 3, 0x7f0e0263, 0x7f020545);
            try
            {
                b(((Menu) (obj)), 7, 0x7f0e011f, 0x7f02053f);
                b(((Menu) (obj)), 8, 0x7f0e0144, 0x7f020550);
                if (!com.whatsapp.App.a())
                {
                    b(((Menu) (obj)), 6, 0x7f0e002f, 0x7f020551);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Menu menu)
            {
                throw menu;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_626;
            }
        }
        flag1 = App.aq();
        if (flag1)
        {
            try
            {
                aa = b(menu, 16, 0x7f0e006c, 0x7f020501);
                aa.setShowAsAction(2);
                j = b(menu, 15, 0x7f0e004f, 0x7f0204ff);
            }
            // Misplaced declaration of an exception variable
            catch (Menu menu)
            {
                throw menu;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_465;
            }
        }
        aa = b(menu, 0, 0x7f0e006c, 0x7f020539);
        j = b(menu, 15, 0x7f0e004f, 0x7f0204fe);
        b(menu, 1, 0x7f0e047b, 0x7f02053c);
        aM = b(menu, 12, 0x7f0e047f, 0x7f020544);
        b(menu, 14, 0x7f0e0366, 0x7f02054e);
        b(menu, 11, 0x7f0e049c, 0x7f020554);
        obj = a(menu, 3, 0x7f0e0263, 0x7f020545);
        try
        {
            ((SubMenu) (obj)).clearHeader();
            if (aD.z == null)
            {
                b(((Menu) (obj)), 5, 0x7f0e0029, 0x1080033);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Menu menu)
        {
            throw menu;
        }
        try
        {
            b(((Menu) (obj)), 4, 0x7f0e005b, 0x7f020537);
            b(((Menu) (obj)), 7, 0x7f0e011f, 0x7f02053f);
            b(((Menu) (obj)), 8, 0x7f0e0144, 0x7f020550);
            if (!com.whatsapp.App.a())
            {
                b(((Menu) (obj)), 6, 0x7f0e002f, 0x7f020551);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Menu menu)
        {
            throw menu;
        }
        j.setShowAsAction(2);
        flag1 = k;
        if (flag1)
        {
            try
            {
                if (!com.whatsapp.mk.c(aD.a))
                {
                    j.setVisible(false);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Menu menu)
            {
                throw menu;
            }
        }
        obj = an;
        if (obj != null)
        {
            try
            {
                aM.setEnabled(an.booleanValue());
            }
            // Misplaced declaration of an exception variable
            catch (Menu menu)
            {
                throw menu;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_712;
            }
        }
        aM.setEnabled(false);
        return super.onCreateOptionsMenu(menu);
        menu;
        try
        {
            throw menu;
        }
        // Misplaced declaration of an exception variable
        catch (Menu menu) { }
        try
        {
            throw menu;
        }
        // Misplaced declaration of an exception variable
        catch (Menu menu) { }
        throw menu;
        menu;
        throw menu;
        menu;
        throw menu;
        menu;
        throw menu;
    }

    public void onDestroy()
    {
        int i1 = App.am;
        Object obj;
        Dialog dialog;
        try
        {
            Log.i(cb[260]);
            super.onDestroy();
            if (as != null)
            {
                as.b(false);
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        try
        {
            getSupportActionBar().removeOnMenuVisibilityListener(aQ);
            if (aE)
            {
                App.ah.b(a6);
                aE = false;
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
        a0 = true;
        obj = U;
        ActivityNotFoundException activitynotfoundexception2;
        if (obj != null)
        {
            try
            {
                if (aW != null)
                {
                    U.unregisterDataSetObserver(aW);
                }
            }
            catch (ActivityNotFoundException activitynotfoundexception3)
            {
                throw activitynotfoundexception3;
            }
        }
        try
        {
            J(this);
            q(this);
            if (V != null)
            {
                V.close();
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception4)
        {
            throw activitynotfoundexception4;
        }
        try
        {
            if (aO != null)
            {
                aO.cancel(true);
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception5)
        {
            throw activitynotfoundexception5;
        }
        obj = A;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        ActivityNotFoundException activitynotfoundexception6;
        try
        {
            obj = T;
        }
        catch (ActivityNotFoundException activitynotfoundexception7)
        {
            try
            {
                throw activitynotfoundexception7;
            }
            catch (ActivityNotFoundException activitynotfoundexception8)
            {
                throw activitynotfoundexception8;
            }
        }
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        if (Y)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        App.ah.f(A);
        obj = p.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            dialog = (Dialog)((Iterator) (obj)).next();
            try
            {
                if (dialog.isShowing())
                {
                    dialog.dismiss();
                }
            }
            catch (ActivityNotFoundException activitynotfoundexception9)
            {
                throw activitynotfoundexception9;
            }
        } while (i1 == 0);
        try
        {
            p.clear();
            com.whatsapp.App.a(this);
            App.b(this);
            if (ak != null)
            {
                ak.a();
                ak = null;
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception10)
        {
            throw activitynotfoundexception10;
        }
        com.whatsapp.util.y.c(A);
        akr.t();
        App.aT();
        return;
        activitynotfoundexception2;
        throw activitynotfoundexception2;
        activitynotfoundexception6;
        throw activitynotfoundexception6;
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        boolean flag;
        try
        {
            flag = keyevent.isPrintingKey();
        }
        // Misplaced declaration of an exception variable
        catch (KeyEvent keyevent)
        {
            try
            {
                throw keyevent;
            }
            // Misplaced declaration of an exception variable
            catch (KeyEvent keyevent) { }
            try
            {
                throw keyevent;
            }
            // Misplaced declaration of an exception variable
            catch (KeyEvent keyevent)
            {
                throw keyevent;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        flag = Q.isShown();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        if (Q.hasFocus())
        {
            break MISSING_BLOCK_LABEL_119;
        }
        Q.requestFocus();
        dispatchKeyEvent(keyevent);
        return true;
        if (i1 != 82)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        MenuItem menuitem = aM;
        if (menuitem != null)
        {
            try
            {
                if (an == null)
                {
                    an = Boolean.valueOf(App.ah.a(aD.a));
                }
            }
            // Misplaced declaration of an exception variable
            catch (KeyEvent keyevent)
            {
                throw keyevent;
            }
            aM.setEnabled(an.booleanValue());
        }
        return super.onKeyDown(i1, keyevent);
        keyevent;
        throw keyevent;
    }

    public boolean onKeyUp(int i1, KeyEvent keyevent)
    {
label0:
        {
            if (i1 != 82 && i1 != 4)
            {
                break label0;
            }
            try
            {
                if (!ac.isShowing())
                {
                    break label0;
                }
                ac.a(false);
                ac.dismiss();
            }
            // Misplaced declaration of an exception variable
            catch (KeyEvent keyevent)
            {
                throw keyevent;
            }
            return false;
        }
        return super.onKeyUp(i1, keyevent);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        int j1 = App.am;
        int i1 = menuitem.getItemId();
        i1;
        JVM INSTR tableswitch 0 16: default 96
    //                   0 98
    //                   1 147
    //                   2 96
    //                   3 96
    //                   4 211
    //                   5 191
    //                   6 466
    //                   7 276
    //                   8 341
    //                   9 478
    //                   10 519
    //                   11 739
    //                   12 1177
    //                   13 96
    //                   14 283
    //                   15 290
    //                   16 1219;
           goto _L1 _L2 _L3 _L1 _L1 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L1 _L13 _L14 _L15
_L1:
        return false;
_L2:
        boolean flag = G();
        if (!flag) goto _L17; else goto _L16
_L16:
        try
        {
            g(aD.a());
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            throw menuitem;
        }
        if (j1 == 0) goto _L18; else goto _L17
_L17:
        d(true);
        showDialog(9);
_L18:
        return true;
        menuitem;
        try
        {
            throw menuitem;
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem) { }
        throw menuitem;
_L3:
        flag = ag;
        if (!flag) goto _L20; else goto _L19
_L19:
        try
        {
            W = false;
            showDialog(11);
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            throw menuitem;
        }
        if (j1 == 0) goto _L21; else goto _L20
_L20:
        com.whatsapp.ContactInfo.a(aD, this);
          goto _L21
        menuitem;
        throw menuitem;
_L5:
        b(aD.a(this), true);
        W = false;
        return true;
_L4:
        flag = ay;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_232;
        }
        showDialog(1);
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_262;
        }
        flag = App.i();
        if (!flag)
        {
            try
            {
                App.b(getBaseContext(), 0x7f0e02ad, 0);
            }
            // Misplaced declaration of an exception variable
            catch (MenuItem menuitem)
            {
                throw menuitem;
            }
            if (j1 == 0)
            {
                break MISSING_BLOCK_LABEL_262;
            }
        }
        E();
        return true;
        menuitem;
        try
        {
            throw menuitem;
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem) { }
        try
        {
            throw menuitem;
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem) { }
        throw menuitem;
_L7:
        showDialog(0);
        return true;
_L13:
        onSearchRequested();
        return true;
_L14:
        flag = App.C(aD.a);
        if (!flag) goto _L23; else goto _L22
_L22:
        try
        {
            showDialog(106);
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            throw menuitem;
        }
        if (j1 == 0) goto _L24; else goto _L23
_L23:
        q.a(findViewById(0x7f0b0144));
          goto _L24
        menuitem;
        throw menuitem;
_L8:
        flag = App.ae;
        if (flag) goto _L26; else goto _L25
_L25:
        flag = App.aC;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_397;
        }
_L26:
        try
        {
            Log.w(cb[155]);
            flag = com.whatsapp.App.m();
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            throw menuitem;
        }
        if (flag)
        {
            i1 = 0x7f0e0287;
        } else
        {
            i1 = 0x7f0e0288;
        }
        a(i1);
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_438;
        }
        flag = App.ah.a(aD.a);
        if (flag)
        {
            try
            {
                showDialog(10);
            }
            // Misplaced declaration of an exception variable
            catch (MenuItem menuitem)
            {
                throw menuitem;
            }
            if (j1 == 0)
            {
                break MISSING_BLOCK_LABEL_438;
            }
        }
        a(this, this, aD, false);
        return true;
        menuitem;
        try
        {
            throw menuitem;
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem) { }
        throw menuitem;
        menuitem;
        try
        {
            throw menuitem;
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem) { }
        throw menuitem;
_L6:
        App.az.g(aD);
        return true;
_L9:
        flag = G;
        if (!flag) goto _L28; else goto _L27
_L27:
        try
        {
            com.whatsapp.ListChatInfo.a(aD, this);
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            throw menuitem;
        }
        if (j1 == 0) goto _L29; else goto _L28
_L28:
        com.whatsapp.GroupChatInfo.a(aD, this);
          goto _L29
        menuitem;
        throw menuitem;
_L10:
        if (!com.whatsapp.notification.p.b(this, A)) goto _L31; else goto _L30
_L30:
        com.whatsapp.notification.p.d(this, A);
        if (j1 == 0) goto _L32; else goto _L31
_L31:
        int ai1[];
        android.app.AlertDialog.Builder builder;
        View view;
        CheckBox checkbox;
        int ai2[];
        menuitem = getResources().getStringArray(0x7f07000c);
        ai1 = getResources().getIntArray(0x7f07000d);
        builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle(getString(0x7f0e0285));
        view = com.whatsapp.iz.a(getLayoutInflater(), 0x7f03008e, null, false);
        checkbox = (CheckBox)view.findViewById(0x7f0b0254);
        ai2 = new int[1];
        ai2[0] = App.au.getSharedPreferences(cb[154], 0).getInt(cb[164], 0);
        if (ai2[0] >= menuitem.length)
        {
            ai2[0] = 0;
        }
        builder.setSingleChoiceItems(menuitem, ai2[0], new au0(this, ai2)).setPositiveButton(0x7f0e02ba, new w(this, ai2, ai1, checkbox)).setNegativeButton(0x7f0e007b, new eh(this));
        builder.setView(view);
        a(builder.create());
_L32:
        return true;
        menuitem;
        throw menuitem;
        menuitem;
        throw menuitem;
_L11:
        Object obj;
        Object obj1;
        Intent intent;
        int k1;
        boolean flag1;
        try
        {
            if (z == null)
            {
                z = WallpaperManager.getInstance(this);
            }
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            throw menuitem;
        }
        menuitem = new Rect();
        aK.getDrawingRect(menuitem);
        Log.i((new StringBuilder()).append(L.getWidth()).append(cb[157]).append(L.getHeight()).toString());
        menuitem = new Intent(cb[153], null);
        menuitem.setType(cb[162]);
        obj = getPackageManager().queryIntentActivities(menuitem, 0);
        k1 = ((List) (obj)).size();
        i1 = 0;
_L40:
        if (i1 >= k1) goto _L34; else goto _L33
_L33:
        obj1 = ((ResolveInfo)((List) (obj)).get(i1)).activityInfo;
        Log.i((new StringBuilder()).append(((ActivityInfo) (obj1)).applicationInfo.packageName).append(cb[160]).append(((ActivityInfo) (obj1)).name).toString());
        flag1 = ((ActivityInfo) (obj1)).name.contains(cb[151]);
        if (!flag1) goto _L36; else goto _L35
_L35:
        flag1 = ((ActivityInfo) (obj1)).name.contains(cb[156]);
        if (flag1) goto _L37; else goto _L36
_L36:
        flag1 = ((ActivityInfo) (obj1)).name.contains(cb[152]);
        if (!flag1) goto _L38; else goto _L37
_L37:
        try
        {
            menuitem.setComponent(new ComponentName(((ActivityInfo) (obj1)).applicationInfo.packageName, ((ActivityInfo) (obj1)).name));
            menuitem.putExtra(cb[161], getResources().getConfiguration().orientation);
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            throw menuitem;
        }
        if (j1 == 0) goto _L34; else goto _L38
_L38:
        if (j1 == 0) goto _L39; else goto _L34
_L34:
        obj = new Intent(cb[163], null);
        ((Intent) (obj)).putExtra(cb[165], getResources().getConfiguration().orientation);
        obj1 = new Intent(cb[158], null);
        intent = Intent.createChooser(new Intent(cb[159], null), getString(0x7f0e02e6));
        intent.putExtra(cb[167], new Parcelable[] {
            menuitem, obj, obj1
        });
        startActivityForResult(intent, 17);
        return true;
        menuitem;
        try
        {
            throw menuitem;
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem) { }
        try
        {
            throw menuitem;
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem) { }
        throw menuitem;
_L12:
        menuitem = new Intent(this, com/whatsapp/MediaGallery);
        menuitem.putExtra(cb[166], aD.a);
        startActivity(menuitem);
        a0 = true;
        return true;
_L15:
        App.b(aD, this);
        return true;
_L39:
        i1++;
        if (true) goto _L40; else goto _L21
_L21:
        return true;
_L24:
        return true;
_L29:
        return true;
    }

    public void onPause()
    {
        Handler handler;
        int i1;
        boolean flag;
        try
        {
            Log.i(cb[196]);
            super.onPause();
            if (as != null)
            {
                as.b(false);
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        aR.put(aD.a, Q.getText().toString());
        H = true;
        handler = t;
        if (handler == null)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        flag = t.hasMessages(0);
        if (flag)
        {
            try
            {
                t.removeMessages(0);
                if (((PowerManager)getSystemService(cb[197])).isScreenOn())
                {
                    t.sendEmptyMessage(0);
                }
            }
            catch (ActivityNotFoundException activitynotfoundexception2)
            {
                throw activitynotfoundexception2;
            }
        }
        try
        {
            i1 = aK.getHeight();
        }
        catch (ActivityNotFoundException activitynotfoundexception3)
        {
            try
            {
                throw activitynotfoundexception3;
            }
            catch (ActivityNotFoundException activitynotfoundexception4)
            {
                throw activitynotfoundexception4;
            }
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        if (aK.getLastVisiblePosition() != aK.getCount() - 1)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        am = true;
        i1 = App.am;
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        ao = aK.getFirstVisiblePosition();
        View view = aK.getChildAt(0);
        ActivityNotFoundException activitynotfoundexception1;
        try
        {
            x = 0;
        }
        catch (ActivityNotFoundException activitynotfoundexception5)
        {
            throw activitynotfoundexception5;
        }
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        x = view.getTop();
        am = false;
        h();
        return;
        activitynotfoundexception1;
        throw activitynotfoundexception1;
        activitynotfoundexception1;
        throw activitynotfoundexception1;
    }

    protected void onPrepareDialog(int i1, Dialog dialog)
    {
        int j1 = App.am;
        i1;
        JVM INSTR tableswitch 117 121: default 40
    //                   117 62
    //                   118 77
    //                   119 92
    //                   120 40
    //                   121 47;
           goto _L1 _L2 _L3 _L4 _L1 _L5
_L1:
        super.onPrepareDialog(i1, dialog);
_L6:
        return;
_L5:
        ((AlertDialog)dialog).setMessage(com.whatsapp.all.d());
        if (j1 == 0) goto _L6; else goto _L2
_L2:
        ((AlertDialog)dialog).setMessage(com.whatsapp.all.a());
        if (j1 == 0) goto _L6; else goto _L3
_L3:
        ((AlertDialog)dialog).setMessage(com.whatsapp.all.c());
        if (j1 == 0) goto _L6; else goto _L4
_L4:
        AlertDialog alertdialog = (AlertDialog)dialog;
        try
        {
            alertdialog.setMessage(all.b());
        }
        // Misplaced declaration of an exception variable
        catch (Dialog dialog)
        {
            throw dialog;
        }
        if (j1 == 0) goto _L6; else goto _L1
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        int i1 = App.am;
        Object obj;
        Object obj1;
        int j1;
        boolean flag;
        try
        {
            Log.i(cb[262]);
            obj = aD;
        }
        // Misplaced declaration of an exception variable
        catch (Menu menu)
        {
            try
            {
                throw menu;
            }
            // Misplaced declaration of an exception variable
            catch (Menu menu)
            {
                throw menu;
            }
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_444;
        }
        if (k)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        flag = G;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        obj = menu.findItem(1);
        obj1 = aD.z;
        if (obj1 != null)
        {
            try
            {
                ag = false;
                ((MenuItem) (obj)).setTitle(0x7f0e047b);
                ((MenuItem) (obj)).setIcon(0x7f02053c);
            }
            // Misplaced declaration of an exception variable
            catch (Menu menu)
            {
                throw menu;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_117;
            }
        }
        ag = true;
        ((MenuItem) (obj)).setTitle(0x7f0e0026);
        ((MenuItem) (obj)).setIcon(0x7f020535);
label0:
        {
            obj = menu.findItem(4);
            if (App.C(aD.a))
            {
                ay = false;
                ((MenuItem) (obj)).setTitle(getString(0x7f0e0453));
                ((MenuItem) (obj)).setIcon(0x1080033);
                if (i1 == 0)
                {
                    break label0;
                }
            }
            ay = true;
            ((MenuItem) (obj)).setTitle(getString(0x7f0e005b));
            ((MenuItem) (obj)).setIcon(0x7f020537);
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_286;
        }
        try
        {
            flag = k;
        }
        // Misplaced declaration of an exception variable
        catch (Menu menu)
        {
            throw menu;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_286;
        }
        obj = menu.findItem(10);
        flag = com.whatsapp.notification.p.b(this, A);
        if (flag)
        {
            try
            {
                ((MenuItem) (obj)).setTitle(0x7f0e0243);
                ((MenuItem) (obj)).setIcon(0x7f020547);
            }
            // Misplaced declaration of an exception variable
            catch (Menu menu)
            {
                throw menu;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_286;
            }
        }
        ((MenuItem) (obj)).setTitle(0x7f0e0242);
        ((MenuItem) (obj)).setIcon(0x7f020546);
        j1 = U.getCount();
        if (j1 > 0)
        {
            try
            {
                menu.findItem(7).setVisible(true);
                menu.findItem(8).setVisible(true);
                menu.findItem(14).setVisible(true);
            }
            // Misplaced declaration of an exception variable
            catch (Menu menu)
            {
                throw menu;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_395;
            }
        }
        menu.findItem(7).setVisible(false);
        menu.findItem(8).setVisible(false);
        menu.findItem(14).setVisible(false);
        obj = menu.findItem(3);
        obj1 = ((MenuItem) (obj)).getSubMenu();
        flag = ((SubMenu) (obj1)).hasVisibleItems();
        if (flag)
        {
            try
            {
                ((MenuItem) (obj)).setVisible(true);
            }
            // Misplaced declaration of an exception variable
            catch (Menu menu)
            {
                throw menu;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_444;
            }
        }
        ((MenuItem) (obj)).setVisible(false);
        return super.onPrepareOptionsMenu(menu);
        menu;
        throw menu;
        menu;
        throw menu;
        menu;
        throw menu;
        menu;
        throw menu;
    }

    public void onResume()
    {
label0:
        {
label1:
            {
                int i1 = App.am;
                Log.i((new StringBuilder()).append(cb[100]).append(aD.a).toString());
                bz bz1 = new bz(cb[101]);
                Drawable drawable;
                int j1;
                boolean flag;
                try
                {
                    super.onResume();
                    com.whatsapp.notification.p.a();
                    if (!d.a)
                    {
                        break label0;
                    }
                    flag = B;
                }
                catch (IllegalStateException illegalstateexception)
                {
                    throw illegalstateexception;
                }
                if (flag)
                {
                    drawable = com.whatsapp.wallpaper.d.f(this);
                    if (i1 == 0)
                    {
                        break label1;
                    }
                }
                drawable = com.whatsapp.wallpaper.d.a(this, aD.a);
            }
            if (drawable != null)
            {
                try
                {
                    a(drawable);
                }
                catch (IllegalStateException illegalstateexception1)
                {
                    throw illegalstateexception1;
                }
            }
            d.a = false;
        }
        try
        {
            if (!ChangeNumber.f())
            {
                e(false);
            }
        }
        catch (IllegalStateException illegalstateexception2)
        {
            throw illegalstateexception2;
        }
        try
        {
            aD = com.whatsapp.u5.d(aD.a);
            com.whatsapp.App.a(aD, false, true);
            o();
            if (!aD.k())
            {
                com.whatsapp.App.a(aD);
            }
        }
        catch (IllegalStateException illegalstateexception3)
        {
            throw illegalstateexception3;
        }
        try
        {
            if (a7 != null)
            {
                H();
            }
        }
        catch (IllegalStateException illegalstateexception4)
        {
            throw illegalstateexception4;
        }
        if (!aS)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        flag = aV;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        flag = a1;
        if (!flag)
        {
            try
            {
                com.whatsapp.notification.a1.c().b();
            }
            // Misplaced declaration of an exception variable
            catch (IllegalStateException illegalstateexception5)
            {
                throw illegalstateexception5;
            }
        }
        try
        {
            aS = false;
            if (av.remove(aD.a))
            {
                showDialog(2);
            }
        }
        // Misplaced declaration of an exception variable
        catch (IllegalStateException illegalstateexception5)
        {
            throw illegalstateexception5;
        }
        try
        {
            App.k.stop();
        }
        // Misplaced declaration of an exception variable
        catch (IllegalStateException illegalstateexception5)
        {
            Log.e(cb[99]);
        }
        aK.setFastScrollEnabled(false);
        flag = aV;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_268;
        }
        aV = false;
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_300;
        }
        try
        {
            if (a1)
            {
                t = new a2(this, null);
                t.sendEmptyMessageDelayed(0, 3000L);
            }
        }
        // Misplaced declaration of an exception variable
        catch (IllegalStateException illegalstateexception5)
        {
            throw illegalstateexception5;
        }
        if (!P)
        {
            break MISSING_BLOCK_LABEL_357;
        }
        j1 = (aC.getHeight() - getResources().getDimensionPixelSize(0x7f0a003d) * 2) / 4;
        aK.post(new lj(this, j1));
        F = true;
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_424;
        }
        flag = E;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_390;
        }
        aK.setSelection(0);
        F = true;
        P = true;
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_424;
        }
        flag = am;
        if (flag)
        {
            IllegalStateException illegalstateexception5;
            try
            {
                w();
            }
            catch (IllegalStateException illegalstateexception6)
            {
                throw illegalstateexception6;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_424;
            }
        }
        aK.setSelectionFromTop(ao, x);
        I.setSelected(true);
        j1 = U.getCount();
        if (j1 == 0)
        {
            IllegalStateException illegalstateexception7;
            try
            {
                aN.sendEmptyMessageDelayed(0, 100L);
            }
            catch (IllegalStateException illegalstateexception8)
            {
                throw illegalstateexception8;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_474;
            }
        }
        aN.sendEmptyMessageDelayed(1, 100L);
        flag = af;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_508;
        }
        aK.postDelayed(new a_w(this), 500L);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_534;
        }
        IllegalStateException illegalstateexception9;
        try
        {
            if (bb != null)
            {
                aK.postDelayed(new jq(this), 500L);
            }
        }
        catch (IllegalStateException illegalstateexception10)
        {
            throw illegalstateexception10;
        }
        try
        {
            if (App.a3())
            {
                showDialog(115);
            }
        }
        catch (IllegalStateException illegalstateexception11)
        {
            throw illegalstateexception11;
        }
        try
        {
            if (com.whatsapp.App.x())
            {
                showDialog(110);
            }
        }
        catch (IllegalStateException illegalstateexception12)
        {
            throw illegalstateexception12;
        }
        try
        {
            if (Voip.h())
            {
                g();
            }
        }
        catch (IllegalStateException illegalstateexception13)
        {
            throw illegalstateexception13;
        }
        bz1.a();
        return;
        illegalstateexception5;
        throw illegalstateexception5;
        illegalstateexception5;
        throw illegalstateexception5;
        illegalstateexception5;
        throw illegalstateexception5;
        illegalstateexception5;
        throw illegalstateexception5;
        illegalstateexception5;
        throw illegalstateexception5;
        illegalstateexception5;
        throw illegalstateexception5;
        illegalstateexception5;
        throw illegalstateexception5;
        illegalstateexception5;
        throw illegalstateexception5;
        illegalstateexception7;
        throw illegalstateexception7;
        illegalstateexception9;
        throw illegalstateexception9;
        illegalstateexception9;
        throw illegalstateexception9;
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        int i1 = App.am;
        super.onSaveInstanceState(bundle);
        ArrayList arraylist = new ArrayList();
        if (Z != null)
        {
            Iterator iterator = Z.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                arraylist.add(new a88(((c4)iterator.next()).y));
            } while (i1 == 0);
            bundle.putParcelableArrayList(cb[168], arraylist);
        }
    }

    public boolean onSearchRequested()
    {
        ActionMode actionmode;
        try
        {
            actionmode = X;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        if (actionmode != null)
        {
            return false;
        }
        try
        {
            if (ad != null)
            {
                ad.finish();
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
        try
        {
            if (bc == null)
            {
                bc = new ao7(this);
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception2)
        {
            throw activitynotfoundexception2;
        }
        at.setVisibility(8);
        aX.setVisibility(8);
        X = startActionMode(bc);
        w.toggleSoftInput(0, 0);
        return false;
    }

    protected void onStart()
    {
label0:
        {
            int j1 = App.am;
            bz bz1 = new bz(cb[187]);
            super.onStart();
            com.whatsapp.m7.a(a4);
            Object obj = cb[188];
            obj = App.au.getSharedPreferences(((String) (obj)), 0);
            int i1;
            try
            {
                WaFontListPreference.c = Integer.parseInt(((SharedPreferences) (obj)).getString(cb[190], "0"));
                if (a0)
                {
                    aa(this);
                }
            }
            catch (ActivityNotFoundException activitynotfoundexception)
            {
                throw activitynotfoundexception;
            }
            try
            {
                obj = U.getCursor();
            }
            catch (ActivityNotFoundException activitynotfoundexception1)
            {
                throw activitynotfoundexception1;
            }
            if (obj == null)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                Object obj1;
                int k1;
                boolean flag;
                try
                {
                    k1 = l;
                }
                catch (ActivityNotFoundException activitynotfoundexception2)
                {
                    throw activitynotfoundexception2;
                }
                if (k1 > 90)
                {
                    obj1 = App.ah.a(A, l + 10, aB);
                    if (j1 == 0)
                    {
                        break label0;
                    }
                }
            }
            obj1 = App.ah.a(A, c(false), aB);
        }
        a(((Cursor) (obj1)));
        U.changeCursor(((Cursor) (obj1)));
        aT.clear();
        a9.clear();
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_668;
        }
        flag = k;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        i1 = l;
        k1 = U.getCursor().getCount();
        if (i1 == k1)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        flag = A();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        bd = l;
        i1 = bd;
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_344;
        }
        q();
        P = true;
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_344;
        }
        i1 = l;
        k1 = U.getCursor().getCount();
        if (i1 == k1)
        {
            ActivityNotFoundException activitynotfoundexception3;
            try
            {
                if (l > 100)
                {
                    a3 = l;
                    Log.i((new StringBuilder()).append(cb[189]).append(a3).toString());
                }
            }
            catch (ActivityNotFoundException activitynotfoundexception4)
            {
                throw activitynotfoundexception4;
            }
            E = true;
        }
        flag = P;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_374;
        }
        aK.setSelection(com.whatsapp.s.a(U));
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_397;
        }
        try
        {
            if (!E)
            {
                aK.setSelection(U.getCount() - 1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ActivityNotFoundException activitynotfoundexception5)
        {
            throw activitynotfoundexception5;
        }
        if (!App.ah.h(A))
        {
            try
            {
                if (C != null)
                {
                    C.setVisibility(8);
                    aK.removeHeaderView(C);
                    C = null;
                    U.notifyDataSetChanged();
                }
            }
            // Misplaced declaration of an exception variable
            catch (ActivityNotFoundException activitynotfoundexception5)
            {
                throw activitynotfoundexception5;
            }
        }
        obj1 = C;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_513;
        }
        flag = aD.k();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_513;
        }
        flag = aD.d();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_513;
        }
        obj1 = aD.z;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_513;
        }
        i1 = U.getCount();
        if (i1 < 100)
        {
            break MISSING_BLOCK_LABEL_542;
        }
        ActivityNotFoundException activitynotfoundexception5;
        try
        {
            aK.removeHeaderView(a7);
            a7 = null;
            U.notifyDataSetChanged();
        }
        catch (ActivityNotFoundException activitynotfoundexception6)
        {
            throw activitynotfoundexception6;
        }
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_546;
        }
        H();
        obj1 = getIntent();
        try
        {
            flag = cb[186].equals(((Intent) (obj1)).getAction());
        }
        catch (ActivityNotFoundException activitynotfoundexception7)
        {
            try
            {
                throw activitynotfoundexception7;
            }
            catch (ActivityNotFoundException activitynotfoundexception8)
            {
                throw activitynotfoundexception8;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_663;
        }
        if (aH)
        {
            break MISSING_BLOCK_LABEL_663;
        }
        i1 = U.getCount();
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_663;
        }
        obj1 = (a88)((Intent) (obj1)).getParcelableExtra(cb[185]);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_663;
        }
        obj1 = App.ah.a(((a88) (obj1)).a);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_663;
        }
        i1 = ((c4) (obj1)).w;
        if (i1 == 2)
        {
            ActivityNotFoundException activitynotfoundexception9;
            try
            {
                ar = ((c4) (obj1)).y;
            }
            catch (ActivityNotFoundException activitynotfoundexception10)
            {
                throw activitynotfoundexception10;
            }
            if (j1 == 0)
            {
                break MISSING_BLOCK_LABEL_663;
            }
        }
        startActivity(com.whatsapp.MediaView.a(((c4) (obj1)), ((c4) (obj1)).y.a, this));
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_681;
        }
        try
        {
            U.getCursor().requery();
        }
        catch (ActivityNotFoundException activitynotfoundexception11)
        {
            throw activitynotfoundexception11;
        }
        bz1.a();
        return;
        activitynotfoundexception3;
        throw activitynotfoundexception3;
        activitynotfoundexception3;
        throw activitynotfoundexception3;
        activitynotfoundexception3;
        throw activitynotfoundexception3;
        activitynotfoundexception3;
        throw activitynotfoundexception3;
        activitynotfoundexception3;
        throw activitynotfoundexception3;
        activitynotfoundexception3;
        throw activitynotfoundexception3;
        activitynotfoundexception3;
        throw activitynotfoundexception3;
        activitynotfoundexception5;
        throw activitynotfoundexception5;
        activitynotfoundexception5;
        throw activitynotfoundexception5;
        activitynotfoundexception5;
        throw activitynotfoundexception5;
        activitynotfoundexception5;
        throw activitynotfoundexception5;
        activitynotfoundexception5;
        throw activitynotfoundexception5;
        activitynotfoundexception5;
        throw activitynotfoundexception5;
        activitynotfoundexception5;
        throw activitynotfoundexception5;
        activitynotfoundexception9;
        throw activitynotfoundexception9;
    }

    protected void onStop()
    {
        try
        {
            super.onStop();
            m7.b(a4);
            if (a0)
            {
                J(this);
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        try
        {
            Log.i((new StringBuilder()).append(cb[87]).append(SQLiteDatabase.releaseMemory()).append(cb[88]).append(A).toString());
            if (V != null)
            {
                V.deactivate();
            }
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
    }

    public void s()
    {
        ActionMode actionmode = ad;
        if (actionmode == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        ActivityNotFoundException activitynotfoundexception;
        int i1;
        try
        {
            i1 = Z.size();
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
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        z();
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        ad.invalidate();
        return;
        activitynotfoundexception;
        throw activitynotfoundexception;
    }

    static 
    {
        Object obj;
        String as1[];
        char c2;
        int i1;
        as1 = new String[263];
        obj = "\027\032lj*8\006zt*";
        c2 = '\uFFFF';
        i1 = 0;
_L2:
        String as2[];
        int j1;
        int k1;
        as2 = as1;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L8:
label0:
        {
            if (k1 > j1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (c2)
            {
            default:
                as2[i1] = ((String) (obj));
                obj = "\006\034gv \016\026-m!\023\027mpa\006\021wm \t\\JJ\034\" W[\0005-F@\0063";
                i1 = 1;
                c2 = '\0';
                break;

            case 0: // '\0'
                as2[i1] = ((String) (obj));
                i1 = 2;
                obj = "\027\032lj*";
                c2 = '\001';
                break;

            case 1: // '\001'
                as2[i1] = ((String) (obj));
                obj = "\021\034g*.\t\026qk&\003\\`q=\024\035q*&\023\027n+,\b\034we,\023";
                c2 = '\002';
                i1 = 3;
                break;

            case 2: // '\002'
                as2[i1] = ((String) (obj));
                obj = "\004\035mr*\025\001bp&\b\034,b \025\005bv+\024\027oa,\023\027ga<\024\023da<H\034lp'\016\034dw*\013\027`p*\003";
                i1 = 4;
                c2 = '\003';
                break;

            case 3: // '\003'
                as2[i1] = ((String) (obj));
                i1 = 5;
                obj = "\004\035mr*\025\001bp&\b\034,b \025\005bv+H\024bm#H\007mb&\t\001ka+J\007sh \006\026";
                c2 = '\004';
                break;

            case 4: // '\004'
                as2[i1] = ((String) (obj));
                i1 = 6;
                obj = "\001\035qs.\025\026";
                c2 = '\005';
                break;

            case 5: // '\005'
                as2[i1] = ((String) (obj));
                i1 = 7;
                obj = "\004\035mr*\025\001bp&\b\034,b \025\005bv+H\024bm#H\021bh#";
                c2 = '\006';
                break;

            case 6: // '\006'
                as2[i1] = ((String) (obj));
                i1 = 8;
                obj = "\021\021bv+";
                c2 = '\007';
                break;

            case 7: // '\007'
                as2[i1] = ((String) (obj));
                i1 = 9;
                obj = "\021\033ga ";
                c2 = '\b';
                break;

            case 8: // '\b'
                as2[i1] = ((String) (obj));
                i1 = 10;
                obj = "\001\033oa\020\027\023wl";
                c2 = '\t';
                break;

            case 9: // '\t'
                as2[i1] = ((String) (obj));
                i1 = 11;
                obj = "\b\007wt:\023+";
                c2 = '\n';
                break;

            case 10: // '\n'
                as2[i1] = ((String) (obj));
                i1 = 12;
                obj = "\r\033g";
                c2 = '\013';
                break;

            case 11: // '\013'
                as2[i1] = ((String) (obj));
                i1 = 13;
                obj = "\016\001\\v*\024\027w";
                c2 = '\f';
                break;

            case 12: // '\f'
                as2[i1] = ((String) (obj));
                i1 = 14;
                obj = "\003\033pt#\006\013\\j.\n\027";
                c2 = '\r';
                break;

            case 13: // '\r'
                as2[i1] = ((String) (obj));
                i1 = 15;
                obj = "\004\035mp.\004\006";
                c2 = '\016';
                break;

            case 14: // '\016'
                as2[i1] = ((String) (obj));
                i1 = 16;
                obj = "\017\023p[?\017\035ma\020\t\007nf*\025";
                c2 = '\017';
                break;

            case 15: // '\017'
                as2[i1] = ((String) (obj));
                i1 = 17;
                obj = "\004\035mr*\025\001bp&\b\034,e,\023\000fw:\013\006,r,\006\000g$&\024Rmq#\013S";
                c2 = '\020';
                break;

            case 16: // '\020'
                as2[i1] = ((String) (obj));
                i1 = 18;
                obj = "\023\033na\020\023\035";
                c2 = '\021';
                break;

            case 17: // '\021'
                as2[i1] = ((String) (obj));
                i1 = 19;
                obj = "\b\007wt:\0234lv\"\006\006";
                c2 = '\022';
                break;

            case 18: // '\022'
                as2[i1] = ((String) (obj));
                i1 = 20;
                obj = "\002\026jp\020\004\035mp.\004\006\\m!\001\035";
                c2 = '\023';
                break;

            case 19: // '\023'
                as2[i1] = ((String) (obj));
                i1 = 21;
                obj = "\004\035mr*\025\001bp&\b\034,s.\013\036se?\002\000,v*\024\027w";
                c2 = '\024';
                break;

            case 20: // '\024'
                as2[i1] = ((String) (obj));
                i1 = 22;
                obj = "\001\033oa\020\027\023wl";
                c2 = '\025';
                break;

            case 21: // '\025'
                as2[i1] = ((String) (obj));
                i1 = 23;
                obj = "\004\035mr*\025\001bp&\b\034p+=\002\001vh;G\021lj;\006\021w$!\b\006#e+\003\027g";
                c2 = '\026';
                break;

            case 22: // '\026'
                as2[i1] = ((String) (obj));
                i1 = 24;
                obj = "\016\001\\`*\001\023vh;";
                c2 = '\027';
                break;

            case 23: // '\027'
                as2[i1] = ((String) (obj));
                i1 = 25;
                obj = "\017\023p[?\017\035ma\020\t\007nf*\025";
                c2 = '\030';
                break;

            case 24: // '\030'
                as2[i1] = ((String) (obj));
                i1 = 26;
                obj = "\004\035mr*\025\001bp&\b\034,e,\023\033um;\036\000fw`\001\023jh`\013\035b`b\016\037bc*";
                c2 = '\031';
                break;

            case 25: // '\031'
                as2[i1] = ((String) (obj));
                i1 = 27;
                obj = "\017\023p[?\025\027um*\020";
                c2 = '\032';
                break;

            case 26: // '\032'
                as2[i1] = ((String) (obj));
                i1 = 28;
                obj = "\004\000lt\r\036=vp?\022\006Pm5\002";
                c2 = '\033';
                break;

            case 27: // '\033'
                as2[i1] = ((String) (obj));
                i1 = 29;
                obj = "\023\033na\020\001\000li";
                c2 = '\034';
                break;

            case 28: // '\034'
                as2[i1] = ((String) (obj));
                i1 = 30;
                obj = "\004\035mr*\025\001bp&\b\034,s.\013\036se?\002\000,m!\021\023om+8\024jh*]";
                c2 = '\035';
                break;

            case 29: // '\035'
                as2[i1] = ((String) (obj));
                i1 = 31;
                obj = "\016\001\\v*\024\027w";
                c2 = '\036';
                break;

            case 30: // '\036'
                as2[i1] = ((String) (obj));
                i1 = 32;
                obj = "\004\035mr*\025\001bp&\b\034,b \025\005bv+H\024bm#\002\026";
                c2 = '\037';
                break;

            case 31: // '\037'
                as2[i1] = ((String) (obj));
                i1 = 33;
                obj = "\020\023oh?\006\002fv`\004\000lt`\017\027jc'\023H";
                c2 = ' ';
                break;

            case 32: // ' '
                as2[i1] = ((String) (obj));
                i1 = 34;
                obj = "\001\033oa?\006\006k";
                c2 = '!';
                break;

            case 33: // '!'
                as2[i1] = ((String) (obj));
                i1 = 35;
                obj = "G\016#";
                c2 = '"';
                break;

            case 34: // '"'
                as2[i1] = ((String) (obj));
                i1 = 36;
                obj = "\b\007wt:\023";
                c2 = '#';
                break;

            case 35: // '#'
                as2[i1] = ((String) (obj));
                i1 = 37;
                obj = "\006\034gv \016\026-m!\023\027mpa\002\nwv.I!WV\n&?";
                c2 = '$';
                break;

            case 36: // '$'
                as2[i1] = ((String) (obj));
                i1 = 38;
                obj = "\004\035mr*\025\001bp&\b\034,s.\013\036se?\002\000,`*\001\023vh;";
                c2 = '%';
                break;

            case 37: // '%'
                as2[i1] = ((String) (obj));
                i1 = 39;
                obj = "\023\033na\020\023\035";
                c2 = '&';
                break;

            case 38: // '&'
                as2[i1] = ((String) (obj));
                i1 = 40;
                obj = "\004\023sp&\b\034";
                c2 = '\'';
                break;

            case 39: // '\''
                as2[i1] = ((String) (obj));
                i1 = 41;
                obj = "\004\035mr*\025\001bp&\b\034,e,\023\033um;\036\000fw`\t\035.w?\006\021f";
                c2 = '(';
                break;

            case 40: // '('
                as2[i1] = ((String) (obj));
                i1 = 42;
                obj = "\004\035mr*\025\001bp&\b\034,e,\023\033um;\036\000fw`\b\035n)*\025\000lv";
                c2 = ')';
                break;

            case 41: // ')'
                as2[i1] = ((String) (obj));
                i1 = 43;
                obj = "\004\035mr*\025\001bp&\b\034p+=\002\001vh;H\001hm?H\021lj;\006\021w$!\b\006#e+\003\027g";
                c2 = '*';
                break;

            case 42: // '*'
                as2[i1] = ((String) (obj));
                i1 = 44;
                obj = "\027\036b}-\006\021h[ \t\036z";
                c2 = '+';
                break;

            case 43: // '+'
                as2[i1] = ((String) (obj));
                i1 = 45;
                obj = "\024\023nw:\t\025";
                c2 = ',';
                break;

            case 44: // ','
                as2[i1] = ((String) (obj));
                i1 = 46;
                obj = "\024\021bh*";
                c2 = '-';
                break;

            case 45: // '-'
                as2[i1] = ((String) (obj));
                i1 = 47;
                obj = "\b\007wt:\023*";
                c2 = '.';
                break;

            case 46: // '.'
                as2[i1] = ((String) (obj));
                i1 = 48;
                obj = "\004\035mr*\025\001bp&\b\034,r&\003\027l+<\017\023qa`\001\023jh*\003";
                c2 = '/';
                break;

            case 47: // '/'
                as2[i1] = ((String) (obj));
                i1 = 49;
                obj = "'\001-s'\006\006pe?\027\\ma;";
                c2 = '0';
                break;

            case 48: // '0'
                as2[i1] = ((String) (obj));
                i1 = 50;
                obj = "\004\035mr*\025\001bp&\b\034,e:\003\033l+<\017\023qa`\001\023jh*\003";
                c2 = '1';
                break;

            case 49: // '1'
                as2[i1] = ((String) (obj));
                i1 = 51;
                obj = "\004\035mp.\004\006\\m+";
                c2 = '2';
                break;

            case 50: // '2'
                as2[i1] = ((String) (obj));
                i1 = 52;
                obj = "8\033g";
                c2 = '3';
                break;

            case 51: // '3'
                as2[i1] = ((String) (obj));
                i1 = 53;
                obj = "\004\035mr*\025\001bp&\b\034,r&\003\027l+<\017\023qa`\001\023jh*\003]ji.\000\027qa;\022\000ma+";
                c2 = '4';
                break;

            case 52: // '4'
                as2[i1] = ((String) (obj));
                i1 = 54;
                obj = "0\023oh\037\006\002fv";
                c2 = '5';
                break;

            case 53: // '5'
                as2[i1] = ((String) (obj));
                i1 = 55;
                obj = "\016\001\\t=\002\004ja8";
                c2 = '6';
                break;

            case 54: // '6'
                as2[i1] = ((String) (obj));
                i1 = 56;
                obj = "\004\035mr*\025\001bp&\b\034p+=\002\001vh;G\021lj;\006\021w$!\b\006#e+\003\027g";
                c2 = '7';
                break;

            case 55: // '7'
                as2[i1] = ((String) (obj));
                i1 = 57;
                obj = "\023\033na\020\001\000li";
                c2 = '8';
                break;

            case 56: // '8'
                as2[i1] = ((String) (obj));
                i1 = 58;
                obj = "\004\035mr*\025\001bp&\b\034,e,\023\033um;\036\000fw`\024\032bv*J\024bm#\002\026,m!\023\027mpb\016\001.j:\013\036";
                c2 = '9';
                break;

            case 57: // '9'
                as2[i1] = ((String) (obj));
                i1 = 59;
                obj = "\004\035mr*\025\001bp&\b\034p+=\002\001vh;H\001hm?H\021lj;\006\021w$!\b\006#e+\003\027g";
                c2 = ':';
                break;

            case 58: // ':'
                as2[i1] = ((String) (obj));
                i1 = 60;
                obj = "\r\033g";
                c2 = ';';
                break;

            case 59: // ';'
                as2[i1] = ((String) (obj));
                i1 = 61;
                obj = "8\033g";
                c2 = '<';
                break;

            case 60: // '<'
                as2[i1] = ((String) (obj));
                i1 = 62;
                obj = "'\001-s'\006\006pe?\027\\ma;";
                c2 = '=';
                break;

            case 61: // '='
                as2[i1] = ((String) (obj));
                i1 = 63;
                obj = "\001\033oa\020\027\023wl";
                c2 = '>';
                break;

            case 62: // '>'
                as2[i1] = ((String) (obj));
                i1 = 64;
                obj = "\002\000qk=J\035li";
                c2 = '?';
                break;

            case 63: // '?'
                as2[i1] = ((String) (obj));
                i1 = 65;
                obj = "\004\035mr*\025\001bp&\b\034,e,\023\033um;\036\000fw:\013\006,g=\b\002ji.\000\027,k \n_fv=\b\0";
                c2 = '@';
                break;

            case 64: // '@'
                as2[i1] = ((String) (obj));
                i1 = 66;
                obj = "\005\007`o*\023-gm<\027\036b}\020\t\023na";
                c2 = 'A';
                break;

            case 65: // 'A'
                as2[i1] = ((String) (obj));
                i1 = 67;
                obj = "\004\035mr*\025\001bp&\b\034,b \025\005bv+H\033mr.\013\033g)\"\002\001pe(\002";
                c2 = 'B';
                break;

            case 66: // 'B'
                as2[i1] = ((String) (obj));
                i1 = 68;
                obj = "\004\035mr*\025\001bp&\b\034,e,\023\033um;\036\000fw`\024\032bv*J\024bm#\002\026,j \023\032jj(J\006l)<\017\023qa";
                c2 = 'C';
                break;

            case 67: // 'C'
                as2[i1] = ((String) (obj));
                i1 = 69;
                obj = "\020\023oh?\006\002fvo\001\000lio\027\025h>";
                c2 = 'D';
                break;

            case 68: // 'D'
                as2[i1] = ((String) (obj));
                i1 = 70;
                obj = "\b\035n";
                c2 = 'E';
                break;

            case 69: // 'E'
                as2[i1] = ((String) (obj));
                i1 = 71;
                obj = "\004\035mr*\025\001bp&\b\034,r&\003\027l+<\017\023qa`\t\035`e?\023\007qa)\016\036f$";
                c2 = 'F';
                break;

            case 70: // 'F'
                as2[i1] = ((String) (obj));
                i1 = 72;
                obj = "\001\033oa\020\027\023wl";
                c2 = 'G';
                break;

            case 71: // 'G'
                as2[i1] = ((String) (obj));
                i1 = 73;
                obj = "\017\023p[?\025\027um*\020";
                c2 = 'H';
                break;

            case 72: // 'H'
                as2[i1] = ((String) (obj));
                i1 = 74;
                obj = "G)";
                c2 = 'I';
                break;

            case 73: // 'I'
                as2[i1] = ((String) (obj));
                i1 = 75;
                obj = "\025\027gM+";
                c2 = 'J';
                break;

            case 74: // 'J'
                as2[i1] = ((String) (obj));
                i1 = 76;
                obj = "\020\023oh?\006\002fv`\024\027wq?H\001qgu";
                c2 = 'K';
                break;

            case 75: // 'K'
                as2[i1] = ((String) (obj));
                i1 = 77;
                obj = "\004\035mr*\025\001bp&\b\034,r&\003\027l+<\017\023qa`\001\023jh*\003]ji.\000\027qa;\022\000ma+";
                c2 = 'L';
                break;

            case 76: // 'L'
                as2[i1] = ((String) (obj));
                i1 = 78;
                obj = "\t\035.w?\006\021f";
                c2 = 'M';
                break;

            case 77: // 'M'
                as2[i1] = ((String) (obj));
                obj = "\004\023sp&\b\034";
                c2 = 'N';
                i1 = 79;
                break;

            case 78: // 'N'
                as2[i1] = ((String) (obj));
                i1 = 80;
                obj = "\003\033pt#\006\013\\j.\n\027";
                c2 = 'O';
                break;

            case 79: // 'O'
                as2[i1] = ((String) (obj));
                i1 = 81;
                obj = "\024\021bh*2\002Jb\001\002\027ga+";
                c2 = 'P';
                break;

            case 80: // 'P'
                as2[i1] = ((String) (obj));
                i1 = 82;
                obj = "\016\035.a=\025\035q";
                c2 = 'Q';
                break;

            case 81: // 'Q'
                as2[i1] = ((String) (obj));
                i1 = 83;
                obj = "\004\035mr*\025\001bp&\b\034,`*\013\027wa<\002\036fg;\002\026fw<\006\025fw`\t\035wl&\t\025pa#\002\021wa+";
                c2 = 'R';
                break;

            case 82: // 'R'
                as2[i1] = ((String) (obj));
                i1 = 84;
                obj = "\006\034gv \016\026-m!\023\027mpa\006\021wm \t\\JJ\034\" W";
                c2 = 'S';
                break;

            case 83: // 'S'
                as2[i1] = ((String) (obj));
                i1 = 85;
                obj = "\027\032lj*";
                c2 = 'T';
                break;

            case 84: // 'T'
                as2[i1] = ((String) (obj));
                i1 = 86;
                obj = "\004\035mr*\025\001bp&\b\034,k?\023Rp}<\023\027n$,\b\034we,\023Rom<\023R`k:\013\026#j \023Rek:\t\026";
                c2 = 'U';
                break;

            case 85: // 'U'
                as2[i1] = ((String) (obj));
                i1 = 87;
                obj = "\004\035mr*\025\001bp&\b\034,w;\b\002,v*\013\027bw*G";
                c2 = 'V';
                break;

            case 86: // 'V'
                as2[i1] = ((String) (obj));
                i1 = 88;
                obj = "G\030j`r";
                c2 = 'W';
                break;

            case 87: // 'W'
                as2[i1] = ((String) (obj));
                i1 = 89;
                obj = "]R";
                c2 = 'X';
                break;

            case 88: // 'X'
                as2[i1] = ((String) (obj));
                i1 = 90;
                obj = "\004\035mr*\025\001bp&\b\034,g \027\013na<\024\023da`\t\002f";
                c2 = 'Y';
                break;

            case 89: // 'Y'
                as2[i1] = ((String) (obj));
                i1 = 91;
                obj = "\004\036jt-\b\023q`";
                c2 = 'Z';
                break;

            case 90: // 'Z'
                as2[i1] = ((String) (obj));
                i1 = 92;
                obj = ":R";
                c2 = '[';
                break;

            case 91: // '['
                as2[i1] = ((String) (obj));
                i1 = 93;
                obj = "\004\035mr*\025\001bp&\b\034,g \027\013pa#\002\021wa+\002\001pe(\002\001,j \023\032jj(\024\027oa,\023\027g";
                c2 = '\\';
                break;

            case 92: // '\\'
                as2[i1] = ((String) (obj));
                i1 = 94;
                obj = "\004\035mr*\025\001bp&\b\034,w'\006\000f+\"\002\026jeb\003\035fwb\t\035w)*\037\033pp";
                c2 = ']';
                break;

            case 93: // ']'
                as2[i1] = ((String) (obj));
                i1 = 95;
                obj = "\002\037bm#";
                c2 = '^';
                break;

            case 94: // '^'
                as2[i1] = ((String) (obj));
                i1 = 96;
                obj = "\004\035mr*\025\001bp&\b\034,k?\023Rp}<\023\027n$,\b\034we,\023Rom<\023R`k:\013\026#j \023Rek:\t\026";
                c2 = '_';
                break;

            case 95: // '_'
                as2[i1] = ((String) (obj));
                i1 = 97;
                obj = "\006\034gv \016\026-m!\023\027mpa\006\021wm \t\\JJ\034\" W";
                c2 = '`';
                break;

            case 96: // '`'
                as2[i1] = ((String) (obj));
                i1 = 98;
                obj = "\r\033g";
                c2 = 'a';
                break;

            case 97: // 'a'
                as2[i1] = ((String) (obj));
                i1 = 99;
                obj = "\004\035mr*\025\001bp&\b\034,e?H\001we;\002\027qv \025";
                c2 = 'b';
                break;

            case 98: // 'b'
                as2[i1] = ((String) (obj));
                i1 = 100;
                obj = "\004\035mr*\025\001bp&\b\034,v*\024\007nao";
                c2 = 'c';
                break;

            case 99: // 'c'
                as2[i1] = ((String) (obj));
                i1 = 101;
                obj = "\004\035mr*\025\001bp&\b\034,v*\024\007na";
                c2 = 'd';
                break;

            case 100: // 'd'
                as2[i1] = ((String) (obj));
                i1 = 102;
                obj = "\004\035mr*\025\001bp&\b\034,k!\004\023mg*\013\037f`&\006\007sh \006\026#q?\013\035b`*\025Rjwo\t\007oho\n\027gm.8\005b[;\036\002f>";
                c2 = 'e';
                break;

            case 101: // 'e'
                as2[i1] = ((String) (obj));
                i1 = 103;
                obj = "G\031f}u";
                c2 = 'f';
                break;

            case 102: // 'f'
                as2[i1] = ((String) (obj));
                i1 = 104;
                obj = "G\001we;\022\0019";
                c2 = 'g';
                break;

            case 103: // 'g'
                as2[i1] = ((String) (obj));
                i1 = 105;
                obj = "G\006qe!\024\024fv=\016\034d>";
                c2 = 'h';
                break;

            case 104: // 'h'
                as2[i1] = ((String) (obj));
                i1 = 106;
                obj = "\004\035mr*\025\001bp&\b\034,k!\004\023mg*\013\037f`&\006\007sh \006\026#i*\003\033b[+\006\006b$&\024Rmq#\013Rna+\016\023\\s.8\006zt*]";
                c2 = 'i';
                break;

            case 105: // 'i'
                as2[i1] = ((String) (obj));
                i1 = 107;
                obj = "G\006qe!\024\024fv=\002\0269";
                c2 = 'j';
                break;

            case 106: // 'j'
                as2[i1] = ((String) (obj));
                i1 = 108;
                obj = "G\001we;\022\0019";
                c2 = 'k';
                break;

            case 107: // 'k'
                as2[i1] = ((String) (obj));
                i1 = 109;
                obj = "G\031f}u";
                c2 = 'l';
                break;

            case 108: // 'l'
                as2[i1] = ((String) (obj));
                i1 = 110;
                obj = "\004\035mr*\025\001bp&\b\034,`&\024\002bp,\017_wk:\004\032.a9\002\034w$";
                c2 = 'm';
                break;

            case 109: // 'm'
                as2[i1] = ((String) (obj));
                i1 = 111;
                obj = "\004\035mr*\025\001bp&\b\034,`&\024\002bp,\017_wk:\004\032.a9\002\034w$";
                c2 = 'n';
                break;

            case 110: // 'n'
                as2[i1] = ((String) (obj));
                i1 = 112;
                obj = "\004\035mr*\025\001bp&\b\034,i.\t\023da+J\026je#\b\025.e#\025\027b`6J\023g`*\003";
                c2 = 'o';
                break;

            case 111: // 'o'
                as2[i1] = ((String) (obj));
                i1 = 113;
                obj = "\004\035mr*\025\001bp&\b\034,w;\006\000w+=\002\001fp`\r\033g$";
                c2 = 'p';
                break;

            case 112: // 'p'
                as2[i1] = ((String) (obj));
                i1 = 114;
                obj = "\r\033g";
                c2 = 'q';
                break;

            case 113: // 'q'
                as2[i1] = ((String) (obj));
                i1 = 115;
                obj = "\004\035mr*\025\001bp&\b\034,w\"\024]mko\r\033g";
                c2 = 'r';
                break;

            case 114: // 'r'
                as2[i1] = ((String) (obj));
                i1 = 116;
                obj = "\021\021bv+8\034bi*";
                c2 = 's';
                break;

            case 115: // 's'
                as2[i1] = ((String) (obj));
                i1 = 117;
                obj = "\017\023p[<\017\023qa";
                c2 = 't';
                break;

            case 116: // 't'
                as2[i1] = ((String) (obj));
                i1 = 118;
                obj = "\004\023sp&\b\034";
                c2 = 'u';
                break;

            case 117: // 'u'
                as2[i1] = ((String) (obj));
                i1 = 119;
                obj = "\021\021bv+8\001wv";
                c2 = 'v';
                break;

            case 118: // 'v'
                as2[i1] = ((String) (obj));
                i1 = 120;
                obj = "\004\035mr*\025\001bp&\b\034,w;\006\000w$!\bRim+";
                c2 = 'w';
                break;

            case 119: // 'w'
                as2[i1] = ((String) (obj));
                i1 = 121;
                obj = "G\007qmu";
                c2 = 'x';
                break;

            case 120: // 'x'
                as2[i1] = ((String) (obj));
                i1 = 122;
                obj = "\024\031jt\020\027\000fr&\002\005";
                c2 = 'y';
                break;

            case 121: // 'y'
                as2[i1] = ((String) (obj));
                i1 = 123;
                obj = "\021\021bv+8\034bi*";
                c2 = 'z';
                break;

            case 122: // 'z'
                as2[i1] = ((String) (obj));
                i1 = 124;
                obj = "\020\023\\p6\027\027";
                c2 = '{';
                break;

            case 123: // '{'
                as2[i1] = ((String) (obj));
                i1 = 125;
                obj = "\024\031jt\020\027\000fr&\002\005";
                c2 = '|';
                break;

            case 124: // '|'
                as2[i1] = ((String) (obj));
                i1 = 126;
                obj = "\n\023{[&\023\027nw";
                c2 = '}';
                break;

            case 125: // '}'
                as2[i1] = ((String) (obj));
                i1 = 127;
                obj = "\004\035mb&\025\037";
                c2 = '~';
                break;

            case 126: // '~'
                as2[i1] = ((String) (obj));
                i1 = 128;
                obj = "\017\023p[<\017\023qa";
                c2 = '\177';
                break;

            case 127: // '\177'
                as2[i1] = ((String) (obj));
                i1 = 129;
                obj = "\006\034gv \016\026-m!\023\027mpa\002\nwv.I!WV\n&?";
                c2 = '\200';
                break;

            case 128: 
                as2[i1] = ((String) (obj));
                i1 = 130;
                obj = "\024\037pp ";
                c2 = '\201';
                break;

            case 129: 
                as2[i1] = ((String) (obj));
                i1 = 131;
                obj = "\021\021bv+8\001wv";
                c2 = '\202';
                break;

            case 130: 
                as2[i1] = ((String) (obj));
                i1 = 132;
                obj = "\004\035n*.\n\023yk!I\026fr&\004\027-l \n\027-a7\023\000b*\007\" L[\030.6DA\03386BP\016";
                c2 = '\203';
                break;

            case 131: 
                as2[i1] = ((String) (obj));
                i1 = 133;
                obj = "'\001-s'\006\006pe?\027\\ma;";
                c2 = '\204';
                break;

            case 132: 
                as2[i1] = ((String) (obj));
                i1 = 134;
                obj = "\004\035mr*\025\001bp&\b\034,w;\006\000w+8\006-w}?\002H";
                c2 = '\205';
                break;

            case 133: 
                as2[i1] = ((String) (obj));
                i1 = 135;
                obj = ")\035#w?\006\021f";
                c2 = '\206';
                break;

            case 134: 
                as2[i1] = ((String) (obj));
                i1 = 136;
                obj = "\004\035mr*\025\001bp&\b\034,w\"\024_im+]";
                c2 = '\207';
                break;

            case 135: 
                as2[i1] = ((String) (obj));
                i1 = 137;
                obj = "\004\035mr*\025\001bp&\b\034,w;\006\000w$!\bRjg \t\006bg;G\024lvo";
                c2 = '\210';
                break;

            case 136: 
                as2[i1] = ((String) (obj));
                i1 = 138;
                obj = "\004\035mr*\025\001bp&\b\034,k!\004\000fe;\002\021lj9H\035lib\002\000qk=G";
                c2 = '\211';
                break;

            case 137: 
                as2[i1] = ((String) (obj));
                i1 = 139;
                obj = "\004\035mr*\025\001bp&\b\034,g=\002\023wa,\b\034ua=\024\023wm \t";
                c2 = '\212';
                break;

            case 138: 
                as2[i1] = ((String) (obj));
                i1 = 140;
                obj = "\006\034gv \016\026-m!\023\027mpa\002\nwv.I!WV\n&?";
                c2 = '\213';
                break;

            case 139: 
                as2[i1] = ((String) (obj));
                i1 = 141;
                obj = "\025\027`m?\016\027mp";
                c2 = '\214';
                break;

            case 140: 
                as2[i1] = ((String) (obj));
                i1 = 142;
                obj = "\024\032bv*8\037pc";
                c2 = '\215';
                break;

            case 141: 
                as2[i1] = ((String) (obj));
                i1 = 143;
                obj = "\024\037p";
                c2 = '\216';
                break;

            case 142: 
                as2[i1] = ((String) (obj));
                i1 = 144;
                obj = "\004\035mr*\025\001bp&\b\034,k!\004\000fe;\002\021lj9H\033la=\025\035q$";
                c2 = '\217';
                break;

            case 143: 
                as2[i1] = ((String) (obj));
                i1 = 145;
                obj = "\024\037p)%\016\026,v.\020_mq\"\005\027q";
                c2 = '\220';
                break;

            case 144: 
                as2[i1] = ((String) (obj));
                i1 = 146;
                obj = "\004\035mr*\025\001bp&\b\034,w*\013\027`p&\b\034qa>\022\027pp*\003";
                c2 = '\221';
                break;

            case 145: 
                as2[i1] = ((String) (obj));
                i1 = 147;
                obj = "\025\027`m?\016\027mp";
                c2 = '\222';
                break;

            case 146: 
                as2[i1] = ((String) (obj));
                i1 = 148;
                obj = "\004\035mr*\025\001bp&\b\034,w*\023\007st=\002\004ja8H\001ke=\002_ee&\013\027g";
                c2 = '\223';
                break;

            case 147: 
                as2[i1] = ((String) (obj));
                i1 = 149;
                obj = "\n\023{[&\023\027nw";
                c2 = '\224';
                break;

            case 148: 
                as2[i1] = ((String) (obj));
                i1 = 150;
                obj = "\006\034gv \016\026-m!\023\027mpa\002\nwv.I!WV\n&?";
                c2 = '\225';
                break;

            case 149: 
                as2[i1] = ((String) (obj));
                i1 = 151;
                obj = "\004\035lh&\025\033p";
                c2 = '\226';
                break;

            case 150: 
                as2[i1] = ((String) (obj));
                i1 = 152;
                obj = "\004\035n*'\023\021-e#\005\007n";
                c2 = '\227';
                break;

            case 151: 
                as2[i1] = ((String) (obj));
                i1 = 153;
                obj = "\006\034gv \016\026-m!\023\027mpa\006\021wm \t\\DA\03381LJ\033\"<W";
                c2 = '\230';
                break;

            case 152: 
                as2[i1] = ((String) (obj));
                i1 = 154;
                obj = "\004\035n*8\017\023ww.\027\002\\t=\002\024fv*\t\021fw";
                c2 = '\231';
                break;

            case 153: 
                as2[i1] = ((String) (obj));
                i1 = 155;
                obj = "\004\035mr*\025\001bp&\b\034,a\"\006\033o).\023\006bg'\n\027mp`\t\027f`b\024\026.g.\025\026";
                c2 = '\232';
                break;

            case 154: 
                as2[i1] = ((String) (obj));
                i1 = 156;
                obj = " \023oh*\025\013";
                c2 = '\233';
                break;

            case 155: 
                as2[i1] = ((String) (obj));
                i1 = 157;
                obj = "G\016#";
                c2 = '\234';
                break;

            case 156: 
                as2[i1] = ((String) (obj));
                i1 = 158;
                obj = "\004\035n*8\017\023ww.\027\002-m!\023\027mpa\006\021wm \t\\GA\t&'OP\02003OH\037&\"FV";
                c2 = '\235';
                break;

            case 157: 
                as2[i1] = ((String) (obj));
                i1 = 159;
                obj = "\004\035n*8\017\023ww.\027\002-m!\023\027mpa\006\021wm \t\\QA\034\"&\\S\016+>SE\037\" ";
                c2 = '\236';
                break;

            case 158: 
                as2[i1] = ((String) (obj));
                i1 = 160;
                obj = "G\016#";
                c2 = '\237';
                break;

            case 159: 
                as2[i1] = ((String) (obj));
                i1 = 161;
                obj = "\b\000ja!\023\023wm \t";
                c2 = '\240';
                break;

            case 160: 
                as2[i1] = ((String) (obj));
                i1 = 162;
                obj = "\016\037bc*HX";
                c2 = '\241';
                break;

            case 161: 
                as2[i1] = ((String) (obj));
                i1 = 163;
                obj = "\004\035n*8\017\023ww.\027\002-m!\023\027mpa\006\021wm \t\\PA\0338%BH\00373SA\035";
                c2 = '\242';
                break;

            case 162: 
                as2[i1] = ((String) (obj));
                i1 = 164;
                obj = "\013\023pp\020\n\007wa\020\024\027oa,\023\033lj";
                c2 = '\243';
                break;

            case 163: 
                as2[i1] = ((String) (obj));
                i1 = 165;
                obj = "\b\000ja!\023\023wm \t";
                c2 = '\244';
                break;

            case 164: 
                as2[i1] = ((String) (obj));
                i1 = 166;
                obj = "\r\033g";
                c2 = '\245';
                break;

            case 165: 
                as2[i1] = ((String) (obj));
                i1 = 167;
                obj = "\006\034gv \016\026-m!\023\027mpa\002\nwv.I;MM\033.3O[\006)&FJ\0334";
                c2 = '\246';
                break;

            case 166: 
                as2[i1] = ((String) (obj));
                i1 = 168;
                obj = "\024\027oa,\023\027g[\"\002\001pe(\002\001";
                c2 = '\247';
                break;

            case 167: 
                as2[i1] = ((String) (obj));
                i1 = 169;
                obj = "\004\035n*8\017\023ww.\027\002\\t=\002\024fv*\t\021fw";
                c2 = '\250';
                break;

            case 168: 
                as2[i1] = ((String) (obj));
                i1 = 170;
                obj = "\020\023qj*\003-bf \022\006\\g.\013\036\\g'\006\000da<";
                c2 = '\251';
                break;

            case 169: 
                as2[i1] = ((String) (obj));
                i1 = 171;
                obj = "\004\035mr*\025\001bp&\b\034,w*\023\005bv!\002\026,b.\016\036f`";
                c2 = '\252';
                break;

            case 170: 
                as2[i1] = ((String) (obj));
                i1 = 172;
                obj = "\004\035mr*\025\001bp&\b\034,e+\003\000fg*\016\004f``\024\031jt`";
                c2 = '\253';
                break;

            case 171: 
                as2[i1] = ((String) (obj));
                i1 = 173;
                obj = "\004\035mr*\025\001bp&\b\034,e+\003\000fg*\016\004f``\024\031jt}H";
                c2 = '\254';
                break;

            case 172: 
                as2[i1] = ((String) (obj));
                i1 = 174;
                obj = "\004\035mr*\025\001bp&\b\034,e+\003\000fg*\016\004f``\024\006bh*\003\023weo";
                c2 = '\255';
                break;

            case 173: 
                as2[i1] = ((String) (obj));
                i1 = 175;
                obj = "\004\035mr*\025\001bp&\b\034,e,\023\033um;\036\000fw`\024\032bv*J\024bm#\002\026,$";
                c2 = '\256';
                break;

            case 174: 
                as2[i1] = ((String) (obj));
                i1 = 176;
                obj = "\004\035mr*\025\001bp&\b\034,e,\023\033um;\036\000fw`\024\032bv*J\024bm#\002\026,$";
                c2 = '\257';
                break;

            case 175: 
                as2[i1] = ((String) (obj));
                i1 = 177;
                obj = "\004\035mr*\025\001bp&\b\034,e,\023\033um;\036\000fw`\024\032bv*J\024bm#\002\026,$";
                c2 = '\260';
                break;

            case 176: 
                as2[i1] = ((String) (obj));
                i1 = 178;
                obj = "\004\035mr*\025\001bp&\b\034,e,\023\033um;\036\000fw`\024\032bv*J\024bm#\002\026,$";
                c2 = '\261';
                break;

            case 177: 
                as2[i1] = ((String) (obj));
                i1 = 179;
                obj = ")\035#w?\006\021f";
                c2 = '\262';
                break;

            case 178: 
                as2[i1] = ((String) (obj));
                i1 = 180;
                obj = "\006\034gv \016\026-m!\023\027mpa\006\021wm \t\\JJ\034\" W[\0005-F@\0063";
                c2 = '\263';
                break;

            case 179: 
                as2[i1] = ((String) (obj));
                i1 = 181;
                obj = "\002\037bm#";
                c2 = '\264';
                break;

            case 180: 
                as2[i1] = ((String) (obj));
                i1 = 182;
                obj = "\021\034g*.\t\026qk&\003\\`q=\024\035q*&\023\027n+,\b\034we,\023";
                c2 = '\265';
                break;

            case 181: 
                as2[i1] = ((String) (obj));
                i1 = 183;
                obj = "\023\027o>";
                c2 = '\266';
                break;

            case 182: 
                as2[i1] = ((String) (obj));
                i1 = 184;
                obj = "\006\034gv \016\026-m!\023\027mpa\006\021wm \t\\GM\016+";
                c2 = '\267';
                break;

            case 183: 
                as2[i1] = ((String) (obj));
                i1 = 185;
                obj = "\f\027z";
                c2 = '\270';
                break;

            case 184: 
                as2[i1] = ((String) (obj));
                i1 = 186;
                obj = "\004\035n*8\017\023ww.\027\002-m!\023\027mpa\006\021wm \t\\SH\016>";
                c2 = '\271';
                break;

            case 185: 
                as2[i1] = ((String) (obj));
                i1 = 187;
                obj = "\004\035mr*\025\001bp&\b\034,w;\006\000w";
                c2 = '\272';
                break;

            case 186: 
                as2[i1] = ((String) (obj));
                i1 = 188;
                obj = "\004\035n*8\017\023ww.\027\002\\t=\002\024fv*\t\021fw";
                c2 = '\273';
                break;

            case 187: 
                as2[i1] = ((String) (obj));
                i1 = 189;
                obj = "\004\032bj(\002Rse(\002Rpm5\002H";
                c2 = '\274';
                break;

            case 188: 
                as2[i1] = ((String) (obj));
                i1 = 190;
                obj = "\016\034wa=\001\023`a\020\001\035mp\020\024\033ya";
                c2 = '\275';
                break;

            case 189: 
                as2[i1] = ((String) (obj));
                i1 = 191;
                obj = "\016\034sq;8\037fp'\b\026";
                c2 = '\276';
                break;

            case 190: 
                as2[i1] = ((String) (obj));
                i1 = 192;
                obj = "G\037Lv&\000\033me#2\034pa*\t1lq!\023H";
                c2 = '\277';
                break;

            case 191: 
                as2[i1] = ((String) (obj));
                i1 = 193;
                obj = "G\021vv<\b\000@k:\t\0069";
                c2 = '\300';
                break;

            case 192: 
                as2[i1] = ((String) (obj));
                i1 = 194;
                obj = "\004\035mr*\025\001bp&\b\034,e+\r\007pp:\t\001fa!\004\035vj;H\007ma7\027\027`p*\003]#q!\024\027fj\f\b\007mpu";
                c2 = '\301';
                break;

            case 193: 
                as2[i1] = ((String) (obj));
                i1 = 195;
                obj = "G\001km)\0231lq!\023H";
                c2 = '\302';
                break;

            case 194: 
                as2[i1] = ((String) (obj));
                i1 = 196;
                obj = "\004\035mr*\025\001bp&\b\034,t.\022\001f";
                c2 = '\303';
                break;

            case 195: 
                as2[i1] = ((String) (obj));
                i1 = 197;
                obj = "\027\035ta=";
                c2 = '\304';
                break;

            case 196: 
                as2[i1] = ((String) (obj));
                i1 = 198;
                obj = "\r\033g";
                c2 = '\305';
                break;

            case 197: 
                as2[i1] = ((String) (obj));
                i1 = 199;
                obj = "\n\035vj;\002\026";
                c2 = '\306';
                break;

            case 198: 
                as2[i1] = ((String) (obj));
                i1 = 200;
                obj = "\004\035n*8\017\023ww.\027\002\\t=\002\024fv*\t\021fw";
                c2 = '\307';
                break;

            case 199: 
                as2[i1] = ((String) (obj));
                i1 = 201;
                obj = "\020\023qj*\003-bf \022\006\\g.\013\036\\g'\006\000da<";
                c2 = '\310';
                break;

            case 200: 
                as2[i1] = ((String) (obj));
                i1 = 202;
                obj = "G\031f}u";
                c2 = '\311';
                break;

            case 201: 
                as2[i1] = ((String) (obj));
                i1 = 203;
                obj = "G\006qe!\024\024fv=\016\034d>";
                c2 = '\312';
                break;

            case 202: 
                as2[i1] = ((String) (obj));
                i1 = 204;
                obj = "G\006qe!\024\024fv=\002\0269";
                c2 = '\313';
                break;

            case 203: 
                as2[i1] = ((String) (obj));
                i1 = 205;
                obj = "G\001we;\022\0019";
                c2 = '\314';
                break;

            case 204: 
                as2[i1] = ((String) (obj));
                i1 = 206;
                obj = "G\001we;\022\0019";
                c2 = '\315';
                break;

            case 205: 
                as2[i1] = ((String) (obj));
                i1 = 207;
                obj = "G\031f}u";
                c2 = '\316';
                break;

            case 206: 
                as2[i1] = ((String) (obj));
                i1 = 208;
                obj = "\004\035mr*\025\001bp&\b\034,k!\004\023mg*\013\037f`&\006\026ls!\013\035b`o\n\027pw.\000\027#m<G\034vh#";
                c2 = '\317';
                break;

            case 207: 
                as2[i1] = ((String) (obj));
                i1 = 209;
                obj = "\004\035mr*\025\001bp&\b\034,k!\004\023mg*\013\037f`&\006\026ls!\013\035b`o\003\035tj#\b\023ga=G\033p$!\022\036o$\"\002\026je\020\020\023\\p6\027\0279";
                c2 = '\320';
                break;

            case 208: 
                as2[i1] = ((String) (obj));
                i1 = 210;
                obj = "\004\035mr*\025\001bp&\b\034,k!\004\023mg*\013\037f`&\006\026ls!\013\035b`o\n\027gm.8\026bp.G\033p$!\022\036o$\"\002\026je\020\020\023\\p6\027\0279";
                c2 = '\321';
                break;

            case 209: 
                as2[i1] = ((String) (obj));
                i1 = 211;
                obj = "\013\023zk:\023-jj)\013\023wa=";
                c2 = '\322';
                break;

            case 210: 
                as2[i1] = ((String) (obj));
                i1 = 212;
                obj = "\004\035mr*\025\001bp&\b\034,g=\002\023wa";
                c2 = '\323';
                break;

            case 211: 
                as2[i1] = ((String) (obj));
                i1 = 213;
                obj = "\016\034sq;8\027mp*\025-pa!\003";
                c2 = '\324';
                break;

            case 212: 
                as2[i1] = ((String) (obj));
                i1 = 214;
                obj = "\r\033g";
                c2 = '\325';
                break;

            case 213: 
                as2[i1] = ((String) (obj));
                i1 = 215;
                obj = "\003\033pt#\006\013me\"\002";
                c2 = '\326';
                break;

            case 214: 
                as2[i1] = ((String) (obj));
                i1 = 216;
                obj = "\001\000li\f\006\036oJ \023\033em,\006\006jk!";
                c2 = '\327';
                break;

            case 215: 
                as2[i1] = ((String) (obj));
                i1 = 217;
                obj = "\004\035mr*\025\001bp&\b\034,w \001\006te=\002_bf \022\006.p J\027{t&\025\027";
                c2 = '\330';
                break;

            case 216: 
                as2[i1] = ((String) (obj));
                i1 = 218;
                obj = "\004\035mr*\025\001bp&\b\034,w \001\006te=\002_f|?\016\000f`";
                c2 = '\331';
                break;

            case 217: 
                as2[i1] = ((String) (obj));
                i1 = 219;
                obj = "\004\035mr*\025\001bp&\b\034,g=\002\023wa`\000\000lq?J\001kk=\023\021vpb\025\027nk9\002\026";
                c2 = '\332';
                break;

            case 218: 
                as2[i1] = ((String) (obj));
                i1 = 220;
                obj = "\004\035mr*\025\001bp&\b\034,g=\002\023wa`\t\035.i*J\035q)\"\024\025pp \025\027.`-";
                c2 = '\333';
                break;

            case 219: 
                as2[i1] = ((String) (obj));
                i1 = 221;
                obj = "\004\035mr*\025\001bp&\b\034,g=\002\023wao\001\023jh*\003Rwko\024\006bv;G\034fso\004\035mr*\025\001bp&\b\034";
                c2 = '\334';
                break;

            case 220: 
                as2[i1] = ((String) (obj));
                i1 = 222;
                obj = "\004\035mr*\025\001bp&\b\034,g#\b\021h)8\025\035mc";
                c2 = '\335';
                break;

            case 221: 
                as2[i1] = ((String) (obj));
                i1 = 223;
                obj = "\024\027oa,\023\027g[\"\002\001pe(\002\001";
                c2 = '\336';
                break;

            case 222: 
                as2[i1] = ((String) (obj));
                i1 = 224;
                obj = "\004\035mr*\025\001bp&\b\034#f \022\034`ao\023\035#i.\016\034";
                c2 = '\337';
                break;

            case 223: 
                as2[i1] = ((String) (obj));
                i1 = 225;
                obj = "\004\035n*8\017\023ww.\027\002\\t=\002\024fv*\t\021fw";
                c2 = '\340';
                break;

            case 224: 
                as2[i1] = ((String) (obj));
                i1 = 226;
                obj = "\r\033g";
                c2 = '\341';
                break;

            case 225: 
                as2[i1] = ((String) (obj));
                i1 = 227;
                obj = "\004\035mr*\025\001bp&\b\034,g=\002\023wa";
                c2 = '\342';
                break;

            case 226: 
                as2[i1] = ((String) (obj));
                i1 = 228;
                obj = "\006\020lv;\016\034d$+\022\027#p G\034bp&\021\027#h&\005\000bv&\002\001#i&\024\001jj(";
                c2 = '\343';
                break;

            case 227: 
                as2[i1] = ((String) (obj));
                i1 = 229;
                obj = "\004\035mr*\025\001bp&\b\034\\w \022\034g";
                c2 = '\344';
                break;

            case 228: 
                as2[i1] = ((String) (obj));
                i1 = 230;
                obj = "\004\035mr*\025\001bp&\b\034,g.\013\036.g \t\006bg;H\027qv \025Rim+Z";
                c2 = '\345';
                break;

            case 229: 
                as2[i1] = ((String) (obj));
                i1 = 231;
                obj = "\004\035mr*\025\001bp&\b\034,`&\006\036#`&\006\036fvo\006\002s$!\b\006#b \022\034g";
                c2 = '\346';
                break;

            case 230: 
                as2[i1] = ((String) (obj));
                i1 = 232;
                obj = "\004\035mr*\025\001bp&\b\034,e+\003_`k!\023\023`pb\001\023jh*\003";
                c2 = '\347';
                break;

            case 231: 
                as2[i1] = ((String) (obj));
                i1 = 233;
                obj = "\006\034gv \016\026-m!\023\027mpa\006\021wm \t\\GM\016+";
                c2 = '\350';
                break;

            case 232: 
                as2[i1] = ((String) (obj));
                i1 = 234;
                obj = "\023\027o>";
                c2 = '\351';
                break;

            case 233: 
                as2[i1] = ((String) (obj));
                i1 = 235;
                obj = "\004\035mr*\025\001bp&\b\034,i*\024\001bc*J\021lj;\006\021w+*\025\000lvo\r\033g9";
                c2 = '\352';
                break;

            case 234: 
                as2[i1] = ((String) (obj));
                i1 = 236;
                obj = "\004\035mr*\025\001bp&\b\034,i*\024\001bc*J\021lj;\006\021w+*\025\000lvo\t\035.v*\024\035vv,\002";
                c2 = '\353';
                break;

            case 235: 
                as2[i1] = ((String) (obj));
                i1 = 237;
                obj = "\004\035mr*\025\001bp&\b\034,g.\013\036.g \t\006bg;H\027qv \025Rmkb\025\027pk:\025\021f";
                c2 = '\354';
                break;

            case 236: 
                as2[i1] = ((String) (obj));
                i1 = 238;
                obj = "\004\035mr*\025\001bp&\b\034,`&\006\036lc`\003\035tj#\b\023g+!\b_na+\016\023.g.\025\026";
                c2 = '\355';
                break;

            case 237: 
                as2[i1] = ((String) (obj));
                i1 = 239;
                obj = "\004\035mr*\025\001bp&\b\034,s.\025\034f`b\006\020lq;J\021bh#J\021ke=\000\027p";
                c2 = '\356';
                break;

            case 238: 
                as2[i1] = ((String) (obj));
                i1 = 240;
                obj = "\004\035mr*\025\001bp&\b\034,`&\006\036lc`\n\027gm.J\026ls!\013\035b`b\001\023jh*\003]jj9\006\036j`b\022\000o";
                c2 = '\357';
                break;

            case 239: 
                as2[i1] = ((String) (obj));
                i1 = 241;
                obj = "\004\035mr*\025\001bp&\b\034,`&\006\036lc`\n\027gm.J\026ls!\013\035b`b\001\023jh*\003]wk J\035o`";
                c2 = '\360';
                break;

            case 240: 
                as2[i1] = ((String) (obj));
                i1 = 242;
                obj = "\004\035mr*\025\001bp&\b\034,`&\006\036lc`\003\027oa;\002Rmko\n\027pw.\000\027p";
                c2 = '\361';
                break;

            case 241: 
                as2[i1] = ((String) (obj));
                i1 = 243;
                obj = "\004\035mr*\025\001bp&\b\034,e+\003Rf|&\024\006jj(G\021lj;\006\021w>o\006\021wm9\016\006z$!\b\006#b \022\034g(o\027\000lf.\005\036z$;\006\020oa;";
                c2 = '\362';
                break;

            case 242: 
                as2[i1] = ((String) (obj));
                i1 = 244;
                obj = "\004\035mr*\025\001bp&\b\034,`&\006\036lc`\003\035tj#\b\023g+=\002\023g) \t\036z)\"\002\026jeb\004\023q`";
                c2 = '\363';
                break;

            case 243: 
                as2[i1] = ((String) (obj));
                i1 = 245;
                obj = "\004\035mr*\025\001bp&\b\034,`&\006\036lco\024\027qr&\004\027.a7\023\027mw&\b\034.t.\036\037fj;";
                c2 = '\364';
                break;

            case 244: 
                as2[i1] = ((String) (obj));
                i1 = 246;
                obj = "\004\035mr*\025\001bp&\b\034,`&\006\036lc`\t\035w).\t_ji.\000\027";
                c2 = '\365';
                break;

            case 245: 
                as2[i1] = ((String) (obj));
                i1 = 247;
                obj = "\004\035mr*\025\001bp&\b\034,`&\006\036lco\024\027qr&\004\027.a7\023\027mw&\b\034.e,\023\033ua";
                c2 = '\366';
                break;

            case 246: 
                as2[i1] = ((String) (obj));
                i1 = 248;
                obj = "\004\035mr*\025\001bp&\b\034,`&\006\036lco\024\027qr&\004\027.a7\023\027mw&\b\034.v \013\036ae,\f";
                c2 = '\367';
                break;

            case 247: 
                as2[i1] = ((String) (obj));
                i1 = 249;
                obj = "\004\035mr*\025\001bp&\b\034,`&\006\036lc`\003\027oa;\002]";
                c2 = '\370';
                break;

            case 248: 
                as2[i1] = ((String) (obj));
                i1 = 250;
                obj = "\004\035mr*\025\001bp&\b\034,`&\006\036lc`\n\027gm.J\026ls!\013\035b`b\001\023jh*\003]jj<\022\024em,\016\027mpb\024\002bg*";
                c2 = '\371';
                break;

            case 249: 
                as2[i1] = ((String) (obj));
                i1 = 251;
                obj = "\004\035mr*\025\001bp&\b\034,`&\006\036lc`\n\027gm.J\026ls!\013\035b`b\001\023jh*\003";
                c2 = '\372';
                break;

            case 250: 
                as2[i1] = ((String) (obj));
                i1 = 252;
                obj = "\004\035mr*\025\001bp&\b\034,`&\006\036lcb\006\026g),\b\034we,\023";
                c2 = '\373';
                break;

            case 251: 
                as2[i1] = ((String) (obj));
                i1 = 253;
                obj = "\004\035mr*\025\001bp&\b\034,`&\006\036lco\024\035ep8\006\000f).\005\035vpb\023\035.a7\027\033qa";
                c2 = '\374';
                break;

            case 252: 
                as2[i1] = ((String) (obj));
                i1 = 254;
                obj = "\004\035mr*\025\001bp&\b\034,`&\006\036lco\024\027qr&\004\027.a7\023\027mw&\b\034.a7\027\033qa+";
                c2 = '\375';
                break;

            case 253: 
                as2[i1] = ((String) (obj));
                i1 = 255;
                obj = "\004\035mr*\025\001bp&\b\034,`&\006\036lc`\b\035n";
                c2 = '\376';
                break;

            case 254: 
                as2[i1] = ((String) (obj));
                i1 = 256;
                obj = "\004\035mr*\025\001bp&\b\034,`&\006\036lco\024\027qr&\004\027.a7\023\027mw&\b\034.h&\001\027wm\"\002";
                c2 = '\377';
                break;

            case 255: 
                as2[i1] = ((String) (obj));
                i1 = 257;
                obj = "\004\035mr*\025\001bp&\b\034,a\"\b\030jt \027\007sl*\016\025kpo";
                c2 = '\u0100';
                break;

            case 256: 
                as2[i1] = ((String) (obj));
                i1 = 258;
                obj = "\004\035mr*\025\001bp&\b\034,a\"\b\030jt \027\007sl*\016\025kpo";
                c2 = '\u0101';
                break;

            case 257: 
                as2[i1] = ((String) (obj));
                i1 = 259;
                obj = "\027\023dao\024\033yau";
                c2 = '\u0102';
                break;

            case 258: 
                as2[i1] = ((String) (obj));
                i1 = 260;
                obj = "\004\035mr*\025\001bp&\b\034,`*\024\006qk6";
                c2 = '\u0103';
                break;

            case 259: 
                as2[i1] = ((String) (obj));
                i1 = 261;
                obj = "\004\035mr*\025\001bp&\b\034,k!\004\000fe;\002\035sp&\b\034pi*\t\007";
                c2 = '\u0104';
                break;

            case 260: 
                as2[i1] = ((String) (obj));
                i1 = 262;
                obj = "\004\035mr*\025\001bp&\b\034,k!\027\000ft.\025\027lt;\016\035mw\"\002\034v";
                c2 = '\u0105';
                break;

            case 261: 
                as2[i1] = ((String) (obj));
                cb = as1;
                av = new ArrayList();
                r = new HashMap();
                aR = new HashMap();
                a0 = true;
                aJ = true;
                au = true;
                aS = false;
                ab = new AtomicReference(new asa(null, false));
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c3 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 6400
    //                   0 6423
    //                   1 6430
    //                   2 6437
    //                   3 6443;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_6443;
_L3:
        byte byte0 = 79;
_L9:
        obj[j1] = (char)(byte0 ^ c3);
        j1++;
          goto _L8
_L4:
        byte0 = 103;
          goto _L9
_L5:
        byte0 = 114;
          goto _L9
_L6:
        byte0 = 3;
          goto _L9
        byte0 = 4;
          goto _L9
    }
}
