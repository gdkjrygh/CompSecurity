// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import com.ubercab.client.feature.survey.model.Answer;
import com.ubercab.client.feature.survey.model.Question;
import com.ubercab.client.feature.survey.model.Survey;
import java.util.concurrent.TimeUnit;

public final class fpj
{

    private final Context a;

    public fpj(Context context)
    {
        a = context;
    }

    private Question a(String s, String s1, l l1, n n1, String as[][])
    {
        gjz.a(s);
        gjz.a(s1);
        gjz.a(l1);
        gjz.a(n1);
        gjz.a(as);
        s = Question.create().setId(s).setTitle(s1).setSubtitle(a.getResources().getString(0x7f070268)).setImpressionEvent(l1).setTapEvent(n1).setType(com.ubercab.client.feature.survey.model.Question.TYPE.LIST).setIconResource(0x7f02020b);
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            s1 = as[i];
            s.addAnswer(Answer.create(s1[1], "finish", s1[0], 0));
        }

        return s;
    }

    private Question a(String s, String s1, n n1, String s2, String s3, String s4)
    {
        gjz.a(s);
        gjz.a(s1);
        gjz.a(n1);
        gjz.a(s2);
        gjz.a(s3);
        return Question.create().setId(s).setTitle(s1).setDisclaimer(a.getString(0x7f07067a)).setImpressionEvent(l.eH).setTapEvent(n1).setType(com.ubercab.client.feature.survey.model.Question.TYPE.POSITIVE_NEGATIVE).setIconResource(0).addAnswer(Answer.create(s3, s4, "negative", 0x7f02030a)).addAnswer(Answer.create(s2, "finish", "positive", 0x7f02030c));
    }

    private Question a(l l1)
    {
        gjz.a(l1);
        return Question.create().setId("finish").setTitle(a.getString(0x7f070265)).setSubtitle(a.getString(0x7f070492)).setImpressionEvent(l1).setType(com.ubercab.client.feature.survey.model.Question.TYPE.FINISH).setIconResource(0x7f020208).addAnswer(Answer.create("1", null, null, 0));
    }

    private Survey a()
    {
        String s = a.getString(0x7f070465);
        String as[] = {
            a.getString(0x7f07045f), "cancel-option-2"
        };
        String s1 = a.getString(0x7f070460);
        String as1[] = {
            a.getString(0x7f07046b), "cancel-option-4"
        };
        String s2 = a.getString(0x7f07045e);
        String as2[] = {
            a.getString(0x7f07047d), "cancel-option-5"
        };
        return a(false, 0, new Question[] {
            a("pickupSurvey", a.getString(0x7f07007e), l.b, n.a, new String[][] {
                new String[] {
                    s, "cancel-option-1"
                }, as, new String[] {
                    s1, "cancel-option-3"
                }, as1, new String[] {
                    s2, "cancel-option-6"
                }, as2
            }), a(l.c)
        });
    }

    private static transient Survey a(boolean flag, int i, Question aquestion[])
    {
        Survey survey = Survey.create();
        survey.setSurveyType(i);
        int j = aquestion.length;
        for (i = 0; i < j; i++)
        {
            survey.addQuestion(aquestion[i]);
        }

        if (flag)
        {
            survey.setRepeatTimeoutMs(TimeUnit.MILLISECONDS.convert(1L, TimeUnit.DAYS));
        }
        return survey;
    }

    private Survey b()
    {
        Object obj = a.getString(0x7f07046f);
        String as[] = {
            a.getString(0x7f07046c), "pickup-option-4"
        };
        Object obj1 = a.getString(0x7f07046d);
        String s = a.getString(0x7f07046e);
        String as1[] = {
            a.getString(0x7f07047d), "pickup-option-7"
        };
        obj = a("pickupSurvey", a.getString(0x7f070671), l.eJ, n.b, new String[][] {
            new String[] {
                obj, "pickup-option-3"
            }, as, new String[] {
                obj1, "pickup-option-5"
            }, new String[] {
                s, "pickup-option-6"
            }, as1
        });
        obj1 = a(l.eI);
        return a(true, 1, new Question[] {
            a("pickupPreSurvey", a.getString(0x7f070276), n.da, "pickup-option-1", "pickup-option-2", "pickupSurvey"), obj, obj1
        });
    }

    private Survey c()
    {
        Object obj = a.getString(0x7f070475);
        Object obj1 = a.getString(0x7f070476);
        String s = a.getString(0x7f070474);
        String s1 = a.getString(0x7f070477);
        String s2 = a.getString(0x7f070478);
        String s3 = a.getString(0x7f07047d);
        obj = a("pool-no-walking-pickup-survey", a.getString(0x7f070671), l.fa, n.dk, new String[][] {
            new String[] {
                obj, "pool-no-walking-pickup-option-3"
            }, new String[] {
                obj1, "pool-no-walking-pickup-option-4"
            }, new String[] {
                s, "pool-no-walking-pickup-option-5"
            }, new String[] {
                s1, "pool-no-walking-pickup-option-6"
            }, new String[] {
                s2, "pool-no-walking-pickup-option-7"
            }, new String[] {
                s3, "pool-no-walking-pickup-option-8"
            }
        });
        obj1 = a(l.eZ);
        return a(false, 2, new Question[] {
            a("pool-no-walking-pickup-preSurvey", a.getString(0x7f070278), n.dl, "pool-no-walking-pickup-option-1", "pool-no-walking-pickup-option-2", "pool-no-walking-pickup-survey"), obj, obj1
        });
    }

    private Survey d()
    {
        String as[] = {
            a.getString(0x7f070479), "pool-walking-pickup-option-3"
        };
        Object obj = a.getString(0x7f07047a);
        String as1[] = {
            a.getString(0x7f07047c), "pool-walking-pickup-option-5"
        };
        Object obj1 = a.getString(0x7f07047b);
        String s = a.getString(0x7f07047d);
        obj = a("pool-walking-pickup-survey", a.getString(0x7f070671), l.fh, n.dp, new String[][] {
            as, new String[] {
                obj, "pool-walking-pickup-option-4"
            }, as1, new String[] {
                obj1, "pool-walking-pickup-option-6"
            }, new String[] {
                s, "pool-walking-pickup-option-7"
            }
        });
        obj1 = a(l.fg);
        return a(false, 3, new Question[] {
            a("pool-walking-pickup-preSurvey", a.getString(0x7f070278), n.dq, "pool-walking-pickup-option-1", "pool-walking-pickup-option-2", "pool-walking-pickup-survey"), obj, obj1
        });
    }

    private Survey e()
    {
        Object obj = a.getString(0x7f07046a);
        String as[] = {
            a.getString(0x7f070466), "in-car-option-4"
        };
        Object obj1 = a.getString(0x7f070467);
        String s = a.getString(0x7f070468);
        String s1 = a.getString(0x7f070469);
        String s2 = a.getString(0x7f07047d);
        obj = a("in-car-survey", a.getString(0x7f070671), l.bZ, n.aD, new String[][] {
            new String[] {
                obj, "in-car-option-3"
            }, as, new String[] {
                obj1, "in-car-option-5"
            }, new String[] {
                s, "in-car-option-6"
            }, new String[] {
                s1, "in-car-option-7"
            }, new String[] {
                s2, "in-car-option-8"
            }
        });
        obj1 = a(l.bY);
        return a(false, 4, new Question[] {
            a("in-car-preSurvey", a.getString(0x7f070275), n.aE, "in-car-option-1", "in-car-option-2", "in-car-survey"), obj, obj1
        });
    }

    private Survey f()
    {
        Object obj = a.getString(0x7f070481);
        Object obj1 = a.getString(0x7f070482);
        String s = a.getString(0x7f07047f);
        String as[] = {
            a.getString(0x7f070483), "value-prop-option-6"
        };
        String as1[] = {
            a.getString(0x7f07047e), "value-prop-option-7"
        };
        String as2[] = {
            a.getString(0x7f07047d), "value-prop-option-8"
        };
        obj = a("value-prop-survey", a.getString(0x7f070671), l.iW, n.jr, new String[][] {
            new String[] {
                obj, "value-prop-option-3"
            }, new String[] {
                obj1, "value-prop-option-4"
            }, new String[] {
                s, "value-prop-option-5"
            }, as, as1, as2
        });
        obj1 = a(l.iV);
        return a(false, 6, new Question[] {
            a("value-prop-preSurvey", a.getString(0x7f070279), n.js, "value-prop-option-1", "value-prop-option-2", "value-prop-survey"), obj, obj1
        });
    }

    private Survey g()
    {
        Object obj = a.getString(0x7f070463);
        Object obj1 = a.getString(0x7f070461);
        String s = a.getString(0x7f070462);
        String s1 = a.getString(0x7f070464);
        String s2 = a.getString(0x7f07047d);
        obj = a("dropoff-survey", a.getString(0x7f070671), l.bb, n.X, new String[][] {
            new String[] {
                obj, "dropoff-option-3"
            }, new String[] {
                obj1, "dropoff-option-4"
            }, new String[] {
                s, "dropoff-option-5"
            }, new String[] {
                s1, "dropoff-option-6"
            }, new String[] {
                s2, "dropoff-option-7"
            }
        });
        obj1 = a(l.ba);
        return a(false, 5, new Question[] {
            a("dropoff-preSurvey", a.getString(0x7f070277), n.Y, "dropoff-option-1", "dropoff-option-2", "dropoff-survey"), obj, obj1
        });
    }

    private Survey h()
    {
        String as[] = {
            a.getString(0x7f070470), "pool-cancel-option-1"
        };
        String as1[] = {
            a.getString(0x7f070471), "pool-cancel-option-2"
        };
        Object obj = a.getString(0x7f070473);
        String as2[] = {
            a.getString(0x7f070472), "pool-cancel-option-4"
        };
        String as3[] = {
            a.getString(0x7f07047d), "pool-cancel-option-5"
        };
        obj = a("pool-cancel-survey", a.getString(0x7f070671), l.eM, n.dc, new String[][] {
            as, as1, new String[] {
                obj, "pool-cancel-option-3"
            }, as2, as3
        });
        Question question = a(l.eN);
        a(false, 7, new Question[] {
            obj, question
        });
        return Survey.create().addQuestion(((Question) (obj))).addQuestion(question);
    }

    public final Survey a(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return a();

        case 1: // '\001'
            return b();

        case 2: // '\002'
            return c();

        case 3: // '\003'
            return d();

        case 4: // '\004'
            return e();

        case 5: // '\005'
            return g();

        case 6: // '\006'
            return f();

        case 7: // '\007'
            return h();
        }
    }
}
