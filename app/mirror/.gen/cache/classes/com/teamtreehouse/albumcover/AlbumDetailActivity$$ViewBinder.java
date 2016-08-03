// Generated code from Butter Knife. Do not modify!
package com.teamtreehouse.albumcover;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AlbumDetailActivity$$ViewBinder<T extends com.teamtreehouse.albumcover.AlbumDetailActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296258, "field 'albumArtView' and method 'onAlbumArtClick'");
    target.albumArtView = finder.castView(view, 2131296258, "field 'albumArtView'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onAlbumArtClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131296262, "field 'fab'");
    target.fab = finder.castView(view, 2131296262, "field 'fab'");
    view = finder.findRequiredView(source, 2131296259, "field 'titlePanel'");
    target.titlePanel = finder.castView(view, 2131296259, "field 'titlePanel'");
    view = finder.findRequiredView(source, 2131296263, "field 'trackPanel' and method 'onTrackPanelClicked'");
    target.trackPanel = finder.castView(view, 2131296263, "field 'trackPanel'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onTrackPanelClicked(p0);
        }
      });
    view = finder.findRequiredView(source, 2131296257, "field 'detailContainer'");
    target.detailContainer = finder.castView(view, 2131296257, "field 'detailContainer'");
  }

  @Override public void unbind(T target) {
    target.albumArtView = null;
    target.fab = null;
    target.titlePanel = null;
    target.trackPanel = null;
    target.detailContainer = null;
  }
}
