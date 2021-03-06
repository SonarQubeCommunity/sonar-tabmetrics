/*
 * Tab Metrics
 * Copyright (C) 2012 excentia
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.codehaus.sonar.plugins.tabmetrics;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

/**
 * Tab Metrics Plugin Test
 */
public class TabMetricsPluginTest {

  @Test
  public void testGetExtensions() {
    TabMetricsPlugin plugin = new TabMetricsPlugin();

    assertEquals("All extensions of the plugin must be included", plugin.getExtensions(), Arrays.asList(TabMetricsPluginTab.class));
  }
}