import { TestBed } from '@angular/core/testing';

import { HttIntercepterBasicAuthService } from './htt-intercepter-basic-auth.service';

describe('HttIntercepterBasicAuthService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: HttIntercepterBasicAuthService = TestBed.get(HttIntercepterBasicAuthService);
    expect(service).toBeTruthy();
  });
});
