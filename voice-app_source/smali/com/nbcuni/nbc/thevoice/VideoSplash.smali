.class public Lcom/nbcuni/nbc/thevoice/VideoSplash;
.super Landroid/app/Activity;
.source "VideoSplash.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnErrorListener;
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field private videoView:Landroid/widget/VideoView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 24
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/nbcuni/nbc/thevoice/VideoSplash$1;

    invoke-direct {v1, p0}, Lcom/nbcuni/nbc/thevoice/VideoSplash$1;-><init>(Lcom/nbcuni/nbc/thevoice/VideoSplash;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 35
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 40
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 45
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 65
    const v0, 0x7f030016

    invoke-virtual {p0, v0}, Lcom/nbcuni/nbc/thevoice/VideoSplash;->setContentView(I)V

    .line 66
    const v0, 0x7f09005d

    invoke-virtual {p0, v0}, Lcom/nbcuni/nbc/thevoice/VideoSplash;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/VideoView;

    iput-object v0, p0, Lcom/nbcuni/nbc/thevoice/VideoSplash;->videoView:Landroid/widget/VideoView;

    .line 67
    invoke-virtual {p0}, Lcom/nbcuni/nbc/thevoice/VideoSplash;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, -0x3

    invoke-virtual {v0, v1}, Landroid/view/Window;->setFormat(I)V

    .line 69
    invoke-virtual {p0}, Lcom/nbcuni/nbc/thevoice/VideoSplash;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 70
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/VideoSplash;->videoView:Landroid/widget/VideoView;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "android.resource://"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/nbcuni/nbc/thevoice/VideoSplash;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const v2, 0x7f060001

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setVideoURI(Landroid/net/Uri;)V

    .line 71
    :cond_0
    invoke-virtual {p0}, Lcom/nbcuni/nbc/thevoice/VideoSplash;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 72
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/VideoSplash;->videoView:Landroid/widget/VideoView;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "android.resource://"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/nbcuni/nbc/thevoice/VideoSplash;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const v2, 0x7f060002

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setVideoURI(Landroid/net/Uri;)V

    .line 74
    :cond_1
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/VideoSplash;->videoView:Landroid/widget/VideoView;

    new-instance v1, Lcom/nbcuni/nbc/thevoice/VideoSplash$2;

    invoke-direct {v1, p0}, Lcom/nbcuni/nbc/thevoice/VideoSplash$2;-><init>(Lcom/nbcuni/nbc/thevoice/VideoSplash;)V

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 81
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/VideoSplash;->videoView:Landroid/widget/VideoView;

    new-instance v1, Lcom/nbcuni/nbc/thevoice/VideoSplash$3;

    invoke-direct {v1, p0}, Lcom/nbcuni/nbc/thevoice/VideoSplash$3;-><init>(Lcom/nbcuni/nbc/thevoice/VideoSplash;)V

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 100
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/VideoSplash;->videoView:Landroid/widget/VideoView;

    invoke-virtual {v0, p0}, Landroid/widget/VideoView;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 101
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/VideoSplash;->videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->requestFocus()Z

    .line 102
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/VideoSplash;->videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->start()V

    .line 104
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 105
    return-void
.end method

.method public onError(Landroid/media/MediaPlayer;II)Z
    .locals 5
    .param p1, "mp"    # Landroid/media/MediaPlayer;
    .param p2, "what"    # I
    .param p3, "extra"    # I

    .prologue
    .line 50
    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/VideoSplash;->videoView:Landroid/widget/VideoView;

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Landroid/widget/VideoView;->setVisibility(I)V

    .line 51
    const v3, 0x7f09005c

    invoke-virtual {p0, v3}, Lcom/nbcuni/nbc/thevoice/VideoSplash;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 52
    .local v0, "fLayout":Landroid/widget/FrameLayout;
    const v3, 0x7f020076

    invoke-virtual {v0, v3}, Landroid/widget/FrameLayout;->setBackgroundResource(I)V

    .line 53
    const v3, 0x7f09005e

    invoke-virtual {p0, v3}, Lcom/nbcuni/nbc/thevoice/VideoSplash;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 54
    .local v2, "imageView":Landroid/widget/ImageView;
    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 55
    const v3, 0x7f040006

    invoke-static {p0, v3}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    .line 56
    .local v1, "grow":Landroid/view/animation/Animation;
    invoke-virtual {v1, p0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 57
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 59
    const/4 v3, 0x1

    return v3
.end method
