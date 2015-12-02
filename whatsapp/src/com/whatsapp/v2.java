// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

class v2
{

    private static final String z[];
    private FloatBuffer a;
    private int b;
    private int c;
    private int d;
    private float e[];
    private float f[];
    private final float g[] = {
        -1F, -1F, 0.0F, 0.0F, 0.0F, 1.0F, -1F, 0.0F, 1.0F, 0.0F, 
        -1F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F
    };
    private int h;
    private int i;
    private int j;

    public v2()
    {
        f = new float[16];
        e = new float[16];
        i = -12345;
        a = ByteBuffer.allocateDirect(g.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        a.put(g).position(0);
        Matrix.setIdentityM(e, 0);
    }

    private int a(int k, String s)
    {
        int l = GLES20.glCreateShader(k);
        a((new StringBuilder()).append(z[7]).append(k).toString());
        GLES20.glShaderSource(l, s);
        GLES20.glCompileShader(l);
        s = new int[1];
        GLES20.glGetShaderiv(l, 35713, s, 0);
        if (s[0] == 0)
        {
            Log.e(z[9], (new StringBuilder()).append(z[10]).append(k).append(":").toString());
            Log.e(z[8], (new StringBuilder()).append(" ").append(GLES20.glGetShaderInfoLog(l)).toString());
            GLES20.glDeleteShader(l);
            return 0;
        } else
        {
            return l;
        }
    }

    private int a(String s, String s1)
    {
        int k = a(35633, s);
        if (k != 0) goto _L2; else goto _L1
_L1:
        int l;
        return 0;
_L2:
        if ((l = a(35632, s1)) == 0) goto _L1; else goto _L3
_L3:
        int i1;
        i1 = GLES20.glCreateProgram();
        try
        {
            a(z[13]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        Log.e(z[12], z[15]);
        GLES20.glAttachShader(i1, k);
        a(z[11]);
        GLES20.glAttachShader(i1, l);
        a(z[17]);
        GLES20.glLinkProgram(i1);
        s = new int[1];
        GLES20.glGetProgramiv(i1, 35714, s, 0);
        if (s[0] != 1)
        {
            Log.e(z[16], z[14]);
            Log.e(z[18], GLES20.glGetProgramInfoLog(i1));
            GLES20.glDeleteProgram(i1);
            return 0;
        } else
        {
            return i1;
        }
    }

    public int a()
    {
        return i;
    }

    public void a(SurfaceTexture surfacetexture)
    {
        a(z[0]);
        surfacetexture.getTransformMatrix(e);
        GLES20.glClearColor(0.0F, 1.0F, 0.0F, 1.0F);
        GLES20.glClear(16640);
        GLES20.glUseProgram(b);
        a(z[1]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        a.position(0);
        GLES20.glVertexAttribPointer(c, 3, 5126, false, 20, a);
        a(z[2]);
        GLES20.glEnableVertexAttribArray(c);
        a(z[5]);
        a.position(3);
        GLES20.glVertexAttribPointer(h, 2, 5126, false, 20, a);
        a(z[6]);
        GLES20.glEnableVertexAttribArray(h);
        a(z[4]);
        Matrix.setIdentityM(f, 0);
        GLES20.glUniformMatrix4fv(d, 1, false, f, 0);
        GLES20.glUniformMatrix4fv(j, 1, false, e, 0);
        GLES20.glDrawArrays(5, 0, 4);
        a(z[3]);
        GLES20.glFinish();
    }

    public void a(String s)
    {
        int k = GLES20.glGetError();
        if (k != 0)
        {
            try
            {
                Log.e(z[37], (new StringBuilder()).append(s).append(z[38]).append(k).toString());
                throw new RuntimeException((new StringBuilder()).append(s).append(z[36]).append(k).toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        } else
        {
            return;
        }
    }

    public void b()
    {
        try
        {
            b = a(z[34], z[35]);
            if (b == 0)
            {
                throw new RuntimeException(z[24]);
            }
        }
        catch (RuntimeException runtimeexception)
        {
            throw runtimeexception;
        }
        try
        {
            c = GLES20.glGetAttribLocation(b, z[30]);
            a(z[31]);
            if (c == -1)
            {
                throw new RuntimeException(z[22]);
            }
        }
        catch (RuntimeException runtimeexception1)
        {
            throw runtimeexception1;
        }
        try
        {
            h = GLES20.glGetAttribLocation(b, z[28]);
            a(z[27]);
            if (h == -1)
            {
                throw new RuntimeException(z[25]);
            }
        }
        catch (RuntimeException runtimeexception2)
        {
            throw runtimeexception2;
        }
        try
        {
            d = GLES20.glGetUniformLocation(b, z[29]);
            a(z[20]);
            if (d == -1)
            {
                throw new RuntimeException(z[21]);
            }
        }
        catch (RuntimeException runtimeexception3)
        {
            throw runtimeexception3;
        }
        try
        {
            j = GLES20.glGetUniformLocation(b, z[33]);
            a(z[19]);
            if (j == -1)
            {
                throw new RuntimeException(z[32]);
            }
        }
        catch (RuntimeException runtimeexception4)
        {
            throw runtimeexception4;
        }
        int ai[] = new int[1];
        GLES20.glGenTextures(1, ai, 0);
        i = ai[0];
        GLES20.glBindTexture(36197, i);
        a(z[23]);
        GLES20.glTexParameterf(36197, 10241, 9729F);
        GLES20.glTexParameterf(36197, 10240, 9729F);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        a(z[26]);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int k;
        as = new String[39];
        obj = "P?Ak\036H\027wx\022Zqvm\036M%";
        byte0 = -1;
        k = 0;
_L2:
        String as1[];
        int l;
        int i1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        i1 = obj.length;
        l = 0;
_L8:
label0:
        {
            if (i1 > l)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[k] = ((String) (obj));
                obj = "X=Pj\032o#j~\r^<";
                k = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[k] = ((String) (obj));
                obj = "X=S|\rK4}X\013K#l{/P8km\032Mqhx/P\"lm\026P?";
                k = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[k] = ((String) (obj));
                k = 3;
                obj = "X=Ak\036H\020wk\036F\"";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[k] = ((String) (obj));
                k = 4;
                obj = "X=@w\036]=`O\032M%`a>K%wp\035~#wx\006\037<dM\032G%pk\032w0k}\023Z";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[k] = ((String) (obj));
                obj = "X=@w\036]=`O\032M%`a>K%wp\035~#wx\006\037<dI\020L8qp\020Q\031dw\033S4";
                byte0 = 4;
                k = 5;
                break;

            case 4: // '\004'
                as1[k] = ((String) (obj));
                k = 6;
                obj = "X=S|\rK4}X\013K#l{/P8km\032Mqhx+Z)ql\rZ\031dw\033S4";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[k] = ((String) (obj));
                k = 7;
                obj = "X=Fk\032^%`J\027^5`k_K(u|B";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[k] = ((String) (obj));
                k = 8;
                obj = "k4}m\nM4W|\021[4w";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[k] = ((String) (obj));
                k = 9;
                obj = "k4}m\nM4W|\021[4w";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[k] = ((String) (obj));
                k = 10;
                obj = "|>pu\033\037?jm_\\>hi\026S4%j\027^5`k_";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[k] = ((String) (obj));
                k = 11;
                obj = "X=Dm\013^2mJ\027^5`k";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[k] = ((String) (obj));
                k = 12;
                obj = "k4}m\nM4W|\021[4w";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[k] = ((String) (obj));
                k = 13;
                obj = "X=Fk\032^%`I\rP6wx\022";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[k] = ((String) (obj));
                k = 14;
                obj = "|>pu\033\037?jm_S8kr_O#j~\r^<?9";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[k] = ((String) (obj));
                k = 15;
                obj = "|>pu\033\037?jm_\\#`x\013Zquk\020X#dt";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[k] = ((String) (obj));
                k = 16;
                obj = "k4}m\nM4W|\021[4w";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[k] = ((String) (obj));
                k = 17;
                obj = "X=Dm\013^2mJ\027^5`k";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[k] = ((String) (obj));
                k = 18;
                obj = "k4}m\nM4W|\021[4w";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[k] = ((String) (obj));
                k = 19;
                obj = "X=B|\013j?l\177\020M<Iv\034^%lv\021\037$VM2^%wp\007";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[k] = ((String) (obj));
                k = 20;
                obj = "X=B|\013j?l\177\020M<Iv\034^%lv\021\037$HO/r0qk\026G";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[k] = ((String) (obj));
                k = 21;
                obj = "|>pu\033\037?jm_X4q9\036K%wp\035\037=jz\036K8jw_Y>w9\nr\007UT\036K#la";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[k] = ((String) (obj));
                k = 22;
                obj = "|>pu\033\037?jm_X4q9\036K%wp\035\037=jz\036K8jw_Y>w9\036o>vp\013V>k";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[k] = ((String) (obj));
                k = 23;
                obj = "X=Gp\021[\005`a\013J#`9\022k4}m\nM4L]";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[k] = ((String) (obj));
                k = 24;
                obj = "Y0lu\032[qfk\032^%lw\030\037!wv\030M0h";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[k] = ((String) (obj));
                obj = "|>pu\033\037?jm_X4q9\036K%wp\035\037=jz\036K8jw_Y>w9\036k4}m\nM4Fv\020M5";
                byte0 = 24;
                k = 25;
                break;

            case 24: // '\030'
                as1[k] = ((String) (obj));
                k = 26;
                obj = "X=Q|\007o0wx\022Z%`k";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[k] = ((String) (obj));
                k = 27;
                obj = "X=B|\013~%qk\026]\035jz\036K8jw_^\005`a\013J#`Z\020P#a";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[k] = ((String) (obj));
                k = 28;
                obj = "^\005`a\013J#`Z\020P#a";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[k] = ((String) (obj));
                k = 29;
                obj = "J\034SI2^%wp\007";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[k] = ((String) (obj));
                k = 30;
                obj = "^\001jj\026K8jw";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[k] = ((String) (obj));
                k = 31;
                obj = "X=B|\013~%qk\026]\035jz\036K8jw_^\001jj\026K8jw";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[k] = ((String) (obj));
                k = 32;
                obj = "|>pu\033\037?jm_X4q9\036K%wp\035\037=jz\036K8jw_Y>w9\nl\005Hx\013M8}";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[k] = ((String) (obj));
                k = 33;
                obj = "J\002QT\036K#la";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[k] = ((String) (obj));
                k = 34;
                obj = "J?l\177\020M<%t\036Ke%l2i\001Hx\013M8}\"uJ?l\177\020M<%t\036Ke%l,k\034dm\rV)>\023\036K%wp\035J%`9\tZ219\036o>vp\013V>k\"u^%qk\026]$q|_I4f-_^\005`a\013J#`Z\020P#a\"uI0w`\026Q6%o\032\\c%o+Z)ql\rZ\022jv\r[j\017o\020V5%t\036V?-0_D[%9\030S\016Uv\fV%lv\021\037l%l2i\001Hx\013M8}9U\0370Uv\fV%lv\021\004[%9\tk4}m\nM4Fv\020M5%$_\027$VM2^%wp\007\037{%x+Z)ql\rZ\022jv\r[x+a\006\004[x\023";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[k] = ((String) (obj));
                k = 35;
                obj = "\0344}m\032Q\"lv\021\037\026IF0z\002Z\\8s\016lt\036X4Z|\007K4ww\036Sq?9\rZ pp\rZ[uk\032\\8vp\020Qqh|\033V$hi_Y=jx\013\004[sx\rF8k~_I4f+_I\005`a\013J#`Z\020P#a\"uJ?l\177\020M<%j\036R!i|\rz)q|\rQ0iV:lqvM\032G%pk\032\004[sv\026[qhx\026Qy,9\0045q%~\023`\027wx\030|>iv\r\037l%m\032G%pk\032\r\025-j+Z)ql\rZ}%o+Z)ql\rZ\022jv\r[x>\023\0025";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[k] = ((String) (obj));
                k = 36;
                obj = "\005qbu:M#jk_";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[k] = ((String) (obj));
                k = 37;
                obj = "k4}m\nM4W|\021[4w";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[k] = ((String) (obj));
                k = 38;
                obj = "\005qbu:M#jk_";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[k] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[l];
        l % 5;
        JVM INSTR tableswitch 0 3: default 940
    //                   0 963
    //                   1 970
    //                   2 977
    //                   3 983;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_983;
_L3:
        byte byte1 = 127;
_L9:
        obj[l] = (char)(byte1 ^ c1);
        l++;
          goto _L8
_L4:
        byte1 = 63;
          goto _L9
_L5:
        byte1 = 81;
          goto _L9
_L6:
        byte1 = 5;
          goto _L9
        byte1 = 25;
          goto _L9
    }
}
