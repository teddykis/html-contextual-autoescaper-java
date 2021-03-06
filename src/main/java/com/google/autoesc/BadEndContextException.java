// Copyright (C) 2013 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.autoesc;

/**
 * Thrown when an escaping writer is closed when the output buffer does not
 * contain a complete document fragment, e.g. inside a tag.
 */
public class BadEndContextException extends TemplateException {

  private static final long serialVersionUID = 1L;

  /**
   * Uses a textual description of the context as a message.
   * @param context a bit-packed context
   */
  public BadEndContextException(int context) {
    this(Context.toString(context));
  }

  /** @see TemplateException#TemplateException(String) */
  public BadEndContextException(String msg) { super(msg); }

}
