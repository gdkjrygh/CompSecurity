// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.net;

import android.text.TextUtils;
import android.util.Log;
import com.sessionm.b.a;
import com.sessionm.core.Config;
import com.sessionm.core.Session;
import com.sessionm.core.StatsCollector;
import com.sessionm.core.h;
import com.sessionm.net.http.c;
import com.sessionm.net.http.d;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.sessionm.net:
//            b, c, a

public class Request extends b
    implements Serializable
{
    public static final class Header extends Enum
    {

        public static final Header go;
        public static final Header gp;
        public static final Header gq;
        public static final Header gr;
        public static final Header gs;
        public static final Header gt;
        private static final Header gv[];
        private final String gu;

        public static Header valueOf(String s)
        {
            return (Header)Enum.valueOf(com/sessionm/net/Request$Header, s);
        }

        public static Header[] values()
        {
            return (Header[])gv.clone();
        }

        public String getKey()
        {
            return gu;
        }

        static 
        {
            go = new Header("CACHE_CONTROL", 0, "Cache-Control");
            gp = new Header("USER_AGENT", 1, "User-Agent");
            gq = new Header("CONTENT_TYPE", 2, "Content-Type");
            gr = new Header("SET_COOKIE", 3, "Set-Cookie");
            gs = new Header("LOCATION", 4, "Location");
            gt = new Header("CONTENT_LENGTH", 5, "Content-Length");
            gv = (new Header[] {
                go, gp, gq, gr, gs, gt
            });
        }

        private Header(String s, int i, String s1)
        {
            super(s, i);
            gu = s1;
        }
    }

    public static final class Method extends Enum
    {

        public static final Method gA;
        private static final Method gB[];
        public static final Method gw;
        public static final Method gx;
        public static final Method gy;
        public static final Method gz;

        public static Method valueOf(String s)
        {
            return (Method)Enum.valueOf(com/sessionm/net/Request$Method, s);
        }

        public static Method[] values()
        {
            return (Method[])gB.clone();
        }

        static 
        {
            gw = new Method("POST", 0);
            gx = new Method("GET", 1);
            gy = new Method("DELETE", 2);
            gz = new Method("PUT", 3);
            gA = new Method("GENERIC", 4);
            gB = (new Method[] {
                gw, gx, gy, gz, gA
            });
        }

        private Method(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class Priority extends Enum
    {

        public static final Priority gC;
        public static final Priority gD;
        public static final Priority gE;
        private static final Priority gF[];

        public static Priority valueOf(String s)
        {
            return (Priority)Enum.valueOf(com/sessionm/net/Request$Priority, s);
        }

        public static Priority[] values()
        {
            return (Priority[])gF.clone();
        }

        static 
        {
            gC = new Priority("LOW", 0);
            gD = new Priority("NORMAL", 1);
            gE = new Priority("HIGH", 2);
            gF = (new Priority[] {
                gC, gD, gE
            });
        }

        private Priority(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class State extends Enum
    {

        public static final State gG;
        public static final State gH;
        public static final State gI;
        public static final State gJ;
        private static final State gK[];

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/sessionm/net/Request$State, s);
        }

        public static State[] values()
        {
            return (State[])gK.clone();
        }

        public boolean bh()
        {
            return this == gI || this == gJ;
        }

        static 
        {
            gG = new State("UNSENT", 0);
            gH = new State("SENDING", 1);
            gI = new State("COMPLETED", 2);
            gJ = new State("FAILED", 3);
            gK = (new State[] {
                gG, gH, gI, gJ
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class Type extends Enum
    {

        public static final Type gL;
        public static final Type gM;
        public static final Type gN;
        public static final Type gO;
        public static final Type gP;
        public static final Type gQ;
        public static final Type gR;
        public static final Type gS;
        public static final Type gT;
        public static final Type gU;
        public static final Type gV;
        public static final Type gW;
        public static final Type gX;
        public static final Type gY;
        public static final Type gZ;
        public static final Type ha;
        private static final Type hd[];
        private final Method fO;
        private final String hb;
        private final int hc;

        static Method a(Type type)
        {
            return type.fO;
        }

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/sessionm/net/Request$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])hd.clone();
        }

        Method aQ()
        {
            return fO;
        }

        String getPath()
        {
            return hb;
        }

        int getTimeout()
        {
            return hc;
        }

        static 
        {
            gL = new Type("SESSION_START", 0, "/v%s/apps/%s/session.json", Method.gw, 30000);
            gM = new Type("ACTION", 1, "/v%s/events.json", Method.gw);
            gN = new Type("SESSION_END", 2, "/v%s/session.json", Method.gw, 5000);
            gO = new Type("SESSION_UPDATE", 3, "/v%s/session.json", Method.gz);
            gP = new Type("CONTENT", 4, "", Method.gx);
            gQ = new Type("ERROR", 5, "/v%s/apps/%s/errors.json", Method.gw);
            gR = new Type("DELIVERED", 6, "/v%s/apps/%s/bugs/delivered.json", Method.gx);
            gS = new Type("CLAIM", 7, "/v%s/apps/%s/awards/%s/ads", Method.gx);
            gT = new Type("CLAIMABLEACHIEVEMENT", 8, "/v%s/apps/%s/claimable_achievement.json", Method.gx);
            gU = new Type("ACHIEVEMENTSLIST", 9, "/v%s/apps/%s/achievements_list.json", Method.gx);
            gV = new Type("GENERIC", 10, "", Method.gA);
            gW = new Type("OPT_IN_OUT", 11, "/optout.json", Method.gz);
            gX = new Type("CPI", 12, "/transactions", Method.gw);
            gY = new Type("LOG_IN", 13, "/members/login.json", Method.gw);
            gZ = new Type("SIGN_UP", 14, "/members/signup.json", Method.gw);
            ha = new Type("LOG_OUT", 15, "/members/logout.json", Method.gx);
            hd = (new Type[] {
                gL, gM, gN, gO, gP, gQ, gR, gS, gT, gU, 
                gV, gW, gX, gY, gZ, ha
            });
        }

        private Type(String s, int i, String s1, Method method)
        {
            super(s, i);
            hb = s1;
            fO = method;
            hc = -1;
        }

        private Type(String s, int i, String s1, Method method, int j)
        {
            super(s, i);
            hb = s1;
            fO = method;
            hc = j;
        }
    }


    private static final String TAG = "SessionM.Request";
    private static final char fK[] = {
        'g', 'R', '\235', 'l', '\264', 'w', '\374', '\357', '\032', ')', 
        '\013', '\252', '\317', '\304', '\336', '\301', ']', '\231', '\206', 'z', 
        '\254', 'Q', '\316', '\237', '\302', '\254', '\033', '\035', 'E', 'G', 
        '\301', '\360', '=', '6', '\271', '\315', 'N', 'm', '\026', '8', 
        '\243', '\005', '\001', '\320', '2', '\225', '=', '!', '\222', '\263', 
        '\200', '\303', '\261', '\366', 's', '\362', '[', '\247', '\023', ',', 
        '#', 'k', 'n', '\246', 'D', '\332', '\356', '\231', '\020', '\025', 
        'k', 'O', '\020', '\351', '\264', '\356', '\271', '\346', '\232', '\207', 
        '\232', '\\', 'e', '\031', 'D', '\311', '\343', '\314', '\351', 'j', 
        '\362', '\177', '\376', '[', 'u', 'd', '8', '{', 'V', '\246', 
        'u', '\013', '\242', '*', '\006', '6', 'o', '\243', '4', '\326', 
        '\330', 'B', '\036', '\t', ')', 'z', '\r', '5', 'W', '+', 
        '=', '\316', '\354', '\331', '\357', 'R', '\212', '\262', 'K', '\020', 
        '\335', '\346', '\205', '\243', '\326', 'a', '5', '\'', '\223', '-', 
        '\252', '\335', '\321', '\370', '\242', '\024', '\335', '\313', '\200', ';', 
        '\340', 'O', '\305', '\300', '\313', '=', '\257', '\206', '\375', 'l', 
        '%', 'R', '\025', '~', 'x', '\277', '\305', '\025', '\304', '\300', 
        '\272', '\315', 'T', '(', '\337', 'Z', '\272', 'L', '}', '|', 
        '?', 'c', '\352', '\030', '\021', 'v', '\227', '\233', '\004', '\213', 
        '\260', '\306', '\033', '\326', '\223', '\261', '\316', ']', '\270', '\277', 
        '\323', '\236', '\231', '\373', '\367', '\r', 'n', '6', '-', '\243', 
        'g', 'F', '\245', ')', 'F', '3', '\215', '\023', '\270', '\0', 
        '\215', '\272', 'g', '\346', '-', '\340', '\t', '\357', '\235', 'O', 
        '\337', '\217', '\037', '\236', 'w', ')', '\232', ':', 't', 'N', 
        '\202', '\325', '\341', '7', '_', '\324', 'v', '?', '\204', '<', 
        '\226', '\002', '\263', '%', '\327', '\322', '\322', 'g', 'Y', '\021', 
        '\315', '\201', 'X', '\312', '\311', 'g', '9', '\220', '\035', 'P', 
        '\b', ')', '}', '\266', '\247', '\223', '\376', '\374', '!', '\246', 
        '\202', '!', '\031', '\222', '\360', 'Z', '\031', '\215', 'j', '\217', 
        '\222', '\313', 't', '\315', '\347', '\313', '\305', 'X', '\301', 'm', 
        '\236', '\274', '\330', '%', '\323', '\f', '\307', '\357', 'B', 'E', 
        'I', '\320', 'e', '\r', '\004', '\0', '\027', '\204', '\336', '\n', 
        '\\', '\212', '\254', '\013', '&', 'h', '\326', '\342', 'E', '2', 
        '\270', 'k', '\240', '\273', '\345', '\261', '\270', '\306', '\177', '\252', 
        '\212', 'Y', '\301', '\204', '\b', '\256', 'F', '\326', 'U', 'v', 
        '@', '\342', '\223', '7', '>', '\214', 'r', '\354', '\021', '\324', 
        'L', '\026', 'L', 'g', '\314', '\314', '\246', '\314', '\177', '\334', 
        '\b', 'A', '\013', 'd', '\301', '\233', '<', '\202', '\316', 'K', 
        '\244', 'm', '\215', '\317', '+', '\201', '3', '\336', '\357', '\377', 
        '\005', 'X', '\335', '\204', '\341', '\370', '\364', '\253', 'H', '\321', 
        'm', 'w', '\266', '\232', '\213', 'Z', 'g', '\227', '\347', '\207', 
        '\347', '\034', '3', '\354', '\303', '\303', '\213', '\276', '$', '\371', 
        ':', '{', '\244', '*', 'F', '\244', '\224', '\007', '\020', '\335', 
        '/', '\364', '\371', '\t', '\007', '\013', '<', '_', '\255', '\341', 
        '\267', '\225', '\022', '\230', '\236', '\265', 'L', '\256', 'x', '\364', 
        'b', 'R', '\331', '\273', '\276', '\325', '\364', 'u', 'e', 'u', 
        '|', '8', '\241', '\021', '`', '#', '\345', 'S', '\205', '\242', 
        '\374', '\005', '\037', 'l', 'G', '<', '\376', 'V', '\250', '\002', 
        '\177', '\003', '\212', '1', '\325', 'K', '\324', 'x', '\210', '\220', 
        '\262', '\240', '\'', '{', '-', '\266', '\333', '<', '\354', ',', 
        'f', '\246', '\023', 'k', '\345', '`', '\021', 'G', '\027', '.', 
        '\024', '\022'
    };
    private static final List fQ = Collections.synchronizedList(new ArrayList());
    private static byte key[];
    private static final long serialVersionUID = 0x4f733511c180f109L;
    private String b;
    private Type fL;
    private a fM;
    private String fN;
    private Method fO;
    private com.sessionm.net.c fP;
    private d fR;
    private Map fS;
    private Throwable fT;
    private int fU;
    private com.sessionm.net.a fV;
    private boolean fW;
    private long fX;
    private long fY;
    private long fZ;
    private Priority ga;
    private Map gb;
    a gc;
    private com.sessionm.c.c gd;
    private List ge;
    private String gf;
    private int gg;
    private int gh;
    private State gi;
    private boolean gj;
    private Request gk;
    private File gl;
    private boolean gm;
    private String url;

    public Request(Type type)
    {
        this(type, (Object[])null);
    }

    public transient Request(Type type, Object aobj[])
    {
        fZ = System.currentTimeMillis();
        ga = Priority.gD;
        gb = new HashMap();
        gi = State.gG;
        gm = true;
        if (type == null)
        {
            throw new NullPointerException("Request type is null");
        }
        fL = type;
        fO = com.sessionm.net.Type.a(type);
        if (!fL.equals(Type.gL) && !fL.equals(Type.gR) && !fL.equals(Type.gQ) && !fL.equals(Type.gS) && !fL.equals(Type.gU) && !fL.equals(Type.gT)) goto _L2; else goto _L1
_L1:
        gf = (String)aobj[0];
        if (fL.equals(Type.gS))
        {
            b = (String)aobj[1];
        }
_L4:
        fN = UUID.randomUUID().toString();
        return;
_L2:
        if (fL.equals(Type.gP))
        {
            if (aobj.length != 1)
            {
                throw new NullPointerException("url not provided for content request!");
            }
            url = (String)aobj[0];
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Request(String s, String s1)
    {
        this(Type.gV);
        url = s;
        if (s1.equalsIgnoreCase("GET"))
        {
            fO = Method.gx;
        } else
        {
            if (s1.equalsIgnoreCase("POST"))
            {
                fO = Method.gw;
                return;
            }
            if (s1.equalsIgnoreCase("PUT"))
            {
                fO = Method.gz;
                return;
            }
            if (s1.equalsIgnoreCase("DELETE"))
            {
                fO = Method.gy;
                return;
            }
        }
    }

    private String E(String s)
    {
        long l = System.currentTimeMillis();
        String s1;
        if (s.equals(""))
        {
            s1 = (new StringBuilder()).append("z=").append(l).toString();
        } else
        {
            s1 = s;
            if (!s.contains("&z="))
            {
                s1 = s;
                if (!s.startsWith("z="))
                {
                    return (new StringBuilder()).append(s).append("&z=").append(l).toString();
                }
            }
        }
        return s1;
    }

    private String F(String s)
    {
        String s1;
label0:
        {
            s1 = s;
            if (gk != null)
            {
                s1 = gk.bf();
                String s2 = gk.aQ().toString();
                long l = gk.aX();
                s1 = String.format(Locale.US, "lu=%s&lm=%s&lt=%d&retry=%d&rc=%d", new Object[] {
                    s1, s2, Long.valueOf(l), Integer.valueOf(gg), Integer.valueOf(gh)
                });
                if (s != null && !s.equals(""))
                {
                    break label0;
                }
            }
            return s1;
        }
        return String.format("%s&%s", new Object[] {
            s, s1
        });
    }

    public static String a(String s, String s1, String s2)
    {
        Object obj = Session.D();
        String s4 = ((Session) (obj)).E();
        String s3 = ((Session) (obj)).F();
        obj = s3;
        if (s3 == null)
        {
            obj = "";
        }
        s = String.format(Locale.US, "%s%s%s%s%s", new Object[] {
            s1.toUpperCase(Locale.US), s, com.sessionm.core.h.s(s2), s4, obj
        });
        if (Log.isLoggable("SessionM.Signing", 3))
        {
            Log.d("SessionM.Signing", String.format("Plaintext: %s", new Object[] {
                s
            }));
        }
        try
        {
            s = com.sessionm.core.h.a(s, getKey());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("SessionM.Request", "Exception generating request parameters", s);
            return null;
        }
        return s;
    }

    private void a(State state)
    {
        if (Log.isLoggable("SessionM.Request", 3))
        {
            Log.d("SessionM.Request", String.format("transitioning request from state: %s to %s", new Object[] {
                gi, state
            }));
        }
        if (gi == state && Log.isLoggable("SessionM.Request", 6))
        {
            Log.e("SessionM.Request", String.format(Locale.US, "Same state transition for state %s", new Object[] {
                state
            }));
        }
        static class _cls1
        {

            static final int gn[];

            static 
            {
                gn = new int[State.values().length];
                try
                {
                    gn[State.gH.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    gn[State.gI.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    gn[State.gJ.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    gn[State.gG.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.gn[state.ordinal()];
        JVM INSTR tableswitch 1 4: default 116
    //                   1 122
    //                   2 178
    //                   3 224
    //                   4 270;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        gi = state;
        return;
_L2:
        if (gi != State.gG && gi != State.gJ && Log.isLoggable("SessionM.Request", 6))
        {
            Log.e("SessionM.Request", String.format(Locale.US, "Incorrect state transition, state %s", new Object[] {
                state
            }));
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (gi != State.gH && Log.isLoggable("SessionM.Request", 6))
        {
            Log.e("SessionM.Request", String.format(Locale.US, "Incorrect state transition, state %s", new Object[] {
                state
            }));
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (gi != State.gH && Log.isLoggable("SessionM.Request", 6))
        {
            Log.e("SessionM.Request", String.format(Locale.US, "Incorrect state transition, state %s", new Object[] {
                state
            }));
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (!gi.bh() && Log.isLoggable("SessionM.Request", 6))
        {
            Log.e("SessionM.Request", String.format(Locale.US, "Incorrect state transition, state %s", new Object[] {
                state
            }));
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    private static void a(StringBuilder stringbuilder, Object obj, String s)
        throws Exception
    {
        if (!(obj instanceof a)) goto _L2; else goto _L1
_L1:
        a(stringbuilder, ((a)obj).aL(), s);
_L4:
        return;
_L2:
        if (!(obj instanceof JSONObject))
        {
            break; /* Loop/switch isn't completed */
        }
        JSONObject jsonobject = (JSONObject)obj;
        Iterator iterator = jsonobject.keys();
        while (iterator.hasNext()) 
        {
            String s1 = iterator.next().toString();
            Object obj1;
            if (s != null)
            {
                obj = String.format(Locale.US, "%s[%s]", new Object[] {
                    s, URLEncoder.encode(s1, "UTF-8")
                });
            } else
            {
                obj = URLEncoder.encode(s1, "UTF-8");
            }
            obj1 = jsonobject.get(s1);
            if (jsonobject.isNull(s1))
            {
                obj1 = null;
            }
            a(stringbuilder, obj1, ((String) (obj)));
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!(obj instanceof JSONArray))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (JSONArray)obj;
        int i = 0;
        while (i < ((JSONArray) (obj)).length()) 
        {
            a(stringbuilder, ((JSONArray) (obj)).get(i), String.format(Locale.US, "%s[]", new Object[] {
                s
            }));
            i++;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (!(obj instanceof Object[]))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((Object) ((Object[])(Object[])obj));
        int k = obj.length;
        int j = 0;
        while (j < k) 
        {
            a(stringbuilder, obj[j], String.format(Locale.US, "%s[]", new Object[] {
                s
            }));
            j++;
        }
        if (true) goto _L4; else goto _L6
_L6:
        if (s == null) goto _L4; else goto _L7
_L7:
        if (obj != null)
        {
            stringbuilder.append(String.format(Locale.US, "&%s=%s", new Object[] {
                s, URLEncoder.encode(obj.toString(), "UTF-8")
            }));
            return;
        } else
        {
            stringbuilder.append(String.format(Locale.US, "&%s=", new Object[] {
                s
            }));
            return;
        }
    }

    private static byte[] a(char ac[])
    {
        byte abyte0[] = new byte[ac.length];
        for (int i = 0; i < abyte0.length; i++)
        {
            abyte0[i] = (byte)ac[i];
        }

        return abyte0;
    }

    private String aO()
    {
        Session session = Session.D();
        String s = Config.f().getValue("api.server.url");
        if (fL.equals(Type.gX) || fL.equals(Type.gS) || fL.equals(Type.gR))
        {
            s = session.ae();
        } else
        {
            if (fL.equals(Type.gM))
            {
                return session.af();
            }
            if (fL.equals(Type.gW))
            {
                return session.ag();
            }
            if (fL.equals(Type.gL) || fL.equals(Type.gN) || fL.equals(Type.gO) || fL.equals(Type.gU) || fL.equals(Type.gT) || fL.equals(Type.gY) || fL.equals(Type.gZ) || fL.equals(Type.ha))
            {
                return session.ai();
            }
        }
        return s;
    }

    public static void b(com.sessionm.net.c c1)
    {
        fQ.add(c1);
    }

    private String bf()
    {
        String s;
        Object obj;
        obj = Config.f();
        s = null;
        obj = ((Config) (obj)).getValue("api.version");
        if (fL != Type.gL) goto _L2; else goto _L1
_L1:
        s = String.format(fL.getPath(), new Object[] {
            obj, gf
        });
_L4:
        obj = s;
        if (s == null)
        {
            try
            {
                obj = (new URI(url)).getPath();
            }
            catch (URISyntaxException urisyntaxexception)
            {
                if (Log.isLoggable("SessionM.Request", 6))
                {
                    Log.e("SessionM.Request", (new StringBuilder()).append("invalid uri: ").append(url).toString(), urisyntaxexception);
                }
                gj = true;
                return s;
            }
        }
        return ((String) (obj));
_L2:
        if (fL == Type.gR)
        {
            s = String.format(fL.getPath(), new Object[] {
                obj, gf
            });
        } else
        if (fL == Type.gS)
        {
            s = String.format(fL.getPath(), new Object[] {
                obj, gf, b
            });
        } else
        if (fL == Type.gT)
        {
            s = String.format(fL.getPath(), new Object[] {
                obj, gf
            });
        } else
        if (fL == Type.gU)
        {
            s = String.format(fL.getPath(), new Object[] {
                obj, gf
            });
        } else
        if (fL == Type.gN)
        {
            s = String.format(fL.getPath(), new Object[] {
                obj
            });
        } else
        if (fL == Type.gM)
        {
            s = String.format(fL.getPath(), new Object[] {
                obj
            });
        } else
        if (fL == Type.gQ)
        {
            s = String.format(fL.getPath(), new Object[] {
                obj, gf
            });
        } else
        if (fL == Type.gO)
        {
            s = String.format(fL.getPath(), new Object[] {
                obj
            });
        } else
        if (fL == Type.gW)
        {
            s = fL.getPath();
        } else
        if (fL == Type.gX)
        {
            s = String.format(fL.getPath(), new Object[0]);
        } else
        if (fL == Type.gY)
        {
            s = String.format(fL.getPath(), new Object[0]);
        } else
        if (fL == Type.gZ)
        {
            s = String.format(fL.getPath(), new Object[0]);
        } else
        if (fL == Type.ha)
        {
            s = String.format(fL.getPath(), new Object[0]);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void c(com.sessionm.net.c c1)
    {
        fQ.remove(c1);
    }

    public static String e(a a1)
        throws Exception
    {
        StringBuilder stringbuilder = new StringBuilder();
        a(stringbuilder, a1, null);
        return stringbuilder.toString().replaceFirst("&", "");
    }

    private void f(String s, String s1)
    {
        gb.put(s, new ArrayList());
        ((List)gb.get(s)).add(s1);
    }

    private static byte[] getKey()
    {
        if (key == null)
        {
            key = a(fK);
        }
        return key;
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws ClassNotFoundException, IOException
    {
        gi = State.gG;
        fO = (Method)objectinputstream.readObject();
        fN = (String)objectinputstream.readObject();
        fM = com.sessionm.b.a.A((String)objectinputstream.readObject());
        fZ = objectinputstream.readLong();
        ga = (Priority)objectinputstream.readObject();
        url = (String)objectinputstream.readObject();
        fL = (Type)objectinputstream.readObject();
        gb = (Map)objectinputstream.readObject();
        gg = objectinputstream.readInt();
        gm = objectinputstream.readBoolean();
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.writeObject(fO);
        objectoutputstream.writeObject(fN);
        objectoutputstream.writeObject(aV());
        objectoutputstream.writeLong(fZ);
        objectoutputstream.writeObject(ga);
        objectoutputstream.writeObject(getURL());
        objectoutputstream.writeObject(fL);
        objectoutputstream.writeObject(gb);
        objectoutputstream.writeInt(gg);
        objectoutputstream.writeBoolean(gm);
    }

    public List a(Header header)
    {
        List list = null;
        if (fS != null)
        {
            list = com.sessionm.net.http.c.a(fS, header.getKey());
        }
        return list;
    }

    public void a(Priority priority)
    {
        ga = priority;
    }

    public void a(com.sessionm.net.a a1)
    {
        fV = a1;
    }

    public void a(com.sessionm.net.c c1)
    {
        if (c1 != null)
        {
            fP = c1;
        }
    }

    public void a(d d1, Throwable throwable, int i, Map map)
    {
        this;
        JVM INSTR monitorenter ;
        fR = d1;
        fT = throwable;
        fU = i;
        fS = map;
        fY = System.currentTimeMillis();
        if (fU == 0)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        a(State.gI);
_L1:
        if (fP != null)
        {
            fP.onReplyReceived(this);
        }
        d1 = fQ;
        d1;
        JVM INSTR monitorenter ;
        for (throwable = fQ.iterator(); throwable.hasNext(); ((com.sessionm.net.c)throwable.next()).onReplyReceived(this)) { }
        break MISSING_BLOCK_LABEL_119;
        throwable;
        d1;
        JVM INSTR monitorexit ;
        throw throwable;
        d1;
        this;
        JVM INSTR monitorexit ;
        throw d1;
        a(State.gJ);
          goto _L1
        d1;
        JVM INSTR monitorexit ;
        StatsCollector.c(this);
        this;
        JVM INSTR monitorexit ;
    }

    public void aM()
    {
        gg = gg + 1;
        a(State.gH);
        if (fP != null)
        {
            fP.onRequestSent(this);
        }
        StatsCollector.a(com.sessionm.core.StatsCollector.Stat.eD, 0L);
        List list = fQ;
        list;
        JVM INSTR monitorenter ;
        for (Iterator iterator = fQ.iterator(); iterator.hasNext(); ((com.sessionm.net.c)iterator.next()).onRequestSent(this)) { }
        break MISSING_BLOCK_LABEL_84;
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        list;
        JVM INSTR monitorexit ;
    }

    public File aN()
    {
        File file = null;
        if (fP != null)
        {
            file = fP.outputFileForRequest(this);
        }
        return file;
    }

    public int aP()
    {
        return gg;
    }

    public Method aQ()
    {
        return fO;
    }

    public boolean aR()
    {
        return fW;
    }

    public Type aS()
    {
        return fL;
    }

    public Throwable aT()
    {
        return fT;
    }

    public d aU()
    {
        this;
        JVM INSTR monitorenter ;
        d d1 = fR;
        this;
        JVM INSTR monitorexit ;
        return d1;
        Exception exception;
        exception;
        throw exception;
    }

    public String aV()
    {
        if (fM != null)
        {
            return fM.toString();
        } else
        {
            return null;
        }
    }

    public a aW()
    {
        return fM;
    }

    public long aX()
    {
        long l1 = -1L;
        long l = l1;
        if (fX > 0L)
        {
            l = l1;
            if (fY > 0L)
            {
                l = fY - fX;
            }
        }
        return l;
    }

    public long aY()
    {
        return fZ;
    }

    public a aZ()
    {
        Object obj1 = null;
        this;
        JVM INSTR monitorenter ;
        if (gc != null) goto _L2; else goto _L1
_L1:
        Object obj;
        if (aU() == null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        obj = aU().bD();
_L7:
        boolean flag = TextUtils.isEmpty(((CharSequence) (obj)));
        if (!flag) goto _L4; else goto _L3
_L3:
        obj = obj1;
_L6:
        this;
        JVM INSTR monitorexit ;
        return ((a) (obj));
_L4:
        gc = com.sessionm.b.a.A(((String) (obj)));
        if (gc == null && fT == null && !fL.equals(Type.gN) && !fL.equals(Type.gV) && Log.isLoggable("SessionM.Request", 5))
        {
            Log.w("SessionM.Request", (new StringBuilder()).append("Unable to parse JSON response: ").append(aU()).toString());
        }
_L2:
        obj = gc;
        if (true) goto _L6; else goto _L5
_L5:
        obj;
        throw obj;
        obj = null;
          goto _L7
    }

    public void b(File file)
    {
        gl = file;
    }

    void b(List list)
    {
        ge = new ArrayList();
        ge.add(this);
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Request request = (Request)list.next();
            if (this != request)
            {
                ge.add(request);
            }
        } while (true);
    }

    public void b(Map map)
    {
        fS = map;
        map = a(Header.gs);
        if (map != null)
        {
            map = (String)map.get(0);
            if (map != null)
            {
                url = map;
            }
        }
    }

    public com.sessionm.c.c ba()
    {
        return gd;
    }

    public List bb()
    {
        if (ge == null)
        {
            ge = new ArrayList();
            ge.add(this);
        }
        return ge;
    }

    public int bc()
    {
        if (ge == null)
        {
            return 1;
        } else
        {
            return ge.size();
        }
    }

    public State bd()
    {
        return gi;
    }

    boolean be()
    {
        return gj;
    }

    boolean bg()
    {
        return fU >= 200 && fU < 300;
    }

    public void c(com.sessionm.c.c c1)
    {
        gd = c1;
    }

    public void d(a a1)
    {
        fM = a1;
    }

    void d(Request request)
    {
        gk = request;
    }

    public void e(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        if (gb.get(s) != null) goto _L2; else goto _L1
_L1:
        f(s, s1);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ((List)gb.get(s)).add(s1);
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public void g(boolean flag)
    {
        gm = flag;
    }

    public String getID()
    {
        return fN;
    }

    public int getStatusCode()
    {
        return fU;
    }

    public String getURL()
    {
        this;
        JVM INSTR monitorenter ;
        if (url == null) goto _L2; else goto _L1
_L1:
        String s = url;
_L4:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        url = String.format(Locale.US, "%s%s", new Object[] {
            aO(), bf()
        });
        s = url;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void h(boolean flag)
    {
        fW = flag;
    }

    void o(int i)
    {
        gh = i;
    }

    public void reset()
    {
        this;
        JVM INSTR monitorenter ;
        a(State.gG);
        fR = null;
        fS = null;
        fT = null;
        fU = 0;
        fY = 0L;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void send()
    {
        Object obj;
        Object obj1;
        Method method = aQ();
        if (fM == null)
        {
            obj1 = "";
        } else
        {
            try
            {
                obj1 = e(fM);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                if (Log.isLoggable("SessionM.Request", 6))
                {
                    Log.e("SessionM.Request", "Error parsing request parameters. Bailing out of request.");
                }
                gj = true;
                a(null, ((Throwable) (obj)), 0, null);
                return;
            }
        }
        f(Header.gp.getKey(), String.format("%s SessionM Android SDK", new Object[] {
            System.getProperties().getProperty("http.agent")
        }));
        if (fL == Type.gP)
        {
            break MISSING_BLOCK_LABEL_399;
        }
        if (method == Method.gx) goto _L2; else goto _L1
_L1:
        obj = obj1;
        if (method != Method.gy) goto _L3; else goto _L2
_L2:
        Object obj2;
        try
        {
            obj2 = new URI(getURL());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("SessionM.Request", "Invalid URL", ((Throwable) (obj)));
            a(null, ((Throwable) (obj)), 0, null);
            return;
        }
        obj = obj1;
        if (((URI) (obj2)).getQuery() == null) goto _L3; else goto _L4
_L4:
        if (!((String) (obj1)).equals("")) goto _L6; else goto _L5
_L5:
        obj = ((URI) (obj2)).getQuery();
_L3:
        obj1 = obj;
        if (!fL.equals(Type.gX))
        {
            obj1 = F(((String) (obj)));
        }
        obj1 = E(((String) (obj1)));
        obj2 = a(getURL(), method.toString(), ((String) (obj1)));
        obj = obj1;
        if (obj2 != null)
        {
            obj = (new StringBuilder()).append(((String) (obj1))).append("&sig=").append(((String) (obj2))).toString();
        }
_L7:
label0:
        {
            obj2 = url;
            obj1 = obj2;
            if (fL == Type.gP)
            {
                break label0;
            }
            if (method != Method.gx)
            {
                obj1 = obj2;
                if (method != Method.gy)
                {
                    break label0;
                }
            }
            obj1 = String.format("%s?%s", new Object[] {
                obj2, obj
            });
        }
        if (fV == null)
        {
            fV = Session.D().W();
        }
        fX = System.currentTimeMillis();
        fV.a(((String) (obj1)), method.toString(), ((String) (obj)), this, ga.ordinal(), gb, fL.getTimeout(), gl);
        return;
_L6:
        obj = (new StringBuilder()).append(((String) (obj1))).append("&").append(((URI) (obj2)).getQuery()).toString();
          goto _L3
        obj = obj1;
          goto _L7
    }

    public String toString()
    {
        String s;
        String s1;
        if (fM != null)
        {
            s = (new StringBuilder()).append(" ").append(fM).toString();
        } else
        {
            s = "";
        }
        if (url != null)
        {
            s1 = (new StringBuilder()).append(" ").append(url).toString();
        } else
        {
            s1 = "";
        }
        return String.format(Locale.US, "<Request id: %s state: %s url: %s params: %s>", new Object[] {
            getID(), gi, s1, s
        });
    }

}
