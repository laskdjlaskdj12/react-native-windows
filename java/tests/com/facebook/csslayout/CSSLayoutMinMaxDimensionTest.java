/**
 * Copyright (c) 2014-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

 // @Generated by gentest/gentest.rb from gentest/fixtures/CSSLayoutMinMaxDimensionTest.html

package com.facebook.csslayout;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CSSLayoutMinMaxDimensionTest {
  @Test
  public void test_max_width() {
    final CSSNode root = new CSSNode();
    root.setWidth(100f);
    root.setHeight(100f);

    final CSSNode root_child0 = new CSSNode();
    root_child0.setMaxWidth(50f);
    root_child0.setHeight(10f);
    root.addChildAt(root_child0, 0);
    root.setDirection(CSSDirection.LTR);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

    root.setDirection(CSSDirection.RTL);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(50f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_max_height() {
    final CSSNode root = new CSSNode();
    root.setFlexDirection(CSSFlexDirection.ROW);
    root.setWidth(100f);
    root.setHeight(100f);

    final CSSNode root_child0 = new CSSNode();
    root_child0.setWidth(10f);
    root_child0.setMaxHeight(50f);
    root.addChildAt(root_child0, 0);
    root.setDirection(CSSDirection.LTR);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

    root.setDirection(CSSDirection.RTL);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(90f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_min_height() {
    final CSSNode root = new CSSNode();
    root.setWidth(100f);
    root.setHeight(100f);

    final CSSNode root_child0 = new CSSNode();
    root_child0.setFlexGrow(1f);
    root_child0.setMinHeight(60f);
    root.addChildAt(root_child0, 0);

    final CSSNode root_child1 = new CSSNode();
    root_child1.setFlexGrow(1f);
    root.addChildAt(root_child1, 1);
    root.setDirection(CSSDirection.LTR);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(80f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(80f, root_child1.getLayoutY(), 0.0f);
    assertEquals(100f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(20f, root_child1.getLayoutHeight(), 0.0f);

    root.setDirection(CSSDirection.RTL);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(80f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(80f, root_child1.getLayoutY(), 0.0f);
    assertEquals(100f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(20f, root_child1.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_min_width() {
    final CSSNode root = new CSSNode();
    root.setFlexDirection(CSSFlexDirection.ROW);
    root.setWidth(100f);
    root.setHeight(100f);

    final CSSNode root_child0 = new CSSNode();
    root_child0.setFlexGrow(1f);
    root_child0.setMinWidth(60f);
    root.addChildAt(root_child0, 0);

    final CSSNode root_child1 = new CSSNode();
    root_child1.setFlexGrow(1f);
    root.addChildAt(root_child1, 1);
    root.setDirection(CSSDirection.LTR);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(80f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(80f, root_child1.getLayoutX(), 0.0f);
    assertEquals(0f, root_child1.getLayoutY(), 0.0f);
    assertEquals(20f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(100f, root_child1.getLayoutHeight(), 0.0f);

    root.setDirection(CSSDirection.RTL);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(20f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(80f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(0f, root_child1.getLayoutY(), 0.0f);
    assertEquals(20f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(100f, root_child1.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_justify_content_min_max() {
    final CSSNode root = new CSSNode();
    root.setJustifyContent(CSSJustify.CENTER);
    root.setWidth(100f);
    root.setMinHeight(100f);
    root.setMaxHeight(200f);

    final CSSNode root_child0 = new CSSNode();
    root_child0.setWidth(60f);
    root_child0.setHeight(60f);
    root.addChildAt(root_child0, 0);
    root.setDirection(CSSDirection.LTR);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(20f, root_child0.getLayoutY(), 0.0f);
    assertEquals(60f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(60f, root_child0.getLayoutHeight(), 0.0f);

    root.setDirection(CSSDirection.RTL);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(40f, root_child0.getLayoutX(), 0.0f);
    assertEquals(20f, root_child0.getLayoutY(), 0.0f);
    assertEquals(60f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(60f, root_child0.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_align_items_min_max() {
    final CSSNode root = new CSSNode();
    root.setAlignItems(CSSAlign.CENTER);
    root.setMinWidth(100f);
    root.setMaxWidth(200f);
    root.setHeight(100f);

    final CSSNode root_child0 = new CSSNode();
    root_child0.setWidth(60f);
    root_child0.setHeight(60f);
    root.addChildAt(root_child0, 0);
    root.setDirection(CSSDirection.LTR);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(20f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(60f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(60f, root_child0.getLayoutHeight(), 0.0f);

    root.setDirection(CSSDirection.RTL);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(20f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(60f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(60f, root_child0.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_justify_content_overflow_min_max() {
    final CSSNode root = new CSSNode();
    root.setJustifyContent(CSSJustify.CENTER);
    root.setMinHeight(100f);
    root.setMaxHeight(110f);

    final CSSNode root_child0 = new CSSNode();
    root_child0.setWidth(50f);
    root_child0.setHeight(50f);
    root.addChildAt(root_child0, 0);

    final CSSNode root_child1 = new CSSNode();
    root_child1.setWidth(50f);
    root_child1.setHeight(50f);
    root.addChildAt(root_child1, 1);

    final CSSNode root_child2 = new CSSNode();
    root_child2.setWidth(50f);
    root_child2.setHeight(50f);
    root.addChildAt(root_child2, 2);
    root.setDirection(CSSDirection.LTR);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(50f, root.getLayoutWidth(), 0.0f);
    assertEquals(110f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(-20f, root_child0.getLayoutY(), 0.0f);
    assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(30f, root_child1.getLayoutY(), 0.0f);
    assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(50f, root_child1.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child2.getLayoutX(), 0.0f);
    assertEquals(80f, root_child2.getLayoutY(), 0.0f);
    assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
    assertEquals(50f, root_child2.getLayoutHeight(), 0.0f);

    root.setDirection(CSSDirection.RTL);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(50f, root.getLayoutWidth(), 0.0f);
    assertEquals(110f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(-20f, root_child0.getLayoutY(), 0.0f);
    assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(30f, root_child1.getLayoutY(), 0.0f);
    assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(50f, root_child1.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child2.getLayoutX(), 0.0f);
    assertEquals(80f, root_child2.getLayoutY(), 0.0f);
    assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
    assertEquals(50f, root_child2.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_flex_grow_within_max_width() {
    final CSSNode root = new CSSNode();
    root.setWidth(200f);
    root.setHeight(100f);

    final CSSNode root_child0 = new CSSNode();
    root_child0.setFlexDirection(CSSFlexDirection.ROW);
    root_child0.setMaxWidth(100f);
    root.addChildAt(root_child0, 0);

    final CSSNode root_child0_child0 = new CSSNode();
    root_child0_child0.setFlexGrow(1f);
    root_child0_child0.setHeight(20f);
    root_child0.addChildAt(root_child0_child0, 0);
    root.setDirection(CSSDirection.LTR);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(20f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(20f, root_child0_child0.getLayoutHeight(), 0.0f);

    root.setDirection(CSSDirection.RTL);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(100f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(20f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(20f, root_child0_child0.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_flex_grow_within_constrained_max_width() {
    final CSSNode root = new CSSNode();
    root.setWidth(200f);
    root.setHeight(100f);

    final CSSNode root_child0 = new CSSNode();
    root_child0.setFlexDirection(CSSFlexDirection.ROW);
    root_child0.setMaxWidth(300f);
    root.addChildAt(root_child0, 0);

    final CSSNode root_child0_child0 = new CSSNode();
    root_child0_child0.setFlexGrow(1f);
    root_child0_child0.setHeight(20f);
    root_child0.addChildAt(root_child0_child0, 0);
    root.setDirection(CSSDirection.LTR);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(200f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(20f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
    assertEquals(200f, root_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(20f, root_child0_child0.getLayoutHeight(), 0.0f);

    root.setDirection(CSSDirection.RTL);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(200f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(20f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
    assertEquals(200f, root_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(20f, root_child0_child0.getLayoutHeight(), 0.0f);
  }

}