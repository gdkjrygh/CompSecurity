// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.content.Context;
import android.net.http.AndroidHttpClient;
import android.util.Log;
import android.util.TimingLogger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// Referenced classes of package com.a.a:
//            f, d, c, a

public class e
{

    protected static final char F[];
    private static final String G;
    private static final Executor H;
    private static final MessageDigest I;
    public static String b;
    boolean A;
    boolean B;
    ArrayList C;
    c D;
    final ArrayList E = new ArrayList();
    private Context J;
    private Thread K;
    private a L;
    private String M;
    private String N;
    private String O;
    private int P;
    private String Q;
    private final ReadWriteLock R = new ReentrantReadWriteLock();
    private final Lock S;
    private final Lock T;
    private final ReentrantLock U = new ReentrantLock();
    private boolean V;
    private volatile f W;
    private final d X = new d();
    private CountDownLatch Y;
    private TimingLogger Z;
    AndroidHttpClient a;
    String c;
    int d;
    String e;
    String f;
    String g;
    int h;
    int i;
    int j;
    int k;
    String l;
    String m;
    String n;
    String o;
    String p;
    String q;
    String r;
    int s;
    String t;
    String u;
    String v;
    String w;
    int x;
    String y;
    String z;

    public e()
    {
        a = null;
        c = null;
        d = 10000;
        e = null;
        f = null;
        g = null;
        h = 0;
        i = 0;
        j = 0;
        k = 0;
        l = null;
        m = null;
        n = null;
        o = "0";
        p = null;
        q = null;
        r = null;
        s = 0;
        t = null;
        u = null;
        v = null;
        w = null;
        x = 0;
        y = null;
        z = null;
        A = false;
        B = false;
        C = null;
        D = null;
        J = null;
        K = null;
        L = null;
        M = null;
        N = null;
        O = null;
        P = 0;
        Q = null;
        S = R.readLock();
        T = R.writeLock();
        V = false;
        W = f.b;
        Y = null;
        Z = null;
    }

    static 
    {
        MessageDigest messagedigest;
        G = com/a/a/e.getSimpleName();
        H = Executors.newFixedThreadPool(6);
        b = "2.1.4";
        messagedigest = null;
        MessageDigest messagedigest1 = MessageDigest.getInstance("MD5");
        messagedigest = messagedigest1;
_L2:
        I = messagedigest;
        F = "0123456789abcdef".toCharArray();
        return;
        NoSuchAlgorithmException nosuchalgorithmexception;
        nosuchalgorithmexception;
        Log.v(G, "MD5 digest failed", nosuchalgorithmexception);
        if (true) goto _L2; else goto _L1
_L1:
    }
}
