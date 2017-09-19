/*
 *
 * The MIT License (MIT)
 * Copyright (c) 2016 Microsoft Corporation
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *  
 */

package java.com.microsoft.azure.documentdb.changefeedprocessor;

import java.time.Instant;

/**
 * Specifies the frequency of lease event. The event will trigger when either of conditions is satisfied.
 */
public class CheckpointFrequency {

    private int _processedDocumentCount;

    private Instant _timeInterval;

    public CheckpointFrequency(){

    }

    public int getProcessedDocumentCount() {
        return _processedDocumentCount;
    }

    public void setProcessedDocumentCount(int _processedDocumentCount) {
        this._processedDocumentCount = _processedDocumentCount;
    }

    public Instant getTimeInterval() {
        return _timeInterval;
    }

    public void setTimeInterval(Instant _timeInterval) {
        this._timeInterval = _timeInterval;
    }
}