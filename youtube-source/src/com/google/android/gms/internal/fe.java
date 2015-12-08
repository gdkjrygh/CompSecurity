// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            gz, gi, gx, ha

public abstract class fe
{

    public fe()
    {
    }

    private void a(StringBuilder stringbuilder, a a1, Object obj)
    {
        if (a1.ch() == 11)
        {
            stringbuilder.append(((fe)a1.cr().cast(obj)).toString());
            return;
        }
        if (a1.ch() == 7)
        {
            stringbuilder.append("\"");
            stringbuilder.append(gz.a((String)obj));
            stringbuilder.append("\"");
            return;
        } else
        {
            stringbuilder.append(obj);
            return;
        }
    }

    private void a(StringBuilder stringbuilder, a a1, ArrayList arraylist)
    {
        stringbuilder.append("[");
        int i = 0;
        for (int j = arraylist.size(); i < j; i++)
        {
            if (i > 0)
            {
                stringbuilder.append(",");
            }
            Object obj = arraylist.get(i);
            if (obj != null)
            {
                a(stringbuilder, a1, obj);
            }
        }

        stringbuilder.append("]");
    }

    protected Object a(a a1, Object obj)
    {
        Object obj1 = obj;
        if (a.c(a1) != null)
        {
            obj1 = a1.g(obj);
        }
        return obj1;
    }

    protected boolean a(a a1)
    {
        if (a1.ci() == 11)
        {
            if (a1.co())
            {
                return af(a1.cp());
            } else
            {
                return ae(a1.cp());
            }
        } else
        {
            return ad(a1.cp());
        }
    }

    protected abstract Object ac(String s);

    protected abstract boolean ad(String s);

    protected boolean ae(String s)
    {
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    protected boolean af(String s)
    {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
    }

    protected Object b(a a1)
    {
        boolean flag = true;
        String s = a1.cp();
        if (a1.cr() != null)
        {
            if (ac(a1.cp()) != null)
            {
                flag = false;
            }
            gi.a(flag, (new StringBuilder("Concrete field shouldn't be value object: ")).append(a1.cp()).toString());
            if (a1.co())
            {
                a1 = cl();
            } else
            {
                a1 = ck();
            }
            if (a1 != null)
            {
                return a1.get(s);
            }
            try
            {
                a1 = (new StringBuilder("get")).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
                a1 = ((a) (getClass().getMethod(a1, new Class[0]).invoke(this, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (a a1)
            {
                throw new RuntimeException(a1);
            }
            return a1;
        } else
        {
            return ac(a1.cp());
        }
    }

    public abstract HashMap cj();

    public HashMap ck()
    {
        return null;
    }

    public HashMap cl()
    {
        return null;
    }

    public String toString()
    {
        HashMap hashmap = cj();
        StringBuilder stringbuilder = new StringBuilder(100);
        Iterator iterator = hashmap.keySet().iterator();
label0:
        do
        {
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s = (String)iterator.next();
                a a1 = (a)hashmap.get(s);
                if (a(a1))
                {
                    Object obj = a(a1, b(a1));
                    if (stringbuilder.length() == 0)
                    {
                        stringbuilder.append("{");
                    } else
                    {
                        stringbuilder.append(",");
                    }
                    stringbuilder.append("\"").append(s).append("\":");
                    if (obj == null)
                    {
                        stringbuilder.append("null");
                    } else
                    {
                        switch (a1.ci())
                        {
                        default:
                            if (a1.cn())
                            {
                                a(stringbuilder, a1, (ArrayList)obj);
                            } else
                            {
                                a(stringbuilder, a1, obj);
                            }
                            break;

                        case 8: // '\b'
                            stringbuilder.append("\"").append(gx.a((byte[])obj)).append("\"");
                            break;

                        case 9: // '\t'
                            stringbuilder.append("\"").append(gx.b((byte[])obj)).append("\"");
                            break;

                        case 10: // '\n'
                            ha.a(stringbuilder, (HashMap)obj);
                            break;
                        }
                        continue label0;
                    }
                }
            } while (true);
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append("}");
            } else
            {
                stringbuilder.append("{}");
            }
            return stringbuilder.toString();
        } while (true);
    }

    private class a
        implements SafeParcelable
    {

        public static final gr CREATOR = new gr();
        private final int jE;
        protected final int up;
        protected final boolean uq;
        protected final int ur;
        protected final boolean us;
        protected final String ut;
        protected final int uu;
        protected final Class uv;
        protected final String uw;
        private fh ux;
        private gq uy;

        public static a a(String s, int i, gq gq1, boolean flag)
        {
            return new a(gq1.ch(), flag, gq1.ci(), false, s, i, null, gq1);
        }

        public static a a(String s, int i, Class class1)
        {
            return new a(11, false, 11, false, s, i, class1, null);
        }

        public static a b(String s, int i, Class class1)
        {
            return new a(11, true, 11, true, s, i, class1, null);
        }

        static gq c(a a1)
        {
            return a1.uy;
        }

        public static a d(String s, int i)
        {
            return new a(0, false, 0, false, s, i, null, null);
        }

        public static a e(String s, int i)
        {
            return new a(4, false, 4, false, s, i, null, null);
        }

        public static a f(String s, int i)
        {
            return new a(6, false, 6, false, s, i, null, null);
        }

        public static a g(String s, int i)
        {
            return new a(7, false, 7, false, s, i, null, null);
        }

        public static a h(String s, int i)
        {
            return new a(7, true, 7, true, s, i, null, null);
        }

        public void a(fh fh1)
        {
            ux = fh1;
        }

        public int ch()
        {
            return up;
        }

        public int ci()
        {
            return ur;
        }

        public a cm()
        {
            return new a(jE, up, uq, ur, us, ut, uu, uw, cu());
        }

        public boolean cn()
        {
            return uq;
        }

        public boolean co()
        {
            return us;
        }

        public String cp()
        {
            return ut;
        }

        public int cq()
        {
            return uu;
        }

        public Class cr()
        {
            return uv;
        }

        String cs()
        {
            if (uw == null)
            {
                return null;
            } else
            {
                return uw;
            }
        }

        public boolean ct()
        {
            return uy != null;
        }

        ez cu()
        {
            if (uy == null)
            {
                return null;
            } else
            {
                return ez.a(uy);
            }
        }

        public HashMap cv()
        {
            gi.a(uw);
            gi.a(ux);
            return ux.ag(uw);
        }

        public int describeContents()
        {
            gr gr1 = CREATOR;
            return 0;
        }

        public Object g(Object obj)
        {
            return uy.g(obj);
        }

        public int getVersionCode()
        {
            return jE;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("Field\n");
            stringbuilder.append("            versionCode=").append(jE).append('\n');
            stringbuilder.append("                 typeIn=").append(up).append('\n');
            stringbuilder.append("            typeInArray=").append(uq).append('\n');
            stringbuilder.append("                typeOut=").append(ur).append('\n');
            stringbuilder.append("           typeOutArray=").append(us).append('\n');
            stringbuilder.append("        outputFieldName=").append(ut).append('\n');
            stringbuilder.append("      safeParcelFieldId=").append(uu).append('\n');
            stringbuilder.append("       concreteTypeName=").append(cs()).append('\n');
            if (cr() != null)
            {
                stringbuilder.append("     concreteType.class=").append(cr().getCanonicalName()).append('\n');
            }
            StringBuilder stringbuilder1 = stringbuilder.append("          converterName=");
            String s;
            if (uy == null)
            {
                s = "null";
            } else
            {
                s = uy.getClass().getCanonicalName();
            }
            stringbuilder1.append(s).append('\n');
            return stringbuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            gr gr1 = CREATOR;
            gr.a(this, parcel, i);
        }


        a(int i, int j, boolean flag, int k, boolean flag1, String s, int l, 
                String s1, ez ez1)
        {
            jE = i;
            up = j;
            uq = flag;
            ur = k;
            us = flag1;
            ut = s;
            uu = l;
            if (s1 == null)
            {
                uv = null;
                uw = null;
            } else
            {
                uv = com/google/android/gms/internal/fk;
                uw = s1;
            }
            if (ez1 == null)
            {
                uy = null;
                return;
            } else
            {
                uy = ez1.cf();
                return;
            }
        }

        protected a(int i, boolean flag, int j, boolean flag1, String s, int k, Class class1, 
                gq gq1)
        {
            jE = 1;
            up = i;
            uq = flag;
            ur = j;
            us = flag1;
            ut = s;
            uu = k;
            uv = class1;
            if (class1 == null)
            {
                uw = null;
            } else
            {
                uw = class1.getCanonicalName();
            }
            uy = gq1;
        }
    }

}
