.class abstract Lcom/mixpanel/android/viewcrawler/ViewVisitor$EventTriggeringVisitor;
.super Lcom/mixpanel/android/viewcrawler/ViewVisitor;
.source "ViewVisitor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/viewcrawler/ViewVisitor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "EventTriggeringVisitor"
.end annotation


# instance fields
.field private final mDebounce:Z

.field private final mEventName:Ljava/lang/String;

.field private final mListener:Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnEventListener;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnEventListener;Z)V
    .locals 0
    .param p2, "eventName"    # Ljava/lang/String;
    .param p3, "listener"    # Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnEventListener;
    .param p4, "debounce"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnEventListener;",
            "Z)V"
        }
    .end annotation

    .prologue
    .line 568
    .local p1, "path":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;>;"
    invoke-direct {p0, p1}, Lcom/mixpanel/android/viewcrawler/ViewVisitor;-><init>(Ljava/util/List;)V

    .line 569
    iput-object p3, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$EventTriggeringVisitor;->mListener:Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnEventListener;

    .line 570
    iput-object p2, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$EventTriggeringVisitor;->mEventName:Ljava/lang/String;

    .line 571
    iput-boolean p4, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$EventTriggeringVisitor;->mDebounce:Z

    .line 572
    return-void
.end method


# virtual methods
.method protected fireEvent(Landroid/view/View;)V
    .locals 3
    .param p1, "found"    # Landroid/view/View;

    .prologue
    .line 575
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$EventTriggeringVisitor;->mListener:Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnEventListener;

    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$EventTriggeringVisitor;->mEventName:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$EventTriggeringVisitor;->mDebounce:Z

    invoke-interface {v0, p1, v1, v2}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnEventListener;->OnEvent(Landroid/view/View;Ljava/lang/String;Z)V

    .line 576
    return-void
.end method

.method protected getEventName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 579
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$EventTriggeringVisitor;->mEventName:Ljava/lang/String;

    return-object v0
.end method
