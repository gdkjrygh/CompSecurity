.class public Lcom/mixpanel/android/viewcrawler/ViewVisitor$ViewDetectorVisitor;
.super Lcom/mixpanel/android/viewcrawler/ViewVisitor$EventTriggeringVisitor;
.source "ViewVisitor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/viewcrawler/ViewVisitor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ViewDetectorVisitor"
.end annotation


# instance fields
.field private mSeen:Z


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnEventListener;)V
    .locals 1
    .param p2, "eventName"    # Ljava/lang/String;
    .param p3, "listener"    # Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnEventListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnEventListener;",
            ")V"
        }
    .end annotation

    .prologue
    .local p1, "path":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;>;"
    const/4 v0, 0x0

    .line 540
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$EventTriggeringVisitor;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnEventListener;Z)V

    .line 541
    iput-boolean v0, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$ViewDetectorVisitor;->mSeen:Z

    .line 542
    return-void
.end method


# virtual methods
.method public accumulate(Landroid/view/View;)V
    .locals 1
    .param p1, "found"    # Landroid/view/View;

    .prologue
    .line 551
    if-eqz p1, :cond_0

    iget-boolean v0, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$ViewDetectorVisitor;->mSeen:Z

    if-nez v0, :cond_0

    .line 552
    invoke-virtual {p0, p1}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$ViewDetectorVisitor;->fireEvent(Landroid/view/View;)V

    .line 555
    :cond_0
    if-eqz p1, :cond_1

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$ViewDetectorVisitor;->mSeen:Z

    .line 556
    return-void

    .line 555
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public cleanup()V
    .locals 0

    .prologue
    .line 547
    return-void
.end method

.method protected name()Ljava/lang/String;
    .locals 2

    .prologue
    .line 560
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$ViewDetectorVisitor;->getEventName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, " when Detected"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic visit(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 1
    invoke-super {p0, p1}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$EventTriggeringVisitor;->visit(Landroid/view/View;)V

    return-void
.end method
