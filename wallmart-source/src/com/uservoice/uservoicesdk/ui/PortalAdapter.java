// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import com.uservoice.uservoicesdk.Config;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.activity.ContactActivity;
import com.uservoice.uservoicesdk.activity.ForumActivity;
import com.uservoice.uservoicesdk.activity.SearchActivity;
import com.uservoice.uservoicesdk.flow.InitManager;
import com.uservoice.uservoicesdk.model.Article;
import com.uservoice.uservoicesdk.model.BaseModel;
import com.uservoice.uservoicesdk.model.Forum;
import com.uservoice.uservoicesdk.model.Suggestion;
import com.uservoice.uservoicesdk.model.Topic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            SearchAdapter, Utils, DefaultCallback

public class PortalAdapter extends SearchAdapter
    implements android.widget.AdapterView.OnItemClickListener
{

    private static int ARTICLE = 5;
    private static int CONTACT = 4;
    private static int FORUM = 1;
    private static int KB_HEADER = 0;
    private static int LOADING = 3;
    public static int SCOPE_ALL = 0;
    public static int SCOPE_ARTICLES = 1;
    public static int SCOPE_IDEAS = 2;
    private static int TOPIC = 2;
    private boolean configLoaded;
    private final FragmentActivity context;
    private LayoutInflater inflater;
    private List staticRows;

    public PortalAdapter(FragmentActivity fragmentactivity)
    {
        configLoaded = false;
        context = fragmentactivity;
        inflater = (LayoutInflater)fragmentactivity.getSystemService("layout_inflater");
        (new InitManager(fragmentactivity, new Runnable() {

            final PortalAdapter this$0;

            public void run()
            {
                configLoaded = true;
                notifyDataSetChanged();
                loadForum();
                loadTopics();
            }

            
            {
                this$0 = PortalAdapter.this;
                super();
            }
        })).init();
    }

    private void computeStaticRows()
    {
        if (staticRows == null)
        {
            staticRows = new ArrayList();
            Config config = Session.getInstance().getConfig();
            if (config.shouldShowContactUs())
            {
                staticRows.add(Integer.valueOf(CONTACT));
            }
            if (config.shouldShowForum())
            {
                staticRows.add(Integer.valueOf(FORUM));
            }
            if (config.shouldShowKnowledgeBase())
            {
                staticRows.add(Integer.valueOf(KB_HEADER));
            }
        }
    }

    private List getArticles()
    {
        return Session.getInstance().getArticles();
    }

    private List getTopics()
    {
        return Session.getInstance().getTopics();
    }

    private void loadForum()
    {
        Forum.loadForum(Session.getInstance().getConfig().getForumId(), new DefaultCallback(context) {

            final PortalAdapter this$0;

            public void onModel(Forum forum)
            {
                Session.getInstance().setForum(forum);
                notifyDataSetChanged();
            }

            public volatile void onModel(Object obj)
            {
                onModel((Forum)obj);
            }

            
            {
                this$0 = PortalAdapter.this;
                super(context1);
            }
        });
    }

    private void loadTopics()
    {
        DefaultCallback defaultcallback = new DefaultCallback(context) {

            final PortalAdapter this$0;

            public volatile void onModel(Object obj)
            {
                onModel((List)obj);
            }

            public void onModel(List list)
            {
                Session.getInstance().setTopics(new ArrayList());
                Session.getInstance().setArticles(list);
                notifyDataSetChanged();
            }

            
            {
                this$0 = PortalAdapter.this;
                super(context1);
            }
        };
        if (Session.getInstance().getConfig().getTopicId() != -1)
        {
            Article.loadForTopic(Session.getInstance().getConfig().getTopicId(), defaultcallback);
            return;
        } else
        {
            Topic.loadTopics(new DefaultCallback(defaultcallback) {

                final PortalAdapter this$0;
                final DefaultCallback val$articlesCallback;

                public volatile void onModel(Object obj)
                {
                    onModel((List)obj);
                }

                public void onModel(List list)
                {
                    if (list.isEmpty())
                    {
                        Session.getInstance().setTopics(list);
                        Article.loadAll(articlesCallback);
                        return;
                    } else
                    {
                        list = new ArrayList(list);
                        list.add(Topic.ALL_ARTICLES);
                        Session.getInstance().setTopics(list);
                        notifyDataSetChanged();
                        return;
                    }
                }

            
            {
                this$0 = PortalAdapter.this;
                articlesCallback = defaultcallback;
                super(final_context1);
            }
            });
            return;
        }
    }

    private boolean shouldShowArticles()
    {
        return Session.getInstance().getConfig().getTopicId() != -1 || getTopics() != null && getTopics().isEmpty();
    }

    public int getCount()
    {
        int i;
        if (!configLoaded)
        {
            i = 1;
        } else
        {
            computeStaticRows();
            int k = staticRows.size();
            i = k;
            if (Session.getInstance().getConfig().shouldShowKnowledgeBase())
            {
                if (getTopics() == null || shouldShowArticles() && getArticles() == null)
                {
                    return k + 1;
                }
                int j;
                if (shouldShowArticles())
                {
                    j = getArticles().size();
                } else
                {
                    j = getTopics().size();
                }
                return k + j;
            }
        }
        return i;
    }

    public Object getItem(int i)
    {
        computeStaticRows();
        if (i < staticRows.size() && ((Integer)staticRows.get(i)).intValue() == FORUM)
        {
            return Session.getInstance().getForum();
        }
        if (getTopics() != null && !shouldShowArticles() && i >= staticRows.size() && i - staticRows.size() < getTopics().size())
        {
            return getTopics().get(i - staticRows.size());
        }
        if (getArticles() != null && shouldShowArticles() && i >= staticRows.size() && i - staticRows.size() < getArticles().size())
        {
            return getArticles().get(i - staticRows.size());
        } else
        {
            return null;
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        if (!configLoaded)
        {
            i = LOADING;
        } else
        {
            computeStaticRows();
            if (i < staticRows.size())
            {
                int j = ((Integer)staticRows.get(i)).intValue();
                i = j;
                if (j == FORUM)
                {
                    i = j;
                    if (Session.getInstance().getForum() == null)
                    {
                        return LOADING;
                    }
                }
            } else
            {
                if (getTopics() == null || shouldShowArticles() && getArticles() == null)
                {
                    i = LOADING;
                } else
                if (shouldShowArticles())
                {
                    i = ARTICLE;
                } else
                {
                    i = TOPIC;
                }
                return i;
            }
        }
        return i;
    }

    public List getScopedSearchResults()
    {
        if (scope != SCOPE_ALL) goto _L2; else goto _L1
_L1:
        Object obj = searchResults;
_L4:
        return ((List) (obj));
_L2:
label0:
        {
            if (scope != SCOPE_ARTICLES)
            {
                break label0;
            }
            ArrayList arraylist1 = new ArrayList();
            Iterator iterator1 = searchResults.iterator();
            do
            {
                obj = arraylist1;
                if (!iterator1.hasNext())
                {
                    break;
                }
                obj = (BaseModel)iterator1.next();
                if (obj instanceof Article)
                {
                    arraylist1.add(obj);
                }
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (scope == SCOPE_IDEAS)
        {
            ArrayList arraylist = new ArrayList();
            Iterator iterator = searchResults.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                BaseModel basemodel = (BaseModel)iterator.next();
                if (basemodel instanceof Suggestion)
                {
                    arraylist.add(basemodel);
                }
            } while (true);
            return arraylist;
        } else
        {
            return null;
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        int j = getItemViewType(i);
        view = viewgroup;
        if (viewgroup == null)
        {
            if (j == LOADING)
            {
                view = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_loading_item, null);
            } else
            if (j == FORUM)
            {
                view = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_text_item, null);
            } else
            if (j == KB_HEADER)
            {
                view = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_header_item_light, null);
            } else
            if (j == TOPIC)
            {
                view = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_text_item, null);
            } else
            if (j == CONTACT)
            {
                view = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_text_item, null);
            } else
            {
                view = viewgroup;
                if (j == ARTICLE)
                {
                    view = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_text_item, null);
                }
            }
        }
        if (j == FORUM)
        {
            ((TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_text)).setText(com.uservoice.uservoicesdk.R.string.uv_feedback_forum);
            viewgroup = (TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_text2);
            viewgroup.setText(Utils.getQuantityString(viewgroup, com.uservoice.uservoicesdk.R.plurals.uv_ideas, Session.getInstance().getForum().getNumberOfOpenSuggestions()));
        } else
        if (j == KB_HEADER)
        {
            ((TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_header_text)).setText(com.uservoice.uservoicesdk.R.string.uv_knowledge_base);
        } else
        if (j == TOPIC)
        {
            viewgroup = (Topic)getItem(i);
            ((TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_text)).setText(viewgroup.getName());
            TextView textview = (TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_text2);
            if (viewgroup == Topic.ALL_ARTICLES)
            {
                textview.setVisibility(8);
            } else
            {
                textview.setVisibility(0);
                textview.setText(String.format("%d %s", new Object[] {
                    Integer.valueOf(viewgroup.getNumberOfArticles()), context.getResources().getQuantityString(com.uservoice.uservoicesdk.R.plurals.uv_articles, viewgroup.getNumberOfArticles())
                }));
            }
        } else
        if (j == CONTACT)
        {
            ((TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_text)).setText(com.uservoice.uservoicesdk.R.string.uv_contact_us);
            view.findViewById(com.uservoice.uservoicesdk.R.id.uv_text2).setVisibility(8);
        } else
        if (j == ARTICLE)
        {
            ((TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_text)).setText(((Article)getItem(i)).getTitle());
        }
        viewgroup = view.findViewById(com.uservoice.uservoicesdk.R.id.uv_divider);
        if (viewgroup != null)
        {
            if (i == getCount() - 1)
            {
                i = 8;
            } else
            {
                i = 0;
            }
            viewgroup.setVisibility(i);
        }
        if (j == FORUM)
        {
            viewgroup.setVisibility(8);
        }
        return view;
    }

    public int getViewTypeCount()
    {
        return 7;
    }

    public boolean isEnabled(int i)
    {
        if (!configLoaded)
        {
            return false;
        }
        computeStaticRows();
        if (i < staticRows.size())
        {
            i = ((Integer)staticRows.get(i)).intValue();
            if (i == KB_HEADER || i == LOADING)
            {
                return false;
            }
        }
        return true;
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        int j = getItemViewType(i);
        if (j == CONTACT)
        {
            context.startActivity(new Intent(context, com/uservoice/uservoicesdk/activity/ContactActivity));
        } else
        {
            if (j == FORUM)
            {
                context.startActivity(new Intent(context, com/uservoice/uservoicesdk/activity/ForumActivity));
                return;
            }
            if (j == TOPIC || j == ARTICLE)
            {
                Utils.showModel(context, (BaseModel)getItem(i));
                return;
            }
        }
    }

    protected void searchResultsUpdated()
    {
        int j = 0;
        int i = 0;
        for (Iterator iterator = searchResults.iterator(); iterator.hasNext();)
        {
            if ((BaseModel)iterator.next() instanceof Article)
            {
                j++;
            } else
            {
                i++;
            }
        }

        ((SearchActivity)context).updateScopedSearch(searchResults.size(), j, i);
    }



/*
    static boolean access$002(PortalAdapter portaladapter, boolean flag)
    {
        portaladapter.configLoaded = flag;
        return flag;
    }

*/


}
